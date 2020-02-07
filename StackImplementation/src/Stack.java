import java.util.ArrayList;

public class Stack<TBA_TYPE> { //--> <T> allows you to generate the TYPE stored in the class

	private ArrayList<TBA_TYPE> data; // <T> works because of line 3 which represents the TYPE as T
	private int size;

	public Stack() {
		data = new ArrayList<TBA_TYPE>();
	}

	public void push(TBA_TYPE t) {
		data.add(t);
		size++;
	}

	public TBA_TYPE pop() {
		size--;
		return data.remove(size);
	}

	// write the pop method
	// to remove to top element from the list

	// write the method peek which returns the last element
	// but does not remove it from the list
	public TBA_TYPE peek() {
		return data.get(size);
	}

	public boolean isEmpty() {
		return (data.size() == 0);
	}

	public int size() {
		return size;
	}
	
	public String toString(){
		return data.toString();
	}

}
