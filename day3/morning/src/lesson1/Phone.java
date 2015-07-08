package lesson1;

public class Phone {
	String name;
	String brand;
	int price;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.name = "note";
		p.brand = "爆米花";
		p.price = 99;
		System.out.println(p.name);
		p.call();
		p.sendMsg();
	}
	void call(){
		System.out.println("打电话");
	}
	void sendMsg(){
		System.out.println("发短信");
	}
}
