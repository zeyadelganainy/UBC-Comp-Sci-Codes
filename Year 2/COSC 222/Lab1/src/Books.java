
public class Books {
	private String name;
	private String author;
	private String category;
	private double price;

	// constructor
	public Books(String name, String author, String category, double price) {
		this.name = name;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	// getter methods
	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	// setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// toString method, e.g. "Carrie, written by Stephen King (Category: Horror,
	// Price: 50.0)"
	@Override
	public String toString() {
		return name + ", written by " + author + " (Category: " + category + ", Price: " + price + ")";
	}
}