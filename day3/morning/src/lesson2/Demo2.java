package lesson2;

public class Demo2 {
	//一般属性
	int age = 10;
	//一般方法，只能new个类对象再用对象调用
	void hello(){
		System.out.println("hello");
	}
	//静态属性
	static String name = "张三";
	//静态方法，又类方法，可通过类名调用
	static void hi(){
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		System.out.println(Demo2.name);
		Demo2.hi();
		
		Demo2 d = new Demo2();
		System.out.println(d.age);
		d.hello();
	}

}
