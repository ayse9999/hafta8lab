package EvcilHayvan;

public  class Cat extends Animal implements Pet {
	
	protected String name;

	protected Cat(int legs, String name) {
		super(legs);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	protected void eat() {
		System.out.println("Kediler mama ile beslenir.");
	}
	
	public void play() {
		System.out.println("Kediler oyuncaklari ile.");
	}
}
	
		
	


