package lesson4;

//�����࣬abstract����
public abstract class Animal {
	//���󷽷���abstract���Σ�������Ҳ����û�г��󷽷�
	public abstract void sleep();
}


class Lion extends Animal{

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("ſ��˯");
	}
}

class Monkey extends Animal {

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("����˯");
	}
	
}