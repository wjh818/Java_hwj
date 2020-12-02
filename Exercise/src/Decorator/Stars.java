package Decorator;

//ConcreteDecorator
//장식용 꽃도 구체화

class Stars extends TreeDecorator {

	ChristmasTree christmastree;
	
	public Stars(ChristmasTree christmastree) {
		this.christmastree = christmastree;
	}
	
	
	@Override
	public String getDescription() {
		return "별을 추가한 " + christmastree.getDescription();
	}

	
	@Override
	public int cost() {
		return 5000 + christmastree.cost();
	}

	
	
	
	
	
	
}
