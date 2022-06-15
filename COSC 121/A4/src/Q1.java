import java.io.*;

public class Q1 {

	public static void main(String[] args) {
		//Initializing a count variable to hold the value of execution times
		int count = 0;						
		
		//Created a new File object in order to use the exists() method to check if it's the first execution
		File f = new File("count.dat");		
		
		//If the file does exist, read the previous value and increment it then store it in the count.dat file
		if (f.exists()) {
			try (FileInputStream fis = new FileInputStream("count.dat")) {
				count = fis.read();
			} catch (IOException e) {
				System.out.println("Error!");
			}
			try (FileOutputStream fos = new FileOutputStream("count.dat")) {
				fos.write(++count);
				System.out.printf("This program has been executed %d times", count);
			} catch (IOException e) {
				System.out.println("Error!");
			}
		} 
		//If it doesn't exist, store a 1 in count.dat
		else
			try (FileOutputStream fos = new FileOutputStream("count.dat")) {
				fos.write(1);
				System.out.println("This is the first time the program is executed");
			} catch (IOException e) {
				System.out.println("Error!");
			}
	}
}
