import java.util.ArrayList;

public class QueuueWu<T> {

	private Stack<T> data;
	private int size;

	public QueuueWu() {
		data = new Stack<T>();
	}

	public void add(T t) {
		data.push(t);
		size++;
	}

	public T remove() {
		T t = data.pop();
		size--;
		return t;
	}

	// write the pop method
	// to remove to top element from the list

	// write the method peek which returns the last element
	// but does not remove it from the list
	public T peek() {
		return data.get(0);
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
