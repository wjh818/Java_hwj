package hwj;

/*
 * 예제01.
abstract class Apple {
	Apple() {
		
	}
	
	abstract void f1();
}


class Orange extends Apple {
	void f1() {
		System.out.println(1);
	}
}
*/




/*
 * 예제02.
//abstract class Apple {
//	abstract void f1();
//}
// 위에껄 변형 시킴 (안에 일반 함수가 없고 추상 함수만 있을 경우에만 interface 가능)
interface Apple {
	void f1();
}


class Orange implements Apple { //implements: 구현 (부모가 구현 못한걸 상속받은 자식 너가 해라)
	public void f1() {}; //void 앞에 반드시!! 꼭!! public 붙여줘야됨
}
*/




/*
 * 예제03.
class A {
	
}


interface B {
	
}


interface C {
	
}


class D extends A implements B,C {
	
}
*/




/*
 * 예제04.
interface Apple {
	abstract void f1();
}


interface Banana {
	void f1(int n); //abstract 생략 가능
}


interface Orange {
	void f1(String s, int n);
}


interface Kiwi {
	int f1();
}


interface Mango {
	int f1(int a);
}


interface Grape {
	int f1(int a, int b);
}


interface Apple01 {
	void f1();
}


class Apple02 {
	void f1(Apple01 app) {
		app.f1();
	}
}


interface Apple03 {
	void f1();
}


class Apple04 {
	Apple03 app;

	Apple04(Apple03 app) {
		this.app = app;
	}
	
	void f1() {
		app.f1();
	};
}
*/





public class Abstract03 {

	public static void main(String[] args) {
		
		
		/*
		 * 예제04.
		Apple t1 = new Apple() {
			public void f1() {	
			}	
		};
		
		
		// ->, => 나오면 무조건 람다 함수
		Apple t2 = ()-> {
			System.out.println(1);
		};
		t2.f1();
		
		
		// 함수 안의 실행문장이 한 문장일 때는 {} 생략 가능
		Apple t3 = ()-> System.out.println(1);
		t3.f1();
		
		
		Banana t4 = new Banana() {
			@Override
			public void f1(int n) {
				System.out.println(n*n);
			}
		};
		t4.f1(10);
		
		
		// t4랑 똑같음
		Banana t5 = (num) -> System.out.println(num*num); // num으로 달라도 상관없음
		t5.f1(10);

		
		// 임수전달이 한개 일때는 (괄호)를 생략할 수 있다 
		Banana t6 = num -> System.out.println(num * num);						
		t6.f1(10);

		
		// 코드에 익숙해져야함
		Banana t7 = nnn -> System.out.println(nnn*10);
		t6.f1(5);
		
		
		// 인수전달 2개 할 때
		Orange t8 = (s, n) -> System.out.println(s + " " + n);
		t7.f1("하하호호",50);
		
		
		Kiwi t9 = ()-> {
			System.out.println(888);
			return 100;
		};
		System.out.println(t8.f1());
		
		
		// {}랑 return 단어 같이 지워야함
		Kiwi t10 = ()-> 100;
		System.out.println(t9.f1());
		
		
		Mango t11 = n -> 100*n;
		System.out.println(t10.f1(5));
		
		
		Grape t12 = (a, b) -> {
			System.out.println(a+b);
			return 800000;
		};
		System.out.println(t11.f1(6, 7));
		
		
		Apple02 t13 = new Apple02();											//class를 사용하기 위해선 호출! 
		t13.f1(()->{
			System.out.println(1);												//ramda의 목적 코드를 넘겨주기 위해서 , 이경우에는 출력 코드를 넘겨줌 
			System.out.println(2);
			System.out.println(3);
		});
		t13.f1(()->System.out.println(4));	
		
		
		Runnable t14 = new Runnable() {
			@Override
			public void run() {
				System.out.println(14);
			}
		};
		t14.run();
		
		
		Runnable t15 = () -> System.out.println(15);
		t15.run();

		
		Apple04 t16 = new Apple04(()-> System.out.println(16));
		t16.f1();
		
		
		Apple04 t17 = new Apple04(() -> {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
		});
		t17.f1();
		
		
		Thread t18 = new Thread() {
			public void run() {
				System.out.println("여기는 Thread");
			};
		};
		t18.start(); //run 호출 -> Thread 클래스 안에 
		
		
		Thread t19 = new Thread(() -> System.out.println("저기는 Thread"));
		t19.start();
		*/
		
		
		
		
		
		/*
		 * 예제02.
		Orange t1 = new Orange();
		t1.f1();
		
		
		Apple t2 = new Orange();
		t2.f1();
		
		
		Apple t3 = new Apple() {
			@Override
			public void f1() {
				System.out.println(2);
			}
		};
		t3.f1();
		
		
		new Apple() {
			@Override
			public void f1() {
				System.out.println(3);
			}
		}.f1();
		*/
		
		
		
		
		
		/*
		 * 예제01.
		Orange t1 = new Orange();
		t1.f1();
		
		
		Apple t2 = new Orange();	//업캐스팅: 부-자(왼쪽이 부모, 오른쪽이 자식)
		t2.f1();
		
		
		Apple t3 = new Apple() {
			@Override
			void f1() {
				System.out.println(2);
			}
		};
		t3.f1();	//익명 클래스 사용 -> 방금 만든 함수 f1 사용
		
		
		new Apple() {
			@Override
			void f1() {
				System.out.println(3);
			}
		}.f1(); //익명 객체 -> t4라는 객체 안만들고 바로 사용함
		*/
		
		
		

	}

}
