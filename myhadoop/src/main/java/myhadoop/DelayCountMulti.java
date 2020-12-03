package myhadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.MultipleOutputs;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import myhadoop.mappers.DelayCountMapperMulti;
import myhadoop.reducer.DelayCountReducerMulti;

public class DelayCountMulti {

	public static void main(String[] args) throws Exception{
		// 매개변수 확인
		if (args.length != 2) {
			System.err.println("Usage: DelayCountMulti <input> <output>");
			System.exit(2);
		}
		
		// 설정 정보 필요
		Configuration conf = new Configuration();
		
		// output 경로가 이미 있으면 지워주자
		FileSystem hdfs = FileSystem.get(conf);
		// output 경로 확인
		Path outPath = new Path(args[1]); // 출력 경로
		if (hdfs.exists(outPath)) {
			// 있으면 지우자
			hdfs.delete(outPath, true);
		}
		
		// Job 설정
		Job job = Job.getInstance(conf, "DelayCountMulti");
		
		// 입출력 경로 설정
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		// 잡클래스, 매퍼, 리듀서 등록
		job.setJarByClass(DelayCountMulti.class);
		job.setMapperClass(DelayCountMapperMulti.class);
		job.setReducerClass(DelayCountReducerMulti.class);
		
		// 입출력 데이터 포맷
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// 출력 키, 값 타입 설정
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 명령된 출력 경로를 등록
		MultipleOutputs.addNamedOutput(job, 
									   "departure", // 출력 경로의 이름 
									   TextOutputFormat.class, // 출력의 형식 
									   Text.class,  
									   IntWritable.class);
		MultipleOutputs.addNamedOutput(job, 
									   "arrival", 
									   TextOutputFormat.class, 
									   Text.class, 
									   IntWritable.class);
		
		// 실행
		job.waitForCompletion(true);
	}

}
