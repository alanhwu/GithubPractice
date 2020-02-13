
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
	
	public Node<T> peek() {
		return head;
	}
	
	//add a node at the end of the list
	
	public void add(T t) {
		if(head == null) { //check for null pointer
			Node<T> n = new Node<T>(t); //if there's nothing, add just set the head to the new node
			head = n;
		}
		
		Node<T> temp = head;
		//aa

		while(temp.next!=null) {
			//we know it's not the end of the list unless the next node reference
			// is pointing to null
			temp = temp.next;
		}
		temp.next = new Node<T>(t); //done!
		
		size++;
	}
	
	public void addFront(T t) {
		//head = new Node<T>(t, head);
		
		if(head == null){
			head = new Node<T>(t);
			
			
		}else{
			Node<T> n = new Node<T>(t);
			n.next = head.next;
			head.next = n;
		}
		size++;
	}
	
	public Node<T> remove() {
		if(size==0){ //return null if it's empty
			return null;
		}else{
			Node<T> temp = head;
			head = temp.next;
			size--;
			return head;
		}
	
	}
	
	
	//remove Node at index i
	//REQUIRES: i<size
	public Node remove(int i) {
		Node<T> temp = head;
		for(int j = 0; j<i; j++){
			head = temp.next;
			head = temp.next.next;
		}
		size--;
		return head;
	}
	
	 public String toString(){
		String result = "";
        Node current = head;
        while(current.next() != null){
            result += current.next().toString();
            if(current.next() != null){
                 result += ", ";
            }
            current = current.next();
        }
        return ("List: " + result.toString()).toString();
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
