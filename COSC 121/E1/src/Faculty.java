
public class Faculty extends Employee {
	private String officeHour, rank;
	
	public Faculty() {
	}
	
	public Faculty(String name, String address, String phone, String email, String office, int salary, java.util.Date date, String officeHour, String rank) {
		super(name,address,phone,email,office,salary,date);
		setOfficeHour(officeHour);
		setRank(rank);
	}

	public String getOfficeHour() {
		return officeHour;
	}

	public void setOfficeHour(String officeHour) {
		this.officeHour = officeHour;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + "| Office Hour: " + getOfficeHour() + "| Rank: " + getRank();
			
	}
}
