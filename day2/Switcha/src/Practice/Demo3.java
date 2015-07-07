package Practice;

public class Demo3 {

	/**
	 * @param args
	 */
	public enum day {monday,tuesday,wednesday,thursday,friday,saturday,sunday;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intDay = 0;
		day day1 = day.wednesday;
		switch(day1){
		case monday:intDay = 1;
			break;
		case tuesday:intDay = 2;
			break;
		case wednesday:intDay = 3;
			break;
		case thursday:intDay = 4;
			break;
		case friday:intDay = 5;
			break;
		case saturday:intDay = 6;
			break;
		case sunday:intDay = 7;
			break;
		}
		System.out.println(intDay);
	}

}
