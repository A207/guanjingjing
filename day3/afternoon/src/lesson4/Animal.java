package lesson4;

//抽象类，abstract修饰
public abstract class Animal {
	//抽象方法，abstract修饰，抽象类也可以没有抽象方法
	public abstract void sleep();
}


class Lion extends Animal{

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("趴着睡");
	}
}

class Monkey extends Animal {

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("仰着睡");
	}
	
}