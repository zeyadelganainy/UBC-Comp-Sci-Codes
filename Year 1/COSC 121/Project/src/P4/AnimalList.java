package P4;

import java.io.Serializable;
import java.util.Iterator;

public class AnimalList implements Iterable<Animal>, Serializable {
	// attributes
	private int size = 0;
	private AnimalNode<Animal> head = null, tail = null;

	// methods
	public boolean isEmpty() {
		return (size == 0);
	}

	public int size() {
		return size;
	}

	public void addFirst(Animal anim) {
		AnimalNode<Animal> n = new AnimalNode<Animal>(anim);
		if (isEmpty())
			head = tail = n;
		else {
			n.next = head;
			head = n;
		}
		size++;
	}

	public void addLast(Animal anim) {
		AnimalNode<Animal> animal = new AnimalNode(anim);
		if (isEmpty())
			head = tail = animal;
		else {
			tail.next = animal;
			tail = animal;
		}
		size++;
	}

	public void add(Animal anim) {
		addLast(anim);
	}

	public void add(int index, Animal anim) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		else if (index == 0)
			addFirst(anim);
		else if (index == size)
			addLast(anim);
		else {
			AnimalNode<Animal> node = new AnimalNode<Animal>(anim);
			AnimalNode<Animal> current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
				node.next = current.next;
				current.next = node;
			}
			size++;
		}

	}

	public Animal removeFirst() {
		if (isEmpty())
			return null;
		else {
			AnimalNode<Animal> temp = head;
			head = head.next;
			if (head == null)
				tail = null;
			size--;
			return temp.element;
		}
	}

	public Animal removeLast() {
		if (isEmpty())
			return null;
		else if (size == 1)
			return removeFirst();
		else {
			AnimalNode<Animal> temp = tail;
			AnimalNode<Animal> current = head;
			for (int i = 0; i < size - 2; i++)
				current = current.next;
			tail = current;
			tail.next = null;
			size--;
			return temp.element;
		}
	}

	public Animal remove(int index) {
		if (index < 0 || index > size - 1)
			throw new IndexOutOfBoundsException();
		else if (index == 0)
			return removeFirst();
		else if (index == size - 1)
			return removeLast();
		else {
			AnimalNode<Animal> prev = head;
			for (int i = 0; i < index - 1; i++)
				prev = prev.next;
			AnimalNode<Animal> current = prev.next;
			prev.next = current.next;
			size--;
			return current.element;
		}
	}

	public Animal getFirst() {
		if (isEmpty())
			return null;
		else
			return head.element;
	}

	public Animal getLast() {
		if (isEmpty())
			return null;
		else
			return tail.element;
	}

	public Animal get(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		else if (index == 0)
			return getFirst();
		else if (index == size - 1)
			return getLast();
		else {
			AnimalNode<Animal> current = head;
			for (int i = 0; i < index; i++)
				current = current.next;
			return current.element;
		}
	}

	public Animal set(int index, Animal anim) {
		if (index < 0 || index > size - 1)
			throw new IndexOutOfBoundsException();
		AnimalNode<Animal> current = head;
		for (int i = 0; i < index; i++)
			current = current.next;
		Animal temp = current.element;
		current.element = anim;
		return temp;
	}

	public String toString() {
		StringBuilder result = new StringBuilder("");
		AnimalNode<Animal> current = head;
		for (int i = 0; i < size; i++) {
			result.append(current.element);
			current = current.next;
			result.append("\n");
		}
		return result.toString();
	}

	public Iterator<Animal> iterator() {
		return new MyIterator();
	}

	public AnimalList getHungryAnimals() {
		AnimalList temp = new AnimalList();
		AnimalNode node = head;
		for (int i = 0; i < size; i++) {
			if (((Animal) node.element).getEnergy() < 50)
				temp.add((Animal) node.element);
			node = node.next;
		}
		if (temp.size() == 0)
			return null;
		return temp;
	}

	public AnimalList getStarvingAnimals() {
		AnimalList temp = new AnimalList();
		AnimalNode node = head;
		for (int i = 0; i < size; i++) {
			if (((Animal) node.element).getEnergy() < 17)
				temp.add((Animal) node.element);
			node = node.next;
		}
		if (temp.size() == 0)
			return null;
		return temp;
	}

	public AnimalList getAnimalsInBarn() {
		AnimalList temp = new AnimalList();
		AnimalNode<Animal> node = head;
		for (int i = 0; i < size; i++) {
			if ((node.element.getX() >= 50 || (node.element).getX() <= 450)
					&& ((node.element.getY() >= 150) || (node.element.getY() <= 550)))
				temp.add((Animal) node.element);
			node = node.next;
		}
		if (temp.size() == 0)
			return null;
		return temp;
	}

	public double getRequiredFood() {
		double reqFood = 0;
		AnimalNode<Animal> node = head;
		for (int i = 0; i < size; i++) {
			reqFood += (100 - node.element.getEnergy());
		}
		return reqFood;
	}

	class AnimalNode<Animal> implements Serializable {
		Animal element;
		AnimalNode<Animal> next;

		public AnimalNode(Animal anim) {
			element = anim;
		}

	}

	class MyIterator implements Iterator<Animal> {
		private AnimalNode<Animal> current = head;

		public boolean hasNext() {
			return (current != null);
		}

		public Animal next() {
			Animal temp = current.element;
			current = current.next;
			return temp;
		}
	}
}
