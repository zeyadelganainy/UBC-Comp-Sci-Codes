import java.util.Scanner;
public class Q1 {

	public static String convertTime(int totalSeconds) {
		int hours = totalSeconds / 3600;						//Finding hours 
		int minutes = (totalSeconds - hours * 3600 ) / 60;		//Finding minutes (subtract hours from total number of seconds)
		int seconds = (totalSeconds) % 60;   					//Finding seconds (remaining number of seconds after finding hours and minutes)
		String time = hours + ":" + minutes + ":" + seconds;	//Concatenating all values in a string to be returned to main method
		return time;
	
}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 				//Create a new scanner object called "input"
		
		System.out.print("Enter time in seconds: ");
		int seconds = input.nextInt(); 							//Stores the next integer in the scanner in "seconds"
		System.out.println(convertTime(seconds));				//Takes "seconds" as argument in the convertTime method then returns "time"
		
		input.close(); 											//Closes scanner 
	}

}
