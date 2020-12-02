package Decorator;

//ConcreteDecorator
//장식으로 두를 불을 구체화

public class Lights extends TreeDecorator {
	
	ChristmasTree christmastree; //감싸고자하는 크리스마스트리를 저장하기 위한 인스턴스 변수
	
	public Lights(ChristmasTree christmastree) {
		this.christmastree = christmastree;
	} //인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 생성자
	  //데코레이터의 생성자에 감싸고자하는 나무 객체를 전달하는 방식을 사용

	
	@Override
	public String getDescription() {
		return  "알전구를 추가한 " + christmastree.getDescription();
	}

	
	@Override
	public int cost() {
		return 3000 + christmastree.cost();
	}

	

}
