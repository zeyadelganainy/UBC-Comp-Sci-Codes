package P1;

public class Chicken extends Animal{
	//Attributes
	static int count = 0;
	//Constructors
	Chicken(){	
		setMealAmount(5);
		setName("Chicken" + ++count);
	}
	//Setters & Getters
		
	//Methods
		public void sound() {
			if (isAlive())
				System.out.println("Cluck!");
		}
		
		void swim() {
			System.out.println(getName() + " swam!");
		}

}
