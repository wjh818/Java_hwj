package hwj;
//
//abstract class A {
//	abstract void f1(); //앞으로 나의 자식들은 반드시 f1을 상속 받아라
//}
//
//class B extends A {
//	@Override
//	void f1() {
//		System.out.println(1);
//	}
//}
//
//public class Abstract01 {
//
//	public static void main(String[] args) {
//		
//		B t1 = new B();
//		
//		A t2 = new B(); //업캐스팅
//		t2.f1();
//		
////		A t3 = new A(); //error -> A는 안에 추상 함수가 들어가 있어서 미완성 상태여서 객체 생성 안됨
//		A t3 = new A() { //즉석에서 바로 함수를 오버라이딩해서 쓰고 있음 -> 익명 class를 이용한 객체 생성 방법
//			@Override
//			void f1() {
//				System.out.println(3);	
//			}
//		};
//		t3.f1();
//		
//		
//		new A() { //익명 객체 -> 따로 객체 안만들고 그 자리에서 바로 만들어서 한번 쓰고 버리는 코드
//			@Override
//			void f1() {
//				System.out.println(3);
//			}
//		}.f1();
//	}
//
//}
