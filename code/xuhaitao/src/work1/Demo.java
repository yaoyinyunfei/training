package work1;

public class Demo {
	public static void main (String[] args){
		Fruit apple = new Fruit("red","circle");
		
		apple.name();
		System.out.print("apple");
		apple.get();
		Vegetable potato = new Vegetable("yello");
		System.out.print("potato");
		potato.get();
	}
}
