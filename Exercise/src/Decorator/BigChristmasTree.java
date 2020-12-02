package Decorator;

//ConcreteComponent
//기본 크리스마스 트리를 구체화
//아무 장식 없는 그냥 나무

public class BigChristmasTree extends ChristmasTree {
	
	public BigChristmasTree() {
		description = "대형 트리";
	}

	@Override
	public int cost() {
		return 40000;
	}

	

}
