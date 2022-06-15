package P1;

public class Farm {
	//Attributes
	Animal[] animals;
	private double availableFood;
	
	//Constructors
	Farm(){
		availableFood = 1000;
		animals = new Animal[4];
		animals[0] = new Chicken();
		animals[1] = new Cow();
		animals[2] = new Llama();
		animals[3] = new Llama();
	}
	
	//Setters & Getters
	public double getAvailableFood() {
		return availableFood;
	}

	public void setAvailableFood(double availableFood) {
		this.availableFood = availableFood;
	}

	public Animal[] getAnimals() {
		return animals;
	}
	//Methods
	public void makeNoise() {
		for(int i = 0; i <= 3; i++) {
			animals[i].sound();
		}
	}

	public void feedAnimals() {
		for(int i = 0; i <= 3; i++) {
			if(availableFood < animals[i].getMealAmount())
				return;
			else
			setAvailableFood(availableFood - animals[i].eat());		
		}
	}
}
