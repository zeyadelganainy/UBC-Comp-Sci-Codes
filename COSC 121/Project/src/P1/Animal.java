package P1;

public class Animal {

	// Attributes
	private String name;
	private boolean alive;
	private double energy, mealAmount, x, y, speedX, speedY;

	// Constructors
	Animal() {
		setEnergy(100);
		setSpeedX(1);
		setSpeedY(1);
	}

	// Setters & Getters
	public void setName(String name) {
		this.name = name;
	}

	public void setEnergy(double energy) {
		if(energy >= 0 && energy <= 100)
			this.energy = energy;
		if(energy > 100)
			this.energy = 100;
			if (getEnergy() <= 17)
				System.out.println(getName() + " is starving");
			else if (getEnergy() > 17 && getEnergy() <= 50)
				System.out.println(getName() + " is hungry");

	}

	public void setMealAmount(double mealAmount) {
		if (mealAmount >= 0 && mealAmount <= 100)
			this.mealAmount = mealAmount;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}

	public boolean isAlive() {
		if(getEnergy() > 0)
			this.alive = true;
		else
			this.alive = false;
		return alive;
	}

	public String getName() {

		return name;
	}

	public double getEnergy() {
		return energy;
	}

	public double getMealAmount() {
		return mealAmount;
	}

	public double getX() {
		return x;
	}

	public double getY() {

		return y;
	}

	public double getSpeedX() {
		return speedX;
	}

	public double getSpeedY() {
		return speedY;
	}

	// Methods
	public String toString() {
		return getName() + ": " + (isAlive()? "alive":"dead") + " at (" + getX() + "," + getY() + ") Energy= " + getEnergy();
	}

	public void move() {
		if (isAlive()) {
			setX(getSpeedX() + getX());
			setY(getSpeedY() + getY());
			setEnergy(getEnergy() - 0.1);
		} else {
			System.out.println(getName() + " can't move. It's dead!");
		}
	}

	public void speak(String msg) {
		if (isAlive()) {
			System.out.printf("%s says: %s\n", getName(), msg);
		}
	}

	public void sound() {
		if (isAlive())
			System.out.println("Unknown sound");
	}

	public double eat() {
		if (!isAlive()) {
			System.out.println(getName() + " is dead!");
			return 0;
		}
		if(getEnergy() == 100) {
			System.out.println(getName() + " didn't eat as it's full!");
			return 0;
		}
		
		double initialEnergy = getEnergy();
		setEnergy(getEnergy() + getMealAmount());
		double eaten;
		if(getEnergy() > 100)
			eaten = 100 - initialEnergy;
		else
			eaten = getMealAmount();
		if(getEnergy() == 100)
			System.out.println(getName() + " ate " + eaten + ", now it's full!");
		else	
			System.out.println(getName() + " ate " + eaten);
		return eaten;
	}

}
