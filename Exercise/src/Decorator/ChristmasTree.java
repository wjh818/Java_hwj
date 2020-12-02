package Decorator;

//Component
//크리스마스 트리와 장식을 각각 추상화 해야한다
//인터페이스로 공통 추상화

public abstract class ChristmasTree {
	
	String description = "제목 없음";
	
	public String getDescription() {
		return description;
	}
	
	public abstract int cost();
}


