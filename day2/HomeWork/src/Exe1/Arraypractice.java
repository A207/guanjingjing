package Exe1;

public class Arraypractice {
	public static void main(String[] args) {
		int[][] myarr = new int[20][5];
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				myarr[i][j] = (int)(Math.random()*100+1);//Math.random()可以生成[0.0,1.0)左闭右开区间里的任意随机数
				//System.out.print(myarr[i][j]+" ");
			}
			//System.out.println("");
		}
		System.out.println("科目："+"core_C++ "+"coreJava "+"Servlet "+"JSP "+"EJB");
		for(int i=0;i<20;i++){
			System.out.print("同学"+(i+1)+"：");
			for(int j=0;j<5;j++){
				System.out.print(myarr[i][j]+"\t");
			}
			System.out.println("");
		}
		int[] zongFen= new int[20];
		for(int i=0;i<20;i++){
//			System.out.print("同学"+(i+1)+"的总分：");
			int cours = 0;
			for(int j=0;j<5;j++){
				cours += myarr[i][j];
			}
			zongFen[i] = cours;
			System.out.print(zongFen[i]+" ");
		}

		int zong1 = 0;
		int zong2 = 0;
		int zong3 = 0;
		int zong4 = 0;
		int zong5 = 0;
		int avg1 = 0;
		int avg2 = 0;
		int avg3 = 0;
		int avg4 = 0;
		int avg5 = 0;
		for(int i=0;i<20;i++){
			zong1 = zong1+myarr[i][0];
			zong2 = zong2+myarr[i][1];
			zong3 = zong3+myarr[i][2];
			zong4 = zong4+myarr[i][3];
			zong5 = zong5+myarr[i][4];
		}
		avg1 = zong1/20;
		avg2 = zong2/20;
		avg3 = zong3/20;
		avg4 = zong4/20;
		avg5 = zong5/20;
		System.out.println("");
		System.out.print("各科平均分："+avg1+" "+avg2+" "+avg3+" "+avg4+" "+avg5);
	}

}
