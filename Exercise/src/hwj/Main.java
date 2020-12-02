package hwj;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


//class Apple{
//	void f1() {
//		System.out.println(10);
//		
//		//객체를 하나 만들어서 사용 -> a 있으니까 계속 사용할 수 있음
//		Apple a = new Apple();
//		a.f1();
//		
//		//만들고 쓰고를 한번에 -> 한번만 쓰고 말때
//		new Apple().f1();
//	}
//}

public class Main {

	public static void main(String[] args) {

//EX01
//		System.out.println(); //(단축키) sysout 치고 Ctrl+space바
		
		
//EX02
//		System.out.println(10); //실행키: Ctrl+F11 , 이동: Alt + 방향키 , 복사: Ctrl + Alt + 방향키
		// byte(1),short(2):양수,음수 모두 가능,char(2):양수만 가능,int(4),long(8),float(4),double(8),boolean(1)
		
		
//EX03
//		int a = 10; 
//		Integer b = 10; //클래스(Integer라는 클래스 애초에 존재함)
//		b.byteValue(); //클래스에 점 찍으면 쓸수있는 메소드 나옴
		
		
//EX04 (for문은 봤을 때 몇번 반복되는지 눈에 딱 보임)
//		for (int i = 0; i < 10; i++) { //for문 형식1 
//			System.out.println(i);
//		}
		
//		for (int i = 1; i <= 10; i++) { //for문 형식2
//			System.out.println(i);
//		}
		
//		for (int i = -5; i <= 5; i++) { //for문 형식3
//			System.out.println(i);
//		}
		
		
//EX05
		//구구단 5단 출력하기-> for문 사용(반복 횟수를 아니까)
//		for (int i = 0; i < 10; i++) {
//			System.out.println(5 + " * " + i + " = " + 5*i);
//		}
		
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("5 * %d = %d\n", i, 5*i);
//		}
		
		
//EX06
//		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		}

//		int sum1 = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum1 = sum1 + i;
//		}
//		System.out.println(sum1);

		
//EX07    입력받기 
//줄 맞추는 방법: 블록 잡고 Ctrl + i
		//방법1.
//		Scanner scanner = new Scanner( System.in );
//		System.out.println(1);
//		int num = scanner.nextInt();
//		System.out.println(2);
//		System.out.println(num);
		
		//방법2.
//		int num = (new Scanner( System.in )).nextInt();
//		System.out.println(num);
		
		//방법3.
//		System.out.println((new Scanner( System.in )).nextInt());
		
		//원하는 구구단 출력하기
//		System.out.println("단을 입력하세요: ");
//		
//		int dan = (new Scanner(System.in)).nextInt();
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(dan + " * " + i + " = " + dan*i);
//		}
	
		
//EX08
		//키보드로부터 숫자를 하나 입력받아서 입력 받은 숫자까지의 합을 구해라. EX)입력:10 결과:55
//		System.out.println("숫자를 입력하세요: ");
//		
//		int num = (new Scanner(System.in)).nextInt();
//		System.out.println(num);
//		
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		
//		System.out.println("결과: " + sum);
		
		
//EX09
//		int a = 3, b;
//		b = a++;
//		System.out.println(a + " " + b);
		//a++: 대입증가(대입하고 나서 증가시킴) -> 출력하고 더함
		
//		int c = 3, d;
//		d = ++c;
//		System.out.println(c + " " + d);
		//++c: 증가대입(증가하고 나서 대입) -> 더하고나서 출력
		
		
//EX10
		//i가 짝수일때는 호랑이, i가 홀수일때는 코끼리를 출력
//		for (int i = 1; i <= 20; i++) {
//			if( i % 2 == 0) {
//				System.out.println("호랑이");
//			} else {
//				System.out.println("코끼리");
//			}
//		}
		
		//if-else문장은 반드시 삼항연산이 되는지 확인하자
		//삼항연산: (조건문) ? 참일때 : 거짓일때
//		for (int i = 1; i <= 20; i++) {
//			System.out.println(( i % 2 == 0) ? "호랑이" : "독수리");
//		}
		
//		int a = 10;
//		if (3 > 2) {
//			a = a + 1;
//		}else {
//			a = a - 1;
//		}
//		
//		a = (3 > 2) ? a+1 : a-1;
		
		
//EX11
		//3의 4승을 구해라
//		int sum = 1;
//		for (int i = 1; i <= 4 ; i++) {
//			sum = sum * 3;
//		}
//		
//		System.out.println("3^4 = " + sum);
		
		//6!을 구해라
//		int num = 1;
//		for (int i = 1; i <= 6; i++) {
//			num = num * i;
//		}
//		
//		System.out.println("6! = " + num);
		
//		int sum = 1;
//		for (int i = 0; i < 6; i++) {
//			sum = sum * (i + 1);
//		}
//		
//		System.out.println("6! = " + sum);
		
		
//EX12)
		//교환 프로그램, 스왑 프로그램
//		int a = 10, b = 20;
//		int temp;
//		System.out.println(a + " " + b);
//		
//		temp = a; //temp=10
//		a = b; //a=20
//		b = temp; //b=10
//		System.out.println(a + " " + b);
		
		
//EX13)
//		Random rnd = new Random();
//		int r = rnd.nextInt(100); //nextInt(100): 랜덤하게 나오는 숫자의 범위 0~99
//		System.out.println(r);
//
//		System.out.println(rnd.nextInt(100));
//		System.out.println("--------------------");
//		for (int i = 1; i <= 10; i++) {
//			r = rnd.nextInt(100);
//			System.out.println(r);
//		}
//		System.out.println("--------------------");
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(rnd.nextInt(100));
//		}
		
		
//EX14)
//		for (int i = 0; i < 10; i++) {
//			System.out.print(i + " ");
//		} System.out.println();
//
//		System.out.println("호랑이");
//			
//		for (int i = 0; i < 10; i++) {
//			System.out.printf("%02d ", i); //두자리를 유지하고 비어있는 자리는 0으로 채워라
////			System.out.printf("%03d ", i);
//		} System.out.println();
//		
//		//예제1.
//		long a = 0, b = 1, c;
//		for (int i = 0; i < 10; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//			System.out.print(c + " ");
//		} System.out.println();
		
		//예제2.
//		Random rnd = new Random();
//		for (int i = 1; i <= 10; i++) {
//			int r = rnd.nextInt(100);
//			int a = r / 10;
//			int b = r % 10;			
//			System.out.printf("%02d >> 결과 %02d \n", r, (a+b));
//		}
		
		//예제3.
//		Random rnd = new Random();
//		int r = 0, a = 0, b = 0, c = 0, d = 0;
//		for (int i = 1; i <= 10; i++) {
//			r = rnd.nextInt(100);
//			a = r / 10;
//			b = r % 10;
//			c += a;
//			d += b;
//			
//			System.out.printf("%02d", r);
//			System.out.println();
//		}
//			
//		System.out.println("결과: " + c + " "+ d );

		
		//예제4. -> 5개가 랜덤하게 나온다 (100-999) 조건 1. 중복되는 숫자 X 2. 반드시 5개가 출력되어야 한다 3. 배열을 사용하지 않는다
		//for문을 사용한 조건 필터링
//		Random rnd = new Random();
//
//		for (int i = 0; i < 10; i++) {
//			int r = rnd.nextInt(900) + 100;//100부터 999까지 출력되는 코드
//			//r = 333;//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석
//			//System.out.println(r);
//
//			int a = r/100;			//100자리 숫자값
//			int b = (r%100)/10;  	//증간숫자값
//			int c = ((r%100)%10);	//나머지의 나머지이기때문에 1의 자릿수
//			//System.out.println(a + " " + b + " " + c);	//확인
//
//			if (a == b || b == c || a == c) {
//				//System.out.println("호랑이");//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석
//				i--;      //5개 까지는 다 출력이 된다 성립은 되지만 위험하다
//				continue;
//
//			}
//			System.out.println(r);
//
//		}
		
		//while문을 사용한 조건 필터링
//		Random rnd = new Random();
//		int count = 0;   //count대신 ct라고 적기도한다
		
//		while(true) {			//반복의 수를 모를경우 while문을 사용하는것이 좋다
//			int r = rnd.nextInt(900) + 100;//100부터 999까지 출력되는 코드
//			//r = 333; //test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석
//			//System.out.println(r);
//
//			int a = r/100;	//100자리 숫자값
//			int t = r%100;	//t의 값을 정해주면서 다음 연산의 빠르기를 높일수 있다
//			int b = t/10;  	//증간숫자값
//			int c = t%10;	//나머지의 나머지이기때문에 1의 자릿수
//			//System.out.println(a + " " + b + " " + c);	//확인
//
//			if (a == b || b == c || a == c) {
//				//System.out.println("호랑이");//test용으로 강제 대입을 시켜준다 그다음 가장 마지막에 주석
//				continue;
//
//			}
//			System.out.println(r);
//			//count++ --> 증가를 시켜주고 if조건문을 걸어주는것 보다는 조건절안에 ++count로 증가시켜주는것이 더 편하다
//			if(++count == 5) {					//++count 자기자신을 먼저 올리고 조건을 걸어주는 제어문
//				break;
//			}
//		}
		
		
//EX15)
//		System.out.println(Integer.MAX_VALUE); //integer가 갖는 최대값
//		System.out.println(Short.MAX_VALUE); //short가 갖는 최대값
//		System.out.println(Double.MAX_VALUE); //double이 갖는 최대값
//			
//		Random rnd = new Random();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(rnd.nextInt(Integer.MAX_VALUE));
//		}
		
		//예제1. -> 랜덤한 Integer.MAX_VALUE 값 받아서 각 자리 수의 합을 구해라
//		Random rnd = new Random();
//		int num = rnd.nextInt(Integer.MAX_VALUE);
//		System.out.println("출력 값: " + num);
//		
//		int sum = 0;
//		while(num != 0) {
//			sum += num % 10;
//			num /= 10;
//			//System.out.println(num / 10);
//		}
//		
//		System.out.println("각 자리 수의 합: " + sum);
	
		
//EX16)
		//final을 붙일 수 있는 경우
		//1. member변수(필드) 앞에 붙일 수 있다.
		// 		-> member변수 앞에 final을 붙이면 그 변수는 상수라고 부른다 (*대입을 받지 못하는 것들 = 상수)
		//2. class 앞에 붙일 수 있다.
		//		-> 이 class는 앞으로 더이상 상속 받을 수 없다는 것을 의미 (더이상 부모class가 될 수 없음)
		//3. 메소드 앞에 붙일 수 있다 
		
//		class Tiger {}
//		class Lion extends Tiger{} //상속 (부모=Tiger, 자식=Lion)
//		
//		final class Tiger2 {}
//		class Lion extends Tiger2{} -----------(x) 상속 불가능
		
		
		//overriding 할 수 없는 경우
//		class Tiger {
//			
//		}
//		
//		class Lion extends Tiger {
//			void f1() {}
//		} //부모 이름과 똑같은 함수이름으로 함수를 만드는 것: overriding
		
		
		
//EX17)
		//O,X가 나온 횟수와 O,X가 연속해서 나온 횟수를 각각 구해라
//		Random rnd = new Random();
//		
//		int count = 0;
//		
//		for (int i = 0; i < 10; i++) {
//			int num = rnd.nextInt(2);
//			//System.out.println(num);
//			
//			if(num == 0) {
//				System.out.print("O ");	
//			} else {
//				System.out.print("X ");
//				count += num;
//			}
//		}
//		
//		System.out.println();
//		System.out.println("O : " + (10 - count));
//		System.out.println("X : " + count);
		
		
//EX18)
//		class Apple {
//			void f1() {
//				System.out.println("호랑이");
//			}
//			void f2() {
//				System.out.println(this);
//			}
//			int f3() {
//				return 100;
//			}
//			String f4() {
//				return "호랑이";
//			}
//			Apple f5() {
//				return this;
//			}
//			void pretty() {
//				System.out.println("프리티");
//			}
//		}
//	
//	
//		Apple a1 = new Apple();  // 객체 생성
//		Apple a2 = new Apple();
//		Apple a3 = new Apple();
//		
//		System.out.println(a1);
//		System.out.println(a2);
//		
//		System.out.println(a2.hashCode());
//		System.out.println(Integer.toHexString(a2.hashCode())); // 16진수 변환, 위에 코드와 동일, 민증번호 확인
//	
//		a1.f1();
//		a2.f1();
//		
//		a1.f2();
//		a2.f2();
//		a3.f2();
//		
//		a3.f5().f1();
//		a3.f5().f5().f1();
//		a3.f5().pretty();
		
		
//EX19)
//		class Tiger {
//			//생성자 함수
//			//1) 생성자의 이름은 반드시 클래스 이름과 동일해야한다
//			Tiger() {
//				System.out.println(1);
//			}
//			//2) 생성자 함수도 함수이기 때문에 함수 오버로딩을 할 수 있다 (변수의 개수가 다르던가, 개수가 같으면 타입이 다르던가)
//			Tiger(int a) {
//				System.out.println(2);
//			}
//			Tiger(int a, int b) {
//				System.out.println(3);
//			}
//			Tiger(int a, String b, Tiger c) {
//				System.out.println(4);
//			}
//			/*
//			Tiger(int a, b) {
//			    !!!!!!!!!!!!!!잘못 적는 예!!!!!!!!!!!!!!!
//			}
//			*/
//			Tiger(float a) {
//				System.out.println(5);
//			}
//			Tiger(short a) {
//				System.out.println(6);
//			}
//			//3) 생성자 함수는 프로그래머가 임의로 호출 할 수 없다
//			//4) 생성자 함수는 객체가 생생될 때 자동호출 된다
//			
//			
//			//멤버 변수, 필드
//			//멤버 함수, 메소드
//		}
//	
//		Tiger t1 = new Tiger(); //객체를 생성시키는 가장 기본 문법
//		//return 10; //오류 - 생성자 함수는 return 값을 가질 수 없음
//		//t1.Tiger(); //오류 - 생성자 함수는 무조건 new와 동반해서 자동호출 되어야함
//		Tiger t2 = new Tiger((int)10); //두번째 생성자 call
//		Tiger t3 = new Tiger(10, 20); //세번째 생성자 call
//		Tiger t4 = new Tiger(10, "호랑이", null); //네번째 생성자 call, 객체를 쓰고 싶은데 쓸 객체가 없으면 null이라고 쓰면됨
//		Tiger t5 = new Tiger(3.14f); //다섯번째 생성자 call, float형은 뒤에 f 붙이기(double형은 뒤에 아무것도 안붙임)
//		Tiger t6 = new Tiger((short)100); //결과값: 2 -> 100이 int/short 중 뭘 말하는건지 몰라서 컴퓨터 마음대로 해석 
//														//	-> (int), (short) 이렇게 명확하게 표시해주기 = "타입 캐스팅"
//		
//		Tiger t7 = new Tiger();
//		
//		int x = 10, y = 20;
//		Tiger t8 = new Tiger(x, y); //세번째 생성자 call
//		
//		String s1 = new String("코끼리");
//		Tiger t9 = new Tiger(x*y, s1, t7); //네번째 생성자 call
//		Tiger t10 = new Tiger(x*y, s1, new Tiger()); //중간에 대입연산자 생략
		
		
		
//		System.out.println("----------연습------------");
		
//		class Lion {
//			Lion() {
//				System.out.println(1);
//			}
//			Lion(int a) {
//				System.out.println(2);
//			}
//			Lion(int a, int b) {
//				System.out.println(3);
//			}
//			Lion(int a, String b, Lion c) {
//				System.out.println(4);
//			}
//			Lion(float a) {
//				System.out.println(5);
//			}
//			Lion(double a) {
//				System.out.println(6);
//			}
//			Lion(short a) {
//				System.out.println(7);
//
//			}
//		}
//		
//		Lion l1 = new Lion();
//		Lion l2 = new Lion(5); //더 정확하게는 Lion l2 = new Lion((int)5);
//		Lion l3 = new Lion(5, 10);
//		Lion l4 = new Lion(5, "사자", null);
//		Lion l5 = new Lion(5.5f);
//		Lion l6 = new Lion(5.5); //double형은 숫자 뒤에 아무것도 안붙인다
//		Lion l7 = new Lion((short)5);
//		
//		Lion l8 = new Lion();
//		
//		int num1 = 10, num2 = 20;
//		String st1 = "라이언";
//		Lion l9 = new Lion(num1, num2); //세번째 생성자 call
//		Lion l10 = new Lion(num1*num2, st1, l8); //네번째 생성자 call
//		Lion l11 = new Lion(num1*num2, st1, new Lion()); //결과값 두개 나옴(Lion l8 = new Lion(); 값 하나랑, l11 값 하나랑)
		
		
		
//EX20)
//		class Tiger {
//			//변수는 일반적으로 생성자 위에 작성
//			int a; 
//			String b;
//			int c = 20;
//			String d = "호랑이";
//			String e = new String("코끼리");
//			
//			//디폴트 생성자: 인수 전달이 없는 생성자
//			//생성자: 멤버 변수를 전부 초기화 하는 목적으로 사용됨
//			Tiger() {
//				a = 100;
//				b = "독수리";
//				c = 200;
//				d = "앵무새";
//				e = "날파리";
//			}
//		}
//		
//		Tiger t1 = new Tiger();
//		System.out.println(t1.a); //인수를 전달 받는 생성자가 없으니까 결과가 null로 나옴
//		System.out.println(t1.b); //변수에 아무 값도 안 넣어 놓으니까 null로 나옴
//		System.out.println(t1.c);
//		System.out.println(t1.d);
//		System.out.println(t1.e);
		
		
		
//EX21)
//		class Tiger {
//			int x = 100, y = 100;
//			
//			Tiger() {
//				
//			}
//			Tiger(int a, int b) {
//				x = a; //x는 필드, a는 생성자에서 전달받은 인수
//				y = b; 
//			}
//			Tiger(int a) {
//				x = y = a; 
//			}
//		}
//		
//		//t1, t2는 같은 설계도(class)를 보고 만들었을 뿐 전혀 다른것 -연료 디폴트로(100,100으로)
//		Tiger t1 = new Tiger();
//		System.out.println(t1.x + " " + t1.y);
//	
//		Tiger t2 = new Tiger();
//		System.out.println(t2.x + " " + t2.y);
//		
//		//같은 설계도를 보긴 했지만 연료 200,300짜리
//		Tiger t3 = new Tiger(200, 300);
//		System.out.println(t3.x + " " + t3.y);
//		
//		//같은 설계도를 보긴 했지만 연료 500,600짜리
//		Tiger t4 = new Tiger(500, 600);
//		System.out.println(t4.x + " " + t4.y);
//		
//		Tiger t5 = new Tiger(700);
//		System.out.println(t5.x + " " + t5.y);
		

		
//		class Apple {
//			//디폴트 생성자는 무조건 만들어 주자
//			Apple() {
//				
//			}
//		
//			Apple(int a) {
//				
//			}
//		}
//		
//		Apple a1 = new Apple();
//		Apple a2 = new Apple(10);
		
		
		
//EX22)
//		class Apple {
//			//필드
//			
//			//생성자
//			Apple() {
//				
//			}
		
//			//메소드
//			//유형1.
//			// void func01() : 함수 원형 -> func01과 func02 원형은 다름
//			void func01() { 
//				System.out.println(1);
//			}
//			//유형2.
//			void func02(int a) {
//				System.out.println(a);	//내가 쓴 숫자를 호출해라
//			} 
//			//유형3. 부른 사람에게 다시 돌려줄 때 -> return 반드시 있어야함
//			int func03() {
//				return 200;
//			}
			//유형4.
//			int func04(int a) {
//				return (a * 7); //무슨 숫자를 던지면 거기에 x7한 값을 결과로 보여주겠다
//			}
// 		}
//		
//		Apple a1 = new Apple();
//		a1.func01(); //함수 1번 호출
//		
//		a1.func02(100); //함수 2번 호출
//		
//		//함수 유형3을 사용하는 방법(1)
//		int num = a1.func03();
//		System.out.println(num);
//		//함수 유형3을 사용하는 방법(2)
//		int count;
//		count = a1.func03();
//		System.out.println(count);
//		//함수 유형3을 사용하는 방법(3)
//		System.out.println(a1.func03());
//		//함수 유형3 활용
//		System.out.println(a1.func03() * 100);
//		System.out.println(a1.func03() * a1.func03());
//		
//		System.out.println(a1.func01();); //오류 - return이 없을 땐 사용 불가
//		
//		//함수 유형4을 사용하는 방법(1)
//		int x = a1.func04(7);
//		System.out.println(x);
//		//함수 유형4을 사용하는 방법(2)
//		int y;
//		y = a1.func04(8);
//		System.out.println(y);
//		//함수 유형4을 사용하는 방법(3)
//		System.out.println(a1.func04(9));
		
		
//EX23) ~ 26)		
//		class Apple {
//			Apple() {
//
//			}
//			
//			void func01() {
//				System.out.println(1);
//			}
//			void func02(int a) {
//				System.out.println(a);
//			}
//			int func03() {
//				return 100;
//			}
//			int func04(int a) {
//				return a;
//			}			
//			void func05(int a, int b) {
//				System.out.println(5);
//			}
//			void func06(int a, int b, int c) {
//				System.out.println(a * b + c);
//			}
//			void func07(int count, String s) {
//				for (int i = 0; i < count; i++) {
//					System.out.println(s);
//				}
//			}
//			void func08() {
//				System.out.println(8);
//				func01(); //함수 안에서 자기 멤버 함수를 호출 할 수 있다
//				func09(); //자기보다 아래에 있던 위에 있던 찾아서 호출 할 수 있음
//			}
//			void func09() {
//				System.out.println(9);
////				func08(); //서로가 서로를 호출하면 빠져나올 수 없게 됨(8번이 9번 부르고, 9번도 8번 부르고)
//			}		
//			void func10() {
//				System.out.println(88);
//			}
//			void func10(int a) { //오버로딩
//				System.out.println(99);
//			}
//			void func10(int a, int b) { //오버로딩
//				System.out.println(a + b);
//			}
//			int func11(int a, int b) {
//				int c = a * a + b * b;
//				return c;
//			}
//			void func12(int num) {
//				if(num > 0) {
//					if(num % 2 == 0) {
//						System.out.println("짝수입니다");
//					} else {
//						System.out.println("홀수입니다");
//					}  
//				} else {
//					System.out.println("음수는 입력할 수 없습니다.");
//				}
//			}
//			void func13(int num) {
//				if(num < 0) {
//					System.out.println("음수는 입력할 수 없습니다");
//					if(num % 2 == 0) {
//						System.out.println("짝수입니다");
//					} else {
//						System.out.println("홀수입니다");
//					} 
//				} return;
//			}
//			void func14(int num) {
//				if(num % 2 == 0) {
//					System.out.println("짝수입니다");
//					return;
//				} else {
//					System.out.println("홀수입니다");
//				} 
//				System.out.println("호랑이");
//			}
//			void func15(int num) {
//				if(num != 1234) {
//					System.out.println("PW가 맞지 않습니다");
//					return;
//				} System.out.println("접속을 시도합니다.");
//			}
//			int func16(int num) {
//				if(num % 2 == 0) {
//					return num * 2;
//				} else {
//					return num / 2;
//				}
//			}		
//		}
//
//		Apple a1 = new Apple();
//		
//		a1.func05(10, 20);
//		a1.func06(5, 10, 15);
//		a1.func07(14, "코끼리");
//		a1.func08(); //자기껏도 호출하면서 함수 1번도 호출
//		a1.func09();
//		a1.func10();
//		a1.func10(1);
//		a1.func10(10, 20);
//		
//		int num = a1.func11(4, 5);
//		System.out.println(num);
//		
//		int num2;
//		num2 = a1.func11(4, 5);
//		System.out.println(num2);
//		
//		System.out.println(a1.func11(4, 5));
//		
//		a1.func12(12);
//		a1.func12(-11);
//		a1.func13(-10);
//		a1.func15(3333);
		
		
//EX27)		문자열과 숫자 치환
//		int num = 100;
//		String s = Integer.toString(num);
//		System.out.println(s);
//		System.out.println(s + 100); //숫자와 문자열이 만나면 둘다 문자열 취급 이라 연산 안됨 
//		
//		String t = "777";
//		int a = Integer.parseInt(t);  //문자열을 숫자로 치환 
//		System.out.println(a + 100);  
//		 
//		String s1 = num + "";        //정석은 아니고 이런식으로도 치환시킬수 있다 = sugar code
//		System.out.println(s1);
//		
//		//정규편식 = 암호인것처럼보이는 코드 
		
		
//EX28)
//		int a = 10;   	//10진수
//		int b = 0x10;	//16진수
//		System.out.println(a +"   "+ b);
//		
//		int c = 00010;
//		System.out.println(c);
//		
//		int d = 0376;
//		System.out.println(d);
//		
//		//int e = 0386;
//		//자바에서는 맨 앞의 숫자가 0으로 시작하면 뒤의 값이 8진수로 시작한다 
		
		
//EX29)		부동소수
//		float sum = 0.0f;
//		for (int i = 0; i < 100; i++) {
//			sum += 0.1f;
//		}
//		System.out.println(sum);
//		//결과값이 미세하게 바뀐다 
//		
//		if (sum == 10.0f) {
//			System.err.println("호랑이"); //호랑이 출력이 안되는 이유가 부동소수 때문
//		}
//		//부동소수는 등가연산에 사용하지 않는다 BUT 대소관계는 상관 없다 
		
		
//EX30)
//		//둘중에 더 큰 숫자를 출력
//		System.out.println(Math.max(10, 20));      
//		 /*public static int max(int a, int b) {
//		        return (a >= b) ? a : b;
//		    }*/
//
//		//class 안에 class는 사용이 불가 하기때문에 제일 위로 올려야 한다 
//		Apple a1 = new Apple();      
//		a1.f1();
//		Apple.f2(); 			//객체를 생성시키지 않아도 메모리가 존재하기 떄문에 바로 사용 가능 			
//		a1.f2();				//static은 new를 사용하지 않아도 바로 사용할 수 있지만, 메모리를 많이 차치하는 단점 (처음부터 만들어 놓고 사용하기떄문) 
//		
//		
//		//Integer 함수 뒤는 static

		
//EX31)
//		System.out.println("------------");
//		System.out.println(Math.max(10, 20));
//		System.out.println(Math.min(10, 20));
//		System.out.println(Math.abs(-7));		//절댓값
//		System.out.println(Math.pow(3, 4));		//3의 4승
//		System.out.println(Math.sqrt(8));		//루트 8
//		double s = Math.sqrt(8);
//		System.out.println(s * s);				//소수점 연산은 정확한 값이 나오지 않는다 
		
		
//EX32)
//		Random rnd = new Random();
//		int r = rnd.nextInt(100);
//		System.out.println(r);
//		
//		int num1 = r /10;
//		int num2 = r % 10;
//		
//		if(num1 % 2 == 0 && num2 % 2 == 0) {
//			System.out.println("탕수육");
//		} else if (num1 % 2 == 0 && num2 % 2 != 0){
//			System.out.println("냉면");
//		} else if (num1 % 2 != 0 && num2 % 2 == 0) {
//			System.out.println("짜장");
//		} else {
//			System.out.println("우동");
//		}
		
		
//EX33)
//		int a = 0;
//		while(a < 10) {
//			a += 1;
//			System.out.println(a);
//		}
//		System.out.println("호랑이");
		
//		int a = 0;
//		while(a < 10) {
//			a += 1;	//자바에서는 a++
//			if(a == 3) {
//				continue;
//			}
//			if(a == 6) {
//				break;
//			}
//			System.out.println(a);
//		}
//		System.out.println("호랑이");
		
//		int a = 0;
//		while(true) {
//			a += 1;
//			System.out.println("프로그램을 종료합니다");
//			if (1 == 5) {
//				break;
//				//System.out.println("코끼리");
//			}
//			System.out.println("Looping");
//		}
//		System.out.println("종료");
		
		//우박수
//		int num = 23;
//		
//		while(true) {
//			System.out.println(num);
//			
//			if(num % 2 == 0) {
//				num /= 2;
//			}else {
//				num = num * 3 + 1;
//			}
//
//			if(num == 1) {
//				break;
//			} else {
//				continue;
//			}
//		}
		
		//우박수 삼항연산자ver.
//		int num = 23;
//		
//		while(true) {
//			System.out.println(num);
//			
//			num = (num % 2 == 0) ? (num / 2) : (num * 3 + 1);
//			System.out.println(num);
//				
//			if(num == 1) {
//				break;
//			} else {
//				continue;
//			}
//		}

		
//EX34) 이중 for문
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(i + " " + j);
//			}
//		}
		
		//예제. 박스 형태로 출력하기
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.print("[" + i + " " + j + "]");
//			} System.out.println(); //4번 돌고 줄바꿈
//		}
		
//		int k = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ",k);
//				k++;
//			} System.out.println();
//		}
		
//		// 밖에 있는 for문은 가로에 대한 반복 횟수
//		for (int i = 0, k = 0; i < 3; i++, k++) {
//			 //안에 있는 for문은 세로에 대한 반복 횟수
//			for (int j = 0; j < 4; j++) {
//				System.out.printf("%02d ",k);
//			} System.out.println();
//		}
		
		//예제. 랜덤한 수를 출력하고 가로 한 줄의 합을 구하세요
		// 8  7  2  1  18
		// 3  4  2  6  15
		// 1  3  2  4  10
//		Random rnd = new Random();
//		
//		for (int i = 0; i < 3; i++) {
//			int sum = 0;
//			for (int j = 0; j < 4; j++) {
//				int r = rnd.nextInt(10);
//				System.out.printf("%d ",r);
//				sum += r;
//			}
//			System.out.printf(" %d",sum);
//			System.out.println();
//		}


//EX35)
//		System.out.println(65);
//		System.out.println((char)65);	//아스키코드 번호에 맞는 문자 출력(숫자를 문자로)
//		System.out.println('A');		//문자 출력
//		System.out.println((int)'A');	//문자를 숫자로
		
//		for (int i = 0; i < 26; i++) {
//			//System.out.println(i);
//			//System.out.println((char)(65 + i));	//잘난척하는 느낌
//			System.out.println((char)('A' + i));	//일반적인 코드
//		}
		
		//예제. 랜덤한 알파벳을 박스 형태로 나타내기
		// A  G  Q  P
		// Z  B  I  R
		// E  F  L  W
//		Random rnd = new Random();
//		
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				int r = rnd.nextInt(26);
//				System.out.printf("%s " , (char)('A' + r));
//			}
//			System.out.println();
//		}
		
		
//EX36)	컬렉션 중 LIST	
		
		/*
		LinkedList<Integer> li = new LinkedList<Integer>(); //컨테이너 안에는 반드시 객체type만 들어올 수 있음(int 대신 integer)
		//따지고보면 Tiger t1 = new Tiger(); 랑 똑같음
		System.out.println(li.size()); //(아주머니 안에 요쿠르트 몇 개 있어요? 묻는거)
		
		//CRUD 중 C에 해당(안에 요쿠르트 담을 때) 
		li.add(10); 
		li.add(20);
		System.out.println(li.size());
		
		for (int i = 0; i < 10; i++) {
			li.add(i);
		}
		System.out.println(li.size());
		
		//CRUD 중 R에 해당 - 안에 있는 데이터 쭉 나옴
		for (int i = 0; i < li.size(); i++) {
			int data = li.get(i);
			System.out.print(data + " ");
		} System.out.println();
		//이렇게도 쓸 수 있다(위에랑 결과 똑같음)
		for (int i = 0; i < li.size(); i++) {
			System.out.print(li.get(i) + " ");
		} System.out.println();
		
		//추가하는 또 다른 방법
		li.add(0, 77); //출력하고자 하는 위치(제일 처음에 77 추가)
		li.add(3, 88); //3번 위치에 88 추가 
		//추가됐는지 확인
		for (int i = 0; i < li.size(); i++) {
			int data = li.get(i);
			System.out.print(data + " ");
		} System.out.println();
		
		//CRUD 중 D에 해당
		li.remove(7); //7번 위치 삭제
		//삭제됐는지 확인
		for (int i = 0; i < li.size(); i++) {
			int data = li.get(i);
			System.out.print(data + " ");
		} System.out.println();
		
		//CRUD 중 U에 해당
		li.set(3, 99); //3번 위치 99로 업데이트
		//업데이트 됐는지 확인
		for (int i = 0; i < li.size(); i++) {
			int data = li.get(i);
			System.out.print(data + " ");
		} System.out.println();
		//위에 for문이랑 동격(훨씬 간단함) - foreach
		//i값 사용 안하고 안에 있는 데이터만 끄집어 쓰겠다 할 때 사용
		for (Integer data : li) {
			System.out.print(data + " ");
		}
		*/
		
		
//EX37) 실제 사용되는 모습	
		
/*
		class Apple { //클래스
			
			int x, y; //필드
			
			Apple() { //생성자
				
			}
			
			Apple(int a, int b){
				x = a;
				y = b;
			}	
			
			void show() { //메소드
				System.out.println(x + " " + y);
			}
		}
		
		Apple a1 = new Apple(); //객체
		
		a1.show(); //1번
		
		a1.x = 100;
		a1.y = 200;
		a1.show(); //2번
		
		Apple a2 = new Apple(77, 88);
		
		a2.show(); //3번
		System.out.println("----------------");
		
		//실제 사용되는 모습
		LinkedList<Apple> oli = new LinkedList<Apple> ();
	
		oli.add(a1);
		oli.add(a2);
		System.out.println(oli.size()); //(지금 사과 몇개 있어요?) 2개
		
		
		//CREATE
		//넣는 방법1.
		for (int i = 0; i < 5; i++) {
			Apple ta = new Apple();
			
			ta.x = i * 10;
			ta.y = i * 20;
			
			oli.add(ta);
		}
		System.out.println(oli.size()); //7개
		//넣는 방법2.
		for (int i = 0; i < 5; i++) {
			Apple ta = new Apple(i*30, i*40);
			
			oli.add(ta);
		}
		System.out.println(oli.size()); //12개
		//넣는 방법3.
		for (int i = 0; i < 5; i++) {
			oli.add(new Apple(i*50, i*60));
		}
		System.out.println(oli.size()); //17개
		
		
		//READ
		//보는 방법1.
		for (int i = 0; i < oli.size(); i++) {
			System.out.println(oli.get(i).x + " " + oli.get(i).y);
		}
		System.out.println("------------------");
		//보는 방법2.
		for (int i = 0; i < oli.size(); i++) {
			oli.get(i).show();
		}
		System.out.println("------------------");
		//보는 방법3.
		for (Apple data: oli) {
			data.show();
		}
		System.out.println("---------------------");
		
		
		//DELETE
		oli.remove(3);
		for (Apple data: oli) {
			data.show();
		}
		System.out.println("---------------------");
		
		
		//UPDATE
		oli.set(2, new Apple(888, 999));
		for (Apple data: oli) {
			data.show();
		}
*/	

		
//EX38)
//		for (int i = 0; i <= 36; i++) {
//			System.out.println(Math.sin(Math.PI*(i*10)/180.0));	//라디안 값 넣어줘야 함
//		}
		
		
//EX39) 선택정렬
		/*
		int[] ar = {5, 4, 8, 7, 1, 2, 6, 9};
		
		for (int i = 0; i < ar.length; i++) { //정리되기 전
				System.out.print(ar[i] + " ");
		} System.out.println();
		System.out.println("---------------------");
		
		for (int i = 0; i < (ar.length - 1); i++) {
			for (int j = (i+1); j < ar.length; j++) {
				//System.out.println(i + " " + j);
				if(ar[i] < ar[j]) { //바꾸어야 한다면
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			for (int k = 0; k < ar.length; k++) {
				System.out.print(ar[k] + " ");
			} System.out.println();
		}
		
		System.out.println("----------------------");
		
		for (int i = 0; i < ar.length; i++) { //정리되고 난 후
			System.out.print(ar[i] + " ");
		} System.out.println();
		

		System.out.println("-------역순 정렬--------");

//		for (int i = 0; i < ar.length/2; i++) {
//			System.out.println(i + " " + (ar.length - i -1));
//		} 
		
		for (int i = 0; i < ar.length/2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length - i - 1];
			ar[ar.length - i - 1] = temp;
		}
		
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		} System.out.println();
		
		for (int i : ar) {
			System.out.print(i + " ");
		} System.out.println();
		*/
		
		
//EX40)	버블정렬	
//		for (int i = 0; i < 5; i++) { //가로
//			int num = 0;
//			for (int j = 0; j < 5-i; j++) { //세로
//				System.out.print("[" + num + " " + (num+1) + "] ");
//				num++;
//			} 
//			System.out.println();
//		} 
		
	
//EX41) 버블정렬을 이용해서 순서대로 배열하기
		/*
		int[] ar = {5, 4, 8, 7, 1, 2, -6, -15};
		
		for (int i = 0; i < ar.length; i++) { //가로
			for (int j = 0; j < ar.length - 1; j++) { //세로
				if(ar[j] > ar[j+1]) {
					int t = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = t;
				}
			}
		} 
		
		for (int i : ar) {
			System.out.print(i + " ");
		}System.out.println();
		*/


//EX42) 08 09 10 11
//		04 05 06 07
//		00 01 02 03			<- 이렇게 출력하시오
//		int m = 3;
//		int n = 4;
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//					System.out.printf("%02d ", m*(n-i-1)+j);
//			} System.out.println();
//		} 				
		
//		System.out.println("-------------------");
		
//EX43) 11 10 09 08
//		07 06 05 04
//		03 02 01 00			<- 이렇게 출력하시오
//		int x = 3;
//		int y = 4;
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < y; j++) {
//					System.out.printf("%02d ", x*(y-i-1)-j);
//			} System.out.println();
//		} 	
		
		
//EX44) *		
//		* *
//		* * *
//		* * * *
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			} System.out.println();
//		}
		
//EX45) * * * * *
//		* * * * 
//		* * *
//		* * 
//		*
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5-i; j++) {
//				System.out.print("* ");
//			} System.out.println();
//		}
		
//EX46)     *
//		  * * *
//		* * * * *
//        * * *
//          *
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < 5-i; j++) {
//				System.out.print("  ");
//			} 
//			for (int j = 0; j < 2*i-1; j++) {
//				System.out.print("* ");
//			} System.out.println();
//		}
		
//		System.out.println("해결!!!!");
//		System.out.print("홀수만 입력하세요: ");
//		
//		int num = (new Scanner( System.in )).nextInt();
//		
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				if((Math.abs(i-num/2) + Math.abs(j-num/2)) <= num/2) {
//					System.out.print("* ");
//				} else {
//					System.out.print("  ");
//				}
//			} System.out.println();
//		}
		
//EX47) 0~100 사이의 값을 랜덤하게 받아서, 그 중 중간값을 출력하시오		
//		int a = 10, b = 20, c = 30;	
//		int a = 10, b = 30, c = 20;	
//		int a = 20, b = 10, c = 30;	
//		int a = 20, b = 30, c = 10;	
//		int a = 30, b = 10, c = 20;	
//		int a = 30, b = 20, c = 10;	
	
	
//		Random rnd = new Random();
//		
//		int a = rnd.nextInt(100); 
//		int b = rnd.nextInt(100); 
//		int c = rnd.nextInt(100); 
//		int num = 0;
//		
//		System.out.println(a + " " + b + " " + c);
//		
//		if(a>b) {
//			if(a>c) {
//				num = Math.max(b, c);
//			} else { //a>b, a<c
//				num = a;
//			}
//		} else { //a<b
//			if(a<c) {
//				num = Math.min(b, c);
//			} else { //a<b, a>c
//				num = a;
//			}
//		}
//		System.out.println(num);
		
		
//EX48) 함수 호출 복습		
		/*
		class Team {
			
			Team() {
				
			}
			
			void func01() {
				System.out.println("func01 호출");
			}
			void func02(int a) {
				System.out.println("func02 호출");
				System.out.println(a);
			}
			int func03() {
				System.out.println("func03 호출");
				return 100;
			}
			int func04(int b) {
				System.out.println("func04 호출");
				return (b * 10);
			}
			void func05(int a, int b, int c) {
				System.out.println("func05 호출");
				System.out.println(a*a+b*b+c*c);
			}
			int func06() {
				System.out.println("func06 호출");
				return 1;
				//System.out.println(2);  -> unreachable code
			}
			void func07(int c, int d) {
				System.out.println("func07 호출");
				System.out.print(c + " " +  d);
				System.out.println();
			}
//			void func08(int e, int f, int g, int h) {
//				g = 10;
//				h = 20;
//				System.out.println("func08 호출");
//				System.out.print(e + " " + f + " " + g + " " + h);
//			}  java는 함수의 인수 초기화 안됨
			void func09(String ...a) {
				for (String data : a) {
					System.out.println(data);
				}
			}
			void func10(int a, int b, int ...c) {
				System.out.print(a + " " + b);
				for (int data : c) {
					System.out.println(data);
				}
			}
		}
		
		Team t1 = new Team();
		
		t1.func01();
		
		t1.func02(100);
		
		t1.func03();	//return 값 x
		int result = t1.func03();	
		System.out.println(result);		//reutrn값 O
		System.out.println(t1.func03());	//return값 O
		
		t1.func04(5);
		int result2 = t1.func04(10);
		System.out.println(result2);
		System.out.println(t1.func04(80));
		
		t1.func05(1, 3, 5);
		
		t1.func07(5, 10);
		
		t1.func09("호랑이");
		*/
		
		
//EX49) 몇 초인지 구하세요. 그 결과를 result로 받았을 때 다시 몇 시 몇 분 몇 초 인지 구하시오.
//		int h = 2, n = 43, s = 27;
//		
//		
//		int result = s + (n*60) + (h*3600);
//		System.out.println(result + "초");
//		
//		int cho = result % 60; 
//		int bun = (result / 60) % 60; 
//		int si = (result / 60) / 60; 
//		System.out.println(si + "시 " + bun + "분 " + cho + "초");
		
		
//EX50)
//		Random rnd = new Random();
//		
//		int a = rnd.nextInt(100);
//		System.out.println(a);
//		
//		int b = ((a/4) + 1) * 4;
//		
//		if(a % 4 == 0) {
//			System.out.println(a);
//		} else {
//			System.out.println(b);
//		}
		
		
//EX51)
		/*
		class Apple {
			Apple() {
				System.out.println("생성자 call");
				System.out.println(this); //this-만들어진 객체를 지시하는 것
			}
		}
		
		Apple a = new Apple();
		System.out.println(a); //a의 민증번호
		
		Apple b = new Apple();
		System.out.println(b); //b의 민증번
		
		Apple c = new Apple();
		System.out.println(c); //c의 민증번
		*/
		
		/*
		class Tiger {
			int a, b;
			
			Tiger(int a, int b) { //멤버 필드를 초기화 시키는게 생성자의 목적
				this.a = a; //this는 클래스 안에 멤버를 가리킴 -> 구분하기위한 용도(용도1)
				this.b = b;
			}
		}
		
		Tiger a = new Tiger(30, 40);
		System.out.println(a.a + " " + a.b);
		*/
		
		/*
		class Banana {
			int money;
			String name;
			
			//생성자 자동 생성
			//마우스 우클릭 -> Source -> generate constructor using field -> 사용할 필드 클릭 -> generate
			Banana(int money, String name) {
				this.money = money;
				this.name = name;
			}
			
			
		}
		*/
		
		/*
		class Apple {
			Apple() {
				
			}
			
			String func01() {
				return null;
			}
			int func02() {
				return 0;
			}
			Apple func03() {
				return null;
			}
			Apple func04() {
				return this; //만들어진 객체를 return -> return을 이용해서 chaining을 하는 것 (this 용도2)
			}
			void func05() {
				System.out.println("호출");
			}
		}
		
		Apple apple = new Apple();
		
		apple.func05();
		apple.func04().func05();
		apple.func04(); //apple이 return됨
		apple.func04().func04().func05();;
		*/
		
		/*
		class Apple{
			int num = 10;
			
			Apple()	{
				
			}	
			
			void func() {
				System.out.println(num);	//귀찮아서 this 빼버림
				System.out.println(this.num);
			}
		}
		*/
		
		
//EX51)	배열
//		System.out.println("---------1번---------");
//		int[] ar = new int[7];
//		
//		ar[0] = 10;
//		ar[6] = 20;
////		ar[7] = 30;	//Index 7 out of bounds for length 7
////		ar[-1] = 40;	//Index -1 out of bounds for length 7
//		ar[3*2-1] = 50; 	//유효 범위 안에서 결과값이 나오기만 하면 상관없음
//		 
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		} System.out.println();
//		
//		
//		System.out.println("---------2번---------");
//		int num = 3;
//		ar[num] = 40;	//이런식으로 넣을 수도 있음
//		
//		ar[3*2-1] = 100;	//데이터 갱신
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		} System.out.println();
//		
//		
//		System.out.println("---------3번---------");
//		ar[0] = 3;	//데이터 갱신
//		ar[6] = ar[ar[0]*2-1];	//ar[5] 내용을 ar[6] 안에
//		
//		for (int i : ar) {
//			System.out.print(i + " ");
//		} System.out.println();
//		
//		
//		System.out.println("------이차원 배열------");
//		//5는 가로 길이, 3은 세로 길이에 해당된다
//		int[][] br = new int[4][6];		//5개짜리를 3개 만들어줘라
//
////		int[][][] br2 = new int[2][3][5]; //3차원 배열 -> 3행5열짜리 2개
//		
//		br[0][0] = 10;
//		br[0][4] = 20;
//		br[2][4] = 30;
//		
//		for (int i = 0; i <br.length; i++) {
//			for (int j = 0; j < br[i].length; j++) {
////				System.out.print(br[i][j] + " ");	//결과 출력용
//				System.out.printf("%3d", br[i][j]);	//결과 출력용 -> 줄 맞춰서 예쁘게
////				System.out.printf("[%d %d]", i, j);		//이중for문 형태 보는 용도
//			} System.out.println();
//		} 
//		
//		System.out.println("세로 반복 횟수: " + br.length); //세로 반복 횟수
//		System.out.println("가로 반복 횟수: " + br[0].length); //가로 반복 횟수
//		System.out.println("가로 반복 횟수: " + br[1].length);
//		System.out.println("가로 반복 횟수: " + br[2].length);
		
		
//EX52)
//		int[][] ar = new int[3][4];
//		
////		for (int i = 0; i < ar.length; i++) {
////			for (int j = 0; j < ar[i].length; j++) {
////				System.out.printf("%3d", ar[i][j]);
////			} System.out.println();
////		} System.out.println();
//		
//		//0부터 100까지의 수 랜덤하게 받아서 이차원 배열 출력하기
//		Random rnd = new Random();
//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				ar[i][j] = rnd.nextInt(100);
//				System.out.printf("%3d", ar[i][j]);
//			} System.out.println();
//		} System.out.println();
//
//		//[3][4]를 [4][3]으로 바꿔서 출력하기 -> ar을 90도 돌려서 br 만들기
//		int[][] br = new int[4][3];
//		
//		for (int i = 0; i < br.length; i++) {
//			for (int j = 0; j < br[i].length; j++) {
//				br[i][j] = ar[2-j][i];
//				System.out.printf("%3d", br[i][j]);
//			} System.out.println();
//		} System.out.println();
//		
//		//ar을 가지고 180도 돌려서 cr 만들기
//		int[][] cr = new int[3][4];
//		
//		for (int i = 0; i < cr.length; i++) {
//			for (int j = 0; j < cr[i].length; j++) {
//				cr[i][j] = ar[2-i][3-j];
//				System.out.printf("%3d", cr[i][j]);
//			} System.out.println();
//		} System.out.println();
//		
//		//ar을 가지고 270도 돌려서 dr 만들기
//		int[][] dr = new int[4][3];
//
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
//				dr[i][j] = ar[j][3-i];
//				System.out.printf("%3d", dr[i][j]);
//			} System.out.println();
//		}
		
		
//EX53) 401호 402호 403호
//		301호 302호 303호
//		201호 202호 203호
//		101호 102호 103호
//		int ho = 400;
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 3; j++) {
//				ho += 1;
//				System.out.print(ho + "호 ");				
//			} System.out.println();
//			ho -= 3;
//			ho -= 100;	
//		}

		int n = 4;
        int m = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%d0%d호 ", (n-i),j);
            }System.out.println();
        }
        		
		
//EX54) * * * * *
//		* o o o *
//		* o o o *
//		* * * * *
		
//		for (int i = 0; i < 4; i++) {
//			if(i == 0 || i == 3) {
//				for (int j = 0; j < 5; j++) {
//					System.out.print("x ");
//				}
//			} else {
//				System.out.print("x ");
//				for (int j = 0; j < 3; j++) {
//					System.out.print("o ");
//				}
//				System.out.print("x ");
//			}System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}