package lesson3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Lion();
		animal1.sleep();//动态绑定
	}
}

//静态绑定：执行前方法已被绑定
//final static private 构造方法 都是静态绑定
