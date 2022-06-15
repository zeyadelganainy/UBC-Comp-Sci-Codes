package P1;

public class Llama extends Animal {
	//Attributes
	static int count = 0;
	//Constructors
	Llama(){
		setMealAmount(9);
		setName("Llama" + ++count);
	}
	//Setters & Getters
		
	//Methods
		public void sound() {
			if (isAlive())
				System.out.println("Hmmm!");
		}
		
		void Jump() {
			System.out.println(getName() + " jumped!");
		}
}
