package test;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("|1.����1��ѧ��|");
		System.out.println("|2.��ʾ����ѧ��|");
		System.out.println("|3.�˳�����|");
		System.out.println("������ѡ��");
		Scanner myPrint = new Scanner(System.in);
		int a = myPrint.nextInt();
		if(a == 1){
			System.out.println("������һ��ѧ����");
		}else if(a == 2){
			System.out.println("��ʾ������ѧ��");
		}else if(a == 3){
			System.out.println("���˳�����");
		}else{
			System.out.println("��������");
		}
		
	}

}
