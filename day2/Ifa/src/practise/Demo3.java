package practise;
//多重判断
public class Demo3 {
	public static void main(String[] args) {
		int score = 94;
		String sex = "女";//或者是 男
        
        if(score>80){
            if(sex == "女"){
                System.out.println("进入女子组决赛");
            }else{
                System.out.println("进入男子组决赛");
            }
        }else{
            System.out.println("没有资格进决赛~");
        }
	}

}
