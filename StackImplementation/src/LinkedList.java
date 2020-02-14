public class LinkedList<T> { // <T> allows us to useand data type
	private int size; // number of elements in list
	private Node<T> head; // reference to front of the list

	public LinkedList() {
		// job of the contructor is to
		// initialize the instance variables
		size = 0;
		head = null;
	}

	public int size() {
		return size; // return size when called
	}

	public Node<T> peek() {
		if (head == null) { //if there's no head, make sure it returns null
			return null;
		} else {
			return head; // peeking shows us the first element in the list
		}
	}

	// add a node at the end of the list

	public void add(T t) {
		if (head == null) { // check for null pointer
			head = new Node<T>(t); // if there's nothing, add just set the head to the new node
		} else {

			Node<T> temp = head;

			while (temp.next != null) {
				// we know it's not the end of the list unless the next node reference
				// is pointing to null
				temp = temp.next;
			}
			temp.next = new Node<T>(t); // done!
		}

		size++;
	}

	public void addFront(T t) {

		if (head == null) {
			head = new Node<T>(t); // if there's no head, then the next node becomes the head

		} else {
			Node<T> newhead = new Node<T>(t); // makes it into a new node
			newhead.next = head; // makes this new node into the new head
			head = newhead;
		}
		size++; // increment size after adding an element
	}

	public Node<T> remove() {
		
		Node<T> temp = head; //make new tracker starting from head
		if(head!=null){ //make sure it exists
			head=head.next(); //set the head to the next one in the list (will kill off the first head)
			size--; //decrease size by 1
		}
		return temp;
	}

	// remove Node at index i
	// REQUIRES: i<size
	public Node<T> remove(int i) {

		Node<T> current = head; //make a new node starting from head to traverse
		int count = 0; //use a counter to keep track where we are in the list
		if (i == 0 && head != null) { //if it's removing index 0, just do exactly what normal remove would do
			head = head.next;
			return head;
		}

		while (count < i - 1 && current.next != null) { //when we haven't reached the index yet and we haven't reached the edge
			current = current.next; //keep moving to the right until we reach the index or the edge
			count++; //increase count each time to get closer to target
		}
		current.next = current.next.next(); //the strategy is to go AROUND it and just make the "next" skip to the next next one.
		return head;

//		
//		Node<T> temp = head;
//		Node<T> left = null; // create this node to keep track of the previous node
//		if (i == 0 && head != null) { // if it's 0, it means that the head needs to be removed
//			head = head.next;
//		}
//
//		int count = -1; // use a counter to keep track of position
//
//		while (temp != null) {
//			if (count == i) { // we finish when the count reaches i
//				left.next = temp.next;
//				break;
//			} else { // if not, then we keep going and move to the next node and increment
//
//				left = temp;
//				temp = temp.next; // next node
//				count++; // track position
//			}
//
//		}
//		size--; // decrease the size by 1 after an element is removed (when this method finishes
//				// running)
//		return head;
	}

	public String toString() {
		String result = "";
		Node current = head;
		while (current.next() != null) {
			result += current.next().toString();
			if (current.next() != null) {
				result += ", ";
			}
			current = current.next();
		}
		return ("List: " + result.toString()).toString();
	}
	// ISCIRCULAR IS ON THE EXAM

	/*
	 * Successes
==========
0: Test instantiation does not throw exception
1: Test size method on empty
2: Test peek on empty
3: Test add 1 element and get size
4: Test add 1 element and peek
5: Test add 2 elements and peek
6: Test call to add, remove, and size
7: Test call to add, remove, remove, and size
8: Test call to add, remove, and peek
9: Test call to add, add, remove, and peek
10: Test call to add, add, remove at 0, and peek
11: Test call to add 3 2 1 -5 remove at 1, and peek
12: Test call to add 3 2 1 -5 remove at 1, remove, and peek
13: Test call to add 3 2 1 remove 4 times, peek
14: Test addFront twice and peek
15: Test addFront twice, remove, peek
16: undisclosed test 0
17: undisclosed test 1
18: undisclosed test 2
==========
Failures
==========
0: Test add 2 elements and remove
Score:
19
	 * 
	 */
}