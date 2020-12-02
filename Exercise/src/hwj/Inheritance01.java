package hwj;

class Zoo {
	Zoo() {
		
	}
	Zoo(int a) {
		
	}
	Zoo(String s) {
		
	}
//	Zoo(Dog dog) {
//		System.out.println("dog");
//	}
//	Zoo(Cat cat) {
//		System.out.println("cat");
//	}
//	Zoo(Snake snake) {
//		System.out.println("snake");
//	}
	
	Animal animal;
	Zoo(Animal animal) { //업캐스팅 사용
		this.animal = animal;
	}
	
	void cry() {
		animal.cry();
	}
}

class Animal {
	void cry() {

	}
}

class Dog extends Animal {
	Dog() {
		
	}
	
	void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	Cat() {
		
	}
	void cry() {
		System.out.println("야옹야옹");
	}
}

class Snake extends Animal{
	Snake() {
		
	}
	void cry() {
		System.out.println("뱀뱀");
	}
}


public class Inheritance01 {

	public static void main(String[] args) {
		
		
		Dog d1 = new Dog();
		Zoo z1 = new Zoo(d1);
		
		Zoo z2 = new Zoo(new Dog());
		Zoo z3 = new Zoo(new Cat());
		Zoo z4 = new Zoo(new Snake());
		
		z1.cry();
		z2.cry();
		z3.cry();
		z4.cry();
		
		
		
		System.out.println("-------------------------------");
		
		
		String[] str = new String[3]; //문자열을 받을 수 있는 배열 3개 만들어짐
		str[0] = "호랑이";
		str[1] = new String("코끼리");
		str[2] = "독수리";

		
		
		//얘도 배열로 쓸 수 있음
		class Apple {
			void f1() {
				System.out.println(1);
			}
		}
		
		Apple a1 = new Apple();
		Apple[] a2 = new Apple[3];
		
		a1.f1();
//		a2[0].f1(); //될 것 같지만 안됨 -> 변수만 만들어 놓고 객체를 사용할 수는 없음
		
		a2[0] = new Apple();	//이렇게 해야 사용가능
		a2[0].f1(); 
		
		int a, b, c; //변수가 각각 서로가 의미가 없을 때 일괄적으로 선언해서 사용(a, b, c 의미 필요없고 3개의 인수가 필요한것)
		int[] ar = new int[3]; //위에랑 변수를 요구하는 양은 똑같음 -> 인수 한번에 선언한것뿐
		
		a = 10;
		ar[0] = 10;
		
		b = 20;
		ar[1] = 20;
		
		c = 30;
		ar[2] = 30;
		
		
		
		String s1, s2, s3;
//		System.out.println(s1);
		
		String[] br = new String[3];
		System.out.println(br[0]);
		
		br[0] = new String("호랑이");
	}

}
