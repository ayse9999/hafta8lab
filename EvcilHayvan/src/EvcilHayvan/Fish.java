package EvcilHayvan;

public class Fish extends Animal implements Pet {

	protected Fish(int legs) {
		super(legs);
		
	}

	
	public String getName() {
		
		return null;
	}

	
	public void setName(String name) {
		
		
	}

	
	public void play() {
		
		System.out.println("Baliklar oynar.");
	}
	
	protected void eat() {
		System.out.println("Baliklar yem yer.");
	}
	
	protected void valk() {
		System.out.println("Baliklar yurumez.");
	}
	
	
}
		
			
		
		
		
	
