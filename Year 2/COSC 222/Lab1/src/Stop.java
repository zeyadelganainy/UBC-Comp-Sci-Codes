
public class Stop {
	private String address;
	private int orderNumber;
	private Stop next, previous;

	public Stop(String address, int orderNumber) {
		this.address = address;
		this.orderNumber = orderNumber;
		next = null;
		previous = null;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Stop getNext() {
		return next;
	}

	public void setNext(Stop next) {
		this.next = next;
	}

	public Stop getPrevious() {
		return previous;
	}

	public void setPrevious(Stop previous) {
		this.previous = previous;
	}

	public String toString() {
		return address + " (" + orderNumber + ")";
	}
	
}
