
public class LinkedList<T> { //<T> allows us to useand data type
	private int size; //number of elements in list
	private Node<T> head; //reference to front of the list
	
	
	public LinkedList() {
		//job of the contructor is to
		//initialize the instance variables
	}
	
	
	public int size() {
		return size;
	}
	
	public Node peek() {
		return head;
	}
	
	//add a node at the end of the list
	
	public void Add(T t) {
		T.add(t);
		size++;
		
		if(head ==null) {
			Node n = new Node(t);
			head = n;
		}
		Node temp = head;
		while(temp.next!=null) {
			//we know it snot the end of hte list unles th enext node reference
			// is pointing to null
			temp = temp.next;
		}
		temp.next = new Node(t); //done!
		
		
	}
	
	public void addFront(T t) {
		
	}
	
	public Node remove() {
		return 
	}
	
	
	//remove Node at index i
	//REQUIRES: i<size
	public Node remove(int i) {
		
	}
	
	//ISCIRCULAR IS ON THE EXAM
	
	public peek() {
		return 
	}
}
