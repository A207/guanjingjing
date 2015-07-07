package test;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("|1.增加1个学生|");
		System.out.println("|2.显示所有学生|");
		System.out.println("|3.退出程序|");
		System.out.println("请输入选择：");
		Scanner myPrint = new Scanner(System.in);
		int a = myPrint.nextInt();
		if(a == 1){
			System.out.println("增加了一个学生！");
		}else if(a == 2){
			System.out.println("显示了所有学生");
		}else if(a == 3){
			System.out.println("已退出程序");
		}else{
			System.out.println("输入有误！");
		}
		
	}

}
