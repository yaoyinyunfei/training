package work1;

public class Fruit extends Food{
	public Fruit(String color, String size) {
		super(color, size);
		
		// TODO Auto-generated constructor stub
	}

	public void name(){
		super.name();
		System.out.println("fruit hava a name");
	}
	public void get(){
		System.out.println(" color is "+getColor()+" ;size is "+getSize());
		
		
	}

}
