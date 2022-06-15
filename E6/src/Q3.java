
public class Q3 {

	public static boolean isLeapYear(int Year) {
		return (Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0;
	}
	
	public static int numberOfDaysInAYear(int year) {
		if(isLeapYear(year))
			return 366;
		else
			return 365;
	}
	
	
	public static void main(String[] args) {
		int year = 2000;
		for(int i = 0; i < 11; i++) {
			System.out.println( year + " has " + numberOfDaysInAYear(year) );
			year++;
		}

	}

}
