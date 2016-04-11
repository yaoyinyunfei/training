package com.tu;

public class TestDemo2 {

	public static void main(String[] args) {
		//初始化类
		Cat cat=new Cat();
		cat.setName("kitty");
		cat.setEyeColor("blue");
		cat.setAge(2);
		cat.setBone("柔软");
		cat.setTail("长尾巴");
		System.out.println(cat.name+cat.age+"岁，眼睛"+cat.eyeColor+"骨头"+cat.getBone());
		cat.run();
		cat.sleep();
		cat.drink();
		cat.eat();
		cat.fish(cat.getTail());
		System.out.println("----------------");
		Dog dog=new Dog();
		dog.setEyeColor("black");
		dog.setName("小黑");
		dog.setAge(3);
		dog.setSmell("good");
		System.out.println(dog.name+dog.age+"岁，眼睛"+dog.eyeColor+"，嗅觉"+dog.getSmell());
		dog.run();
		dog.eat();
		dog.sleep();
		dog.drink();
		dog.cry("大声", cat.name);
		
	}
}

//定义一个动物类
class Animals
{
	//定义属性
	public String eyeColor;
	public String name;
	public int age;
	//尾巴
	public String tail;
	
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}

	//定义方法
	public Animals(String eyeColor, String name, int age, String tail) {
	//	super();
		this.eyeColor = eyeColor;
		this.name = name;
		this.age = age;
		this.tail = tail;
	}
	public Animals(){}
	
	public void run(){
		System.out.println("运动的方法");
	}
	public void eat()
	{
		System.out.println("吃饭的方法");
	}
	public void drink()
	{
		System.out.println("喝水的方法");
	}
	 final public void sleep()
	{
		System.out.println("睡觉的方法都是一样的");
	}
}


//定义一个狗类继承动物类
class Dog extends Animals
{
	private String smell;
	
	public String getSmell() {
		return smell;
	}
	public void setSmell(String smell) {
		this.smell = smell;
	}
	
	public Dog(String eyeColor, String name, int age, String tail,String semll) {
		super(eyeColor, name, age, tail);
		this.smell=semll;
	}
	public Dog(){}
	
	@Override
	public void run()
	{
		System.out.println("狗用四肢奔跑");
	}
	@Override
	public void eat()
	{
		System.out.println("狗用撕咬的方法吃饭");
	}
	@Override
	public void drink()
	{
		System.out.println("狗用舔的方法喝水");
	}
	//写一个狗叫的方法
	public void cry(String method,Object obj)
	{
		System.out.println("狗"+method+"对"+obj+"叫");
	}
	
}


class Cat extends Animals
{
	//定义自己的属性
	private String bone;
	public Cat(String eyeColor, String name, int age, String tail,String bone) {
		super(eyeColor, name, age, tail);
		this.bone=bone;
	}
	public String getBone() {
		return bone;
	}
	public void setBone(String bone) {
		this.bone = bone;
	}
	
	public Cat(){}
	@Override
	public void run()
	{
		System.out.println("猫很少运动");
	}
	@Override
	public void eat()
	{
		System.out.println("猫吃饭很慢");
	}
	@Override
	public void drink()
	{
		System.out.println("猫喝水也是用舔的");
	}
	//写一个猫钓鱼的方法
	public void fish(String method)
	{
		System.out.println("小猫用"+method+"钓鱼");
	}
}