import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		StopWatch myWatch = new StopWatch();
		myWatch.start();
		int[] randoms = new int[(int) Math.pow(10, 6)];
		for (int i = 0; i < randoms.length; i++) {
			randoms[i] = (int) Math.random();
		}
		Arrays.sort(randoms);
		myWatch.stop();
		System.out.printf("The elapsed time is %d ms", myWatch.getElapsedTime());
		
	}

}
