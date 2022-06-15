
public class Route {

	private Stop start, end;

	public Route() {

		start = end = null;

	}

	public boolean isEmpty() {
		return start == end;
	}

	@Override
	public String toString() {
		if (start == null)
			return "No stops on route";
		return start + ", end=" + end + "]";
	}

	void addStart(String address, int orderNumber) {
		Stop newStop = new Stop(address, orderNumber);
		if (isEmpty()) {
			start = end = newStop;
			return;
		}

		Stop temp = start;
		temp.setPrevious(newStop);
		newStop.setNext(temp);
		start = newStop;
	}

	void addEnd(String address, int orderNumber) {
		Stop newStop = new Stop(address, orderNumber);
		if (isEmpty()) {
			start = end = newStop;
			return;
		}

		Stop temp = end;
		temp.setNext(newStop);
		newStop.setPrevious(temp);
		end = newStop;
	}

	void insert(String address, int orderNumber) {
		Stop prev = null;
		Stop next = start;
		
		while(next != null && ((next.getAddress().compareToIgnoreCase(address) < 0))){
			prev = next;
			next = next.getNext();
		}
		Stop newStop = new Stop(address, orderNumber);
		if(prev ==null)
			start = newStop;
		else
			prev.setNext(newStop);
		
	}
}
