package hwj;

public class Exception00 {

	public static void main(String[] args) throws Exception{
		
		//Exception01.
//		int[] ar = new int[3];
//		ar[5] = 10;	  //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
		
		
		//Exception02.
//		int a = 100/0;	//ArithmeticException: / by zero
		
		
		//Exception03.
//		String s = null;
//		s.hashCode();	//NullPointerException
		
		
		//Exception03.
//		class A {
//			
//		}
//		
//		class B extends A {
//			void f1() {
//				
//			}
//		}
//		
//		A a = new A();
//		B b = a(B);
		
		
		
		
		//try-catch문
//		try {
//			int a = 100/0; //오류 발생하면 catch로 가라
//			System.out.println("호랑이");
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Exception 발생!");
//			e.printStackTrace();	//무슨 오류 발생했는지 보여줌
//		}
		
		
		
		
		//try-catch-finally문
//		try {
//			int b = 100/0;
//		} catch (ArithmeticException e) {
//			System.out.println("Exception 발생!");
//		} finally { //반드시 실행해야할 문장
//			System.out.println("여기는 final");
//		}	
		
		
		
		
//		for (int i = 0; i < 6; i++) {
//			try {
//				System.out.println(i);
//				Thread.sleep(1000);  //1초 동안 멈춰줌
//			} catch (InterruptedException e) {
//				e.printStackTrace();  //무슨 에러가 떴는지 보여줌
//			}  
//				
				//이렇게 한줄로도 쓸 수 있음
////			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); } 
//		}
		
		

		
		/*
		class Apple{
			void f1() throws Exception { //호출한 놈이 책임져라
				System.out.println(1);
				
				//throw: 호출한 놈한테 뭔가를 던져라
				throw new Exception();
			}
			
			void f2() { //호출한 애는 책임지지 않아도 된다
				try {
					throw new Exception();
				} catch(Exception e) {

				}
			}
			
			void f3() throws Exception { 
				throw new Exception();
			}
			
		}
		
		Apple a = new Apple();
		try { a.f1(); } catch (Exception e) {}
		
		a.f2();
		
		a.f1(); //Exception 떠넘기기 -> 위에 메인 클래스 옆에 throws Exception 붙여줌 -> 실행 가능해짐
		*/
		
		
		
		
		
		
		
		

		
	}
}
