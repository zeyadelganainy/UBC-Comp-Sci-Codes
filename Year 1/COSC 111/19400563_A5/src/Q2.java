public class Q2 {

	public static void main(String[] args) {
		//For loop to go through all values from 1 to 10,000 inclusive:
		for(int i = 1; i <= 10000; i++) {
	        
			int sum = 0;	//Declaring and initializing the sum to be used in the nested for loop
	        
	        //For loop to check if the current value of i is divisible by every number up to half of "i" (to avoid duplicates) 
	        for (int j = 1; j <= i/2; j++){
	            //If a number is divisible, add it to the sum
	        	if (i % j == 0) 
	                sum += j;
	        }
	        //If the sum ends up being equal to the number, print that it's a perfect number
	        if (sum == i)
	            System.out.println(i + " is a perfect number");
	    }
	}
}