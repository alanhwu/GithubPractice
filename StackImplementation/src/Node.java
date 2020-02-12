
public class Node<T> {
	private T data;
	public Node next;
	
	public Node(T t){
		data = t;
	}
	
	// returns next ref
	public Node next(){
		return next;
	}
	
	
}
