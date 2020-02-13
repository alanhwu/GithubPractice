
public class LinkedList<T> { //<T> allows us to useand data type
	private int size; //number of elements in list
	private Node<T> head; //reference to front of the list
	
	
	public LinkedList() {
		//job of the contructor is to
		//initialize the instance variables
		size = 0;
		head = null;
	}
	
	
	public int size() {
		return size;
	}
	
	public Node peek() {
		return head;
	}
	
	//add a node at the end of the list
	
	public void add(T t) {
		if(head == null) {
			Node n = new Node(t);
			head = n;
		}
		
		Node temp = head;
		

		while(temp.next!=null) {
			//we know it's not the end of the list unless the next node reference
			// is pointing to null
			temp = temp.next;
		}
		temp.next = new Node(t); //done!
		
		size++;
	}
	
	public void addFront(T t) {
		//head = new Node<T>(t, head);
		
		if(head == null){
			head = new Node(t);
		}else{
			Node n = new Node(t);
			n.next = head;
			head = n;
		}
		size++;
	}
	
	public Node remove() {
		if(size==0){ //return null if it's empty
			return null;
		}else{
			head = head.next;
			head.next = head.next.next;
			size--;
		}
		return head;
	}
	
	
	//remove Node at index i
	//REQUIRES: i<size
	public Node remove(int i) {
		for(int j = 0; j<i; j++){
			head = head.next;
			head = head.next.next;
		}
		size--;
		return head;
	}
	
	public String toString(){
		return head.toString();
		}
	//ISCIRCULAR IS ON THE EXAM
	

}


/*
 * Successes
==========
0: Test instantiation does not throw exception
1: Test size method on empty
2: Test peek on empty
3: Test add 1 element and get size
4: Test add 1 element and peek
5: Test add 2 elements and peek
6: Test add 2 elements and remove
==========
Failures
==========
0: Exception: Test call to add, remove, and size aborting - expected 0 after emptying list

Score:
7Successes
==========
0: Test instantiation does not throw exception
1: Test size method on empty
2: Test peek on empty
3: Test add 1 element and get size
4: Test add 1 element and peek
5: Test add 2 elements and peek
6: Test add 2 elements and remove
==========
Failures
==========
0: Exception: Test call to add, remove, and size aborting - expected 0 after emptying list

Score:
7
 * 
*/
