package lesson4;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//抽象类不能实例化
		//Animal animal = new Animal();会报错
		
		Animal animal = new Lion();
		animal.sleep();
		Animal animal1 = new Monkey();
		animal1.sleep();
	}

}

//多态 一个类的子类有多种状态
