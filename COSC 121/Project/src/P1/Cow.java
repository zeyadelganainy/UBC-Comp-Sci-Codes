package P1;

public class Cow extends Animal{
	//Attributes
	static int count = 0;
	//Constructors
	Cow(){
		setMealAmount(20);
		setName("Cow" + ++count);
	}
	//Setters & Getters
	
	//Methods
	public void sound() {
		if (isAlive())
			System.out.println("Moo!");
	}
	
	void Milk() {
		System.out.println(getName() + " was milked!");
	}
}
