package P2;

import java.util.Arrays;

public class Farm {
	private double availableFood;
	private Animal[] animals;
	private int counter = 0;
	public Farm() {
		setAvailableFood(1000);
		animals = new Animal[100];
		add(new Chicken());
		add(new Cow());
		add(new Llama());
		add(new Llama());
	}
	public void makeNoise(){			// all animals make their sound (Moo, Cluck, etc)
		for(Animal animal: animals)
			animal.sound();
	}
	public void feedAnimals(){ 			// restore energy of all animals and deduct amount eaten from availableFood
		for(Animal animal : animals)
			if(availableFood >= Math.min(animal.getMealAmount(), (100-animal.getEnergy()))) 
			// no penalty if student uses:  if(availableFood >= animal.getMealAmount())
				availableFood -= animal.eat();
			else
				System.out.println("Not enough food for your animals! You need to collect more food items.");
	}
	public double getAvailableFood() {
		return availableFood;
	}
	public void setAvailableFood(double availableFood) {
		if(availableFood>=0 && availableFood<=1000)
			this.availableFood = availableFood;
	}
	public Animal[] getAnimals() {
		Animal[] copy = Arrays.copyOfRange(animals, 0, counter);
		return copy;
	}	
	
	public boolean add(Animal anim) {
		if(counter >= 100)
			return false;
		animals[counter] = anim;
		counter++;
		return true;
	}
	
	public void animSort() {
		Arrays.sort(animals, 0, counter);
	}
	
	public boolean addClone(Animal anim) throws CloneNotSupportedException {
		if(counter >= 100)
			return false;
		else {
			animals[counter] = (Animal) anim.clone();
			counter++;
		}
		return true;
	}
	
	public void printAnimals() {
		for(int i = 0; i < counter; i++) {
			System.out.println(animals[i].toString());
		}
	}
	
	public int getNumChicken() {
		int count = 0;
		for(int i = 0; i < counter; i++) {
			if(animals[i] instanceof Chicken)
				count++;
		}
		return count;
	}
	
	public int getNumCows() {
		int count = 0;
		for(int i = 0; i < counter; i++) {
			if(animals[i] instanceof Cow)
				count++;
		}
		return count;
	}
	
	public int getNumLlamas() {
		int count = 0;
		for(int i = 0; i < counter; i++) {
			if(animals[i] instanceof Llama)
				count++;
		}
		return count;
	}
	
	public void printSummary() {
		System.out.println("The farm has: ");
		System.out.printf("-%d animals (%d chicken(s), %d cow(s), and %d llama(s))\n", counter, getNumChicken(), getNumCows(), getNumLlamas());
		System.out.println("-" + availableFood + " units of food");
	}
}
