package hwj;
//
//abstract class Apple {
//	Apple() {}
//	
//	abstract void f1(); //abstract: 추상, 미완성 -> {}지우고 뒤에 ;붙임 -> abstract 함수 하나라도 갖고 있으면 class도 abstract이어야 함
//	
//	void f2() {
//		System.out.println(2);
//	};
//	
//}
//
//class Banana extends Apple { //오버라이딩해줘야 상속 가능
//	@Override //어노테이션: 컴파일 옵션	-> 오타 방지용
//	void f1() { //부모가 미완성이면 반드시 그 함수를 오버라이딩 해줘야 함
//		// TODO Auto-generated method stub
//
//	}
//
//	void f3() {
//		System.out.println(3);
//	}
//}
//
//
//public class Abstract00 {
//
//	public static void main(String[] args) {
//		
//		Banana b1 = new Banana();
//		
//		b1.f1();
//		b1.f2();
//		b1.f3();
//		
////		Apple a1 = new Apple(); //미완성 코드라서 객체를 생성시킬수가 없음
//
//	}
//
//}
