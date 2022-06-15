
public class BankAccount {
	
	//Attributes
	
	private int id;
	private double balance, annualInterestRate;
	private static int count;
	
	//Constructors
	
	public BankAccount(double interestRate, double bal) {
		annualInterestRate = interestRate;
		balance = bal;
		count++;
		id = count;
	}
	
	public BankAccount() {
		this(0,0);
	}
	
	//Setters & Getters
	
	public void setBalance(double bal) {
		balance = bal;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setAnnualInterestRate(double rate) {
		annualInterestRate = rate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public int getId() {
		return id;
	}
	
	//Methods
	
	public double getMonthlyInterest() {
		return balance * ((annualInterestRate / 12) / 100);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void displayInfo() {
		System.out.printf("Account ID: %d\n", id);
		System.out.printf("Current balance: $%.1f \n", balance);
		System.out.printf("Annual interest Rate: %.3f %%\n", getAnnualInterestRate());
		System.out.printf("Monthly interest Rate: %.3f %% \n", getAnnualInterestRate() / 12);
		System.out.printf("Monthly interest: $%.3f\n", getMonthlyInterest());
	}
}