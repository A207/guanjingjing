package lesson2;

public class Demo2 {
	//һ������
	int age = 10;
	//һ�㷽����ֻ��new����������ö������
	void hello(){
		System.out.println("hello");
	}
	//��̬����
	static String name = "����";
	//��̬���������෽������ͨ����������
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
