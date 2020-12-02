package Decorator;

//ConcreteDecorator
//장식용 꽃도 구체화

class Flowers extends TreeDecorator {

	ChristmasTree christmastree;
	
	public Flowers(ChristmasTree christmastree) {
		this.christmastree = christmastree;
	}
	
	
	@Override
	public String getDescription() {
		return "꽃 장식을 추가한 " + christmastree.getDescription();
	}

	
	@Override
	public int cost() {
		return 1500 + christmastree.cost();
	}

	
	
	
	
	
	
}
