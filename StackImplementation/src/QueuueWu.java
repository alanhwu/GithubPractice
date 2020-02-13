import java.util.ArrayList;

public class QueuueWu<T> {

	private Stack<T> data1;
	private Stack<T> data2;
	private int size;

	public QueuueWu() {
		data1 = new Stack<T>();
		data2 = new Stack<T>();
	}

	public T DCue(){
		if(data2.isEmpty()){
		while(!data1.isEmpty()){
			data2.push(data1.pop());
		}
		}
		return data2.pop();
	}
	
	
	
	
	
	
	
	public void add(T t) {
		data1.push(t);
		size++;
	}

	public T remove() {
		T t = data1.pop();
		size--;
		return t;
	}

	// write the pop method
	// to remove to top element from the list

	// write the method peek which returns the last element
	// but does not remove it from the list
	//public T peek() {
	//	return data1.get(0);
	//}

	public boolean isEmpty() {
		return (data1.size() == 0);
	}

	public int size() {
		return size;
	}
	
	public String toString(){
		return data1.toString();
	}

}
