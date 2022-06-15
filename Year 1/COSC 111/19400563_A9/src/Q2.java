
public class Q2 {

	public static void main(String[] args) {

		// Creating an object of the class BankAccount named acc1:
		BankAccount acc1 = new BankAccount(6.7, 33000);

		// Testing the class BankAccount
		acc1.withdraw(1500);
		acc1.deposit(1000);
		acc1.displayInfo();

	}

}
