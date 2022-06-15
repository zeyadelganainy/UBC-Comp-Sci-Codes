import java.util.Date;
public class Test {

	public static void main(String[] args) {
		Date d1 = new Date();
		
		Person timmy = new Person("Person","Kelowna","(123) 456 7890", "timmy@test.com");
		Person bob = new Person();
		
		Student tom = new Student("Student","Kelowna","(123) 456 7890", "timmy@test.com","Enrolled");
		Student charlie = new Student();
		
		Employee zee = new Employee("Employee","Kelowna","(123) 456 7890", "timmy@test.com","office 1", 100, d1);
		Employee zed = new Employee("Employee","Kelowna","(123) 456 7890", "timmy@test.com");
		Employee rob = new Employee();
		
		Faculty prof = new Faculty("Faculty","Kelowna","(123) 456 7890", "timmy@test.com","office 2", 200, d1, "1 pm","lvl 100");
		Faculty doc = new Faculty();
		
		Staff driver = new Staff("Staff","Kelowna","(123) 456 7890", "timmy@test.com","Driver");
		Staff cleaner = new Staff();
		
		System.out.println(timmy.toString());
		System.out.println(tom.toString());
		System.out.println(zee.toString());
		System.out.println(zed.toString());
		System.out.println(prof.toString());
		System.out.println(driver.toString());
		
		System.out.println(bob.toString());
		System.out.println(charlie.toString());
		System.out.println(rob.toString());
		System.out.println(doc.toString());
		System.out.println(cleaner.toString());
		System.out.print("Hi\n");
		System.out.println("hey");
	}

}
