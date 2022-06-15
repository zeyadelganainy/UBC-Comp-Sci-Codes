package P2;

public class Cow extends Animal{
	private static int id;
	public Cow() {
		setName("Cow" + ++id);
		setMealAmount(20);
	}
	public void sound(){
		if(isAlive()) System.out.println("Moo!");
	}
	public void milk(){
		if(isAlive()) System.out.println("We can milk cows as following:...!");
	}
}
