package whiledemo;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int i = 1;
		while(i<=100){while(i<1);不会有任何输出
			System.out.println(i);
			i++;
		}
		System.out.println("跳出循环后的值"+i);*/
		
/*		int i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i<101);//while(i<1);会输出1*/
		
		/*for(int i=1;i<101;i++){
			System.out.println(i);
		}*/
		
		int[] integers = {1,2,3,4};//定义一个数组
		for(int i=0;i<integers.length;i++){
			System.out.println(integers[i]);
		}
		
		//for-each
		for(int suibianxie:integers){
			System.out.println(suibianxie);
		}
		
	}

}
