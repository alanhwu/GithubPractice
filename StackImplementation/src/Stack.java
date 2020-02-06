import java.util.ArrayList;

public class Stack<T> {

	private ArrayList<T> data;
	private int size;

	public Stack() {
		data = new ArrayList<T>();
	}

	public void push(T t) {
		data.add(t);
		size++;
	}

	public T pop() {
		size--;
		return data.remove(size);
	}

	// write the pop method
	// to remove to top element from the list

	// write the method peek which returns the last element
	// but does not remove it from the list
	public T peek() {
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
