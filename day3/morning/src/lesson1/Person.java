package lesson1;

public class Person {
	String name;
	int age;
	String address;
	//无参默认构造方法
	Person (){
		System.out.println("Person的默认构造方法执行了");
	}
	//呦参构造方法
	Person(String n, int a, String add){
		name = n;
		age = a;
		address = add;
	}
	/**javap 构造方法名  可以反编译，方法名与类名相同
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Person person = new Person();
		person.name = "李四";
		person.age = 20;
		person.address = "USA";*/
		Person person2 = new Person("jim",30,"北京");
		person2.introduce();
	}
	void introduce(){
		System.out.println("大家好，我叫"+name+"，今年"+age+"岁了，我在"+address);
	}
}
