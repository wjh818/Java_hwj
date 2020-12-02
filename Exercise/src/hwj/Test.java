package hwj;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
//		int[] score = {80, 90, 70};
//		System.out.println(score[1]);
//		
//		score[1] = 100;
//		System.out.println(score[1]);
//		
//		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum += score[i];
//		}
//		
//		System.out.println("총점: " + sum);
//		
//		
////		String[] person;
////		person = {"hwj", "hwj2"};    //안됨
//		
//		String[] person;
//		person = new String[] {"hwj", "hwj2"};
//		
//		System.out.println(person[0]);
//		
//		String person2 = add( new String[] {"hwj3", "hwwj4"} );
		
		
//문제01)	배열에서 최대/최소
//		int[] score = {79, 88, 91, 33, 100, 55, 95};
//
//		int max = 0;
//		int min = 100;
//		for (int i = 0; i < score.length; i++) {
//			if(score[i] > max) {
//				max = score[i];
//			} else if(score[i] < min) {
//				min = score[i];
//			}
//		} System.out.println(max);
//		System.out.println(min);

		
//백준 10818)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("개수 입력: ");
//		int n = sc.nextInt();
//		
//		int[] arr = new int[n];
//		int min = 1000000;
//		int max = -1000000;
//		System.out.println("입력한 갯수만큼 숫자 입력: ");
//		
//		for (int i = 0; i < n; i++) {
//			arr[i] = sc.nextInt();
////			System.out.print(arr[i] + " ");
//			if(arr[i] > max) {
//				max = arr[i];
//			} else if(arr[i] < min) {
//				min = arr[i];
//			}
//		}  System.out.println(min + " " + max);

		
//백준 2562)
//		int max = 1;
//		int index = 0;
//		int[] arr = {100, 67, 19, 7};
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		} System.out.println("---------");
//	
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				index = i+1;
//			}
//
//		} System.out.println("최대값: " + max);
//		
//		System.out.println(index);

		
//정올555)
//		Scanner sc = new Scanner(System.in);
//		
//		String arr = new String();
//		System.out.println("입력하세요: ");
//		
//		arr = sc.nextLine();
//		
//		for(int i=0;i<20;i+=2) {
//			System.out.printf("%c", arr.charAt(i));
//		}

		
//정올557)
//	    Scanner sc = new Scanner(System.in);
//	    
//	    String[] arr = new String[10];
//	    System.out.println("입력하세요: ");
//	    
//	    for (int j = 0; j < arr.length; j++) {
//	    	arr[j] = sc.nextLine();
//		} 
//	    System.out.println(arr[0] + " " + arr[3] + " " + arr[6]);

		
//		String arr[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		

//정올559)
//		double score [] = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("입력: ");
//		int i = sc.nextInt();
//		int j = sc.nextInt();
//		
//		System.out.print(score[i-1] + " " + score[j-1]);
//		System.out.println();
//		
//		double sum = score[i-1] + score[j-1];
//		System.out.printf("%.1f", sum);
		
		
//정올561)
//		int arr[] = {88, 123, 659, 15, 443, 1, 99, 313, 105, 48};
//		
//		int min = 100;
//		int max = 0;
//				
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]>=min && arr[i]<9999) {
//				min = arr[i];
//			} else if(arr[i]>max && arr[i]<100) {
//				max = arr[i];
//			} 
//			
//			if(max >= 100) {
//				max = 100;
//			}
//			if(min <= 100) {
//				min = 100;
//			}
//		} System.out.print(max + " " + min);
		
		
//정올 550)
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for (int i = 0; i < num*2; i++) {
//			if(i<num) {
//				for (int j = 0; j < num-i; j++) {
//					System.out.print("* ");
//				} System.out.println();
//			} else {
//				for (int j = 0; j < i-(num-1); j++) {
//					System.out.print("* ");
//				} System.out.println();
//			}
//		}

		
//정올 144)
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4-i*2; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i*2+1; j++) {
//				System.out.print("*");
//			} System.out.println();
//		}
		
		
//백준 10871)
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		
//		int[] A = new int[N];
//		
//		
//		System.out.println("숫자를 입력하세요: ");
//		for (int i = 0; i < A.length; i++) {
//			A[i] = sc.nextInt();
//		}
//		
//		
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] < X) {
//				System.out.print(A[i] + " ");
//			}
//		}
		
		
//백준 1110)
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요: ");
//		int num = scanner.nextInt();
////		System.out.printf("%02d", num);
////		System.out.println();
//
////		int c = num / 10 + num % 10; //각 자리수 합
////		System.out.printf("%02d", c);
//		
//		 //num 마지막 수 + 더한거 마지막 수
//		
//		int count = 0;
//		int copy = num;
//		
//		while(true) {
//			num = (num % 10)*10 + (num / 10 + num % 10)%10;
//			count++;
//			
//			if(copy == num) {
//				break;
//			}
//		}
//		System.out.print("횟수: " + count);
		
		
//백준14681)
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x>0) {
			if(y>0) {
				System.out.println(1);
			} else {
				System.out.println(4);
			}
		} else {
			if (y>0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

