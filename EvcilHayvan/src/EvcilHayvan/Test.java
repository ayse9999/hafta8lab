package EvcilHayvan;

public class Test {

	public static void main(String[] args) {
      Fish d=new Fish (0);
      Cat c=new Cat(4,"Fluffy");
      Animal a=new Fish(0);
      Animal e=new Spider(8);
      Pet p=new Cat(4,"A");
      
      
      d.eat();
      d.valk();
      System.out.println("");
      c.eat();
      c.valk();
      System.out.println("");
      a.eat();
      a.valk();
      System.out.println("");
      e.eat();
      e.valk();
      System.out.println("");
      p.play();

	}

}
