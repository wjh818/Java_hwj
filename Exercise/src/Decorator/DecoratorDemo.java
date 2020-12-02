package Decorator;

//클라이언트 단

public class DecoratorDemo {

	public static void main(String[] args) {
		
		ChristmasTree christmastree1 = new BigChristmasTree();
		System.out.println("기본 " + christmastree1.getDescription() + " " + christmastree1.cost() + "원 입니다.");
		
		
		ChristmasTree christmastree2 = new BigChristmasTree();
		christmastree2 = new Flowers(christmastree2);
		christmastree2 = new Lights(christmastree2);
		christmastree2 = new Stars(christmastree2);
		System.out.println(christmastree2.getDescription() + " " + christmastree2.cost() + "원 입니다.");
		
		
		ChristmasTree christmastree3 = new SmallChristmasTree();
		christmastree3 = new Lights(christmastree3);
		christmastree3 = new Flowers(christmastree3);
		System.out.println(christmastree3.getDescription() + " " + christmastree3.cost() + "원 입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//Christmas tree만 있음
//		ChristmasTree tree = new BigChristmasTree();
//		System.out.println(tree.decorate());
//		
//		
//		//Christmas tree + Lights
//		ChristmasTree treeWithLights = new Lights(new BigChristmasTree());
//		System.out.println(treeWithLights.decorate());
//		
//		
//		//Christmas tree + Lights + Flowers
//		ChristmasTree treeWithLightsAndFlowers = new Flowers(new Lights(new BigChristmasTree()));
//		System.out.println(treeWithLightsAndFlowers.decorate());
//		
//		
//		
//		
//		
//		//new DefaultChristmasTree()에 기능 추가를 
//		//new Lights(new DefaultChristmasTree())와 같이 동적인 방식으로 하고 있음
//		
//		
//		//추가적인 장식을 만들고 싶으면 TreeDecorator를 상속 받아 위처럼 구현하면 됨
//		
	}
}
