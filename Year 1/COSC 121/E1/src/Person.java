
public class Person {
	private String name, address, phone, email;
	private static int count;
	
	public Person() {
		this("","","","");
	}
	
	public Person(String name, String address, String phone, String email) {
		setName(name);
		setAddress(address);
		setPhone(phone);
		setEmail(email);
		count++;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static int getCount() {
		return count;
	}
	
	public String toString() {
		return "Name: " + getName() + "| Address: " + getAddress() + "| Phone: " + getPhone() + "| E-mail: " + getEmail();
		
	}
	
}
