package programs;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		int year = 2025;
		
		if((year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0)){
			System.out.println("is leap yaer");
		}else {
			System.out.println("is not leap year");
		}
		
	}

}
