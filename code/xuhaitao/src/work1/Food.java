package work1;

public class Food {
	private String color;
	private String size;
	public Food(String color,String size){
		System.out.println("this is food property:");
		this.color = color;
		this.size = size;	
	}
	public Food(String color){
		this.color = color;
	}
	
	public void name(){
		System.out.println("food hava a name");
		
	}
	public String getColor(){
		return color;
	}
	public String getSize(){
		return size;
	}
	
}

