package EvcilHayvan;

public class Animal {
	
	protected int legs;

	protected Animal(int legs) {
		super();
		this.legs = legs;
}
	protected void valk() {
		System.out.println("hayvanlar yurur");
	}
	protected void eat() {
		System.out.println("hayvanlar beslenir");
	}

	public String info() {
		return "Bacak sayisi"+legs;
}
}