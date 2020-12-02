package hwj;

/*
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
*/

/*
class Animal {
	Animal() {
		
	}
	
	void cry() {
		System.out.println("저는 울지 못해요");
	}
}

class Snake extends Animal {
	Snake() {
		
	}
}

class Cat extends Animal {
	Cat() {
		
	}
	
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	Dog() {
		
	}
	
	void cry() {
		System.out.println("멍멍");
	}
}
*/

/*
class Apple {
	Apple() {
		
	}
	
	void func01() {
		System.out.println("func01 call");
	}
	void func03() {
		System.out.println("부모 func03 call");
	}
}

class Orange extends Apple{
	Orange() {
		
	}
	void func02() {
		System.out.println("func02 call");
	}
	void func03() {
		System.out.println("자식 func03 call");
	}
}
*/

/*
class Apple {
	Apple() {
		System.out.println("나는 부모");
	}
	void func01() {
		System.out.println("부모1");
	}
	void func03() {
		System.out.println("부모3");
	}
	void func05() {
		System.out.println("부모5");
		func03();
	}
	void func06() {
		System.out.println("부모6");
		this.func03();
	}
}


class Orange extends Apple { //상속(부모-자식 관계) 바나나는 사과이다
	Orange() {
		System.out.println("나는 자식");
	}
	
	void func02() {
		System.out.println("자식2");
	}
	void func03() {
		System.out.println("자식3");
	}
	void func04() {
		System.out.println("자식4");
		func03();
		super.func03(); //부모 함수03 호출하는 방법(super 사용)
		
	}
}
*/

/*
class A {
	A() {
		System.out.println();
	}
}

class B extends A {
	B() { //자식 생성자
		//super는 생성자의 첫줄에 반드시 있어야함
//		super(); //super는 코딩하지 않으면 default 값으로 자동으로 생성됨
		//자식 생성자에서 부모 생성자 호출할 때 super 사용
		System.out.println();
		//B에 갔다가 super를 거쳐서 부모한테 갔다가 다시 자식한테 돌아옴
	}
}
*/





public class Inheritance00 {

	public static void main(String[] args) {
//		Apple a1 = new Apple();
//		a1.func03();
		
//		Banana b1 = new Banana(); //부모 생성자, 자식 생성자 모두 호출됨
		//결과는 부모 생성자가 먼저 호출되고 자식 생성자가 호출이
		//되기는 개뿔...
		//자식 생성자한테 먼저 갔다가 부모 생성자로 갔다가 끝나면 다시 자식 생성자한테 옴
		
		
		
//		B b = new B();
		
//		Orange o1 = new Orange();
//		o1.func01(); //자식은 자기꺼 안에 없으면 부모꺼 뒤짐 (부모꺼에도 없으면 error)
//		o1.func02();
//		o1.func03();
//		o1.func04();
//		o1.func05(); //자식 함수03 호출됨 -> 자식의 함수 때문에 부모의 함수가 보이지 않는다(오버라이딩 됐다 = 자식한테 간다)
//		o1.func06();
		
		
//		Apple t1 = new Apple(); //부모=부모 형태
//		Orange t2 = new Orange(); //자식=자식 형태
////		Orange t3 = new Apple(); //자식=부모 형태 (error, 못씀)
//		Apple t4 = new Orange(); //부모=자식 형태 -> "업캐스팅(upcasting)" (부모가 가지고 있는 문법에만 접근할 수 있다)
		
//		t4.func01();
////		t4.func02(); //문법 자체를 구사를 못함
//		t4.func03(); //메모리는 존재하기 때문에, 자식 함수에 부모 함수가 가려짐 (오버라이딩됨)
//		t2.func01();
//		t2.func03();
//		t2.func02();
		
		
//업캐스팅을 사용하는 예제01
		/*
		Animal a1 = new Dog();
		a1.cry();
		
		Animal a2 = new Cat();
		a2.cry();
		
		Animal a3 = new Snake();
		a3.cry();
		
		Animal a4 = new Dog();
		a4.cry();
		
		Animal a5 = new Cat();
		a5.cry();
		
		Animal a6 = new Snake();
		a6.cry();
		
		String s1 = "호랑이";
		String s2 = new String();
		String[] s3 = {"호랑이1", "호랑이2", "호랑이3"};
		String[] s4 = {new String("코끼리1"), new String("코끼리2"), new String("코끼리3")};
		System.out.println(s4[0]);
		Animal[] a7 = {new Dog(), new Cat(), new Snake(), new Dog(), new Cat()};
		a7[0].cry();
		a7[1].cry();
		a7[2].cry();
		
		for (int i = 0; i < a7.length; i++) {
			a7[i].cry();
		}
		*/
		
		/*
		Dog d1 = new Dog();
		Zoo z1 = new Zoo(d1);
		
		Zoo z2 = new Zoo(new Dog());
		Zoo z3 = new Zoo(new Cat());
		Zoo z4 = new Zoo(new Snake());
		
		z2.cry();
		z3.cry();
		z4.cry();
		*/
			
	}

}
