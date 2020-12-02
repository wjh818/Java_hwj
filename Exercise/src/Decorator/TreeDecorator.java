package Decorator;

//Decorator
//트리에 올라갈 장식 추상화
//구체적인 장식들, 즉 장식용 불이나 꽃은 이 추상 클래스를 상속받아 구현하면 됨

abstract class TreeDecorator extends ChristmasTree {
	public abstract String getDescription();
	//모든 첨가물 데코레이터에서 getDescription() 메소드를 새로 구현하도록 만들거다. 그래서 추상 메소드로 선언
}
