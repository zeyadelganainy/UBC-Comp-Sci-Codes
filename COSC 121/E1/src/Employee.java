
public class Employee extends Person {
	private String office;
	private int salary;
	private java.util.Date dateHired;
	
	public Employee() {
	}
	
	public Employee(String name, String address, String phone, String email) {
		super(name,address,phone,email);
	}
	
	public Employee(String name, String address, String phone, String email, String office, int salary, java.util.Date dateHired) {
		super(name,address,phone,email);
		setOffice(office);
		setSalary(salary);
		setDateHired(dateHired);
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public java.util.Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(java.util.Date dateHired) {
		this.dateHired = dateHired;
	}
	
	public String toString() {
		return super.toString() + "| Office: " + getOffice() + "| Salary: " + getSalary() + "| Date Hired: " + getDateHired();
		
	}
}
