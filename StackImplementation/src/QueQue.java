
public class QueQue<T> {
	private Stack<T> data1;
	private Stack<T> data2;
	private int size;

	public QueQue() {
		data1 = new Stack<T>(); // create 2 stacks to hold data
		data2 = new Stack<T>();
	}

	public T remove() {
		if (data1.isEmpty()) { // if it's empty make sure not to remove and return null instead
			return null;
		}
		if (data2.isEmpty()) { // take the top off data 1 and add it to data2
			while (!data1.isEmpty()) {
				data2.push(data1.pop());
			}
			size--; // make sure to decrease the size after removal of an element
		}
		return data2.peek();
	}

	public void add(T t) {
		data1.push(t); // adding is like pushing
		size++; // increase size by 1 after adding something
	}

	public T peek() {
		// return data1.peek();
		for (int i = 0; i < size; i++) { // this loop will put the elements in data1 to data2.
			data2.push(data1.pop()); // This loop reverses it so that we don't need to chance peek()
		}
		return data2.peek();
	}

	public boolean isEmpty() {
		return (data1.size() == 0); // return true if the size is 0 which indicates that it's empty
	}

	public int size() {
		return size;
	}

	public String toString() {
		return data1.toString();
	}
}
