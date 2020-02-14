
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
		return head; // peeking shows us the first element in the list
	}

	// add a node at the end of the list

	public void add(T t) {
		if (head == null) { // check for null pointer
			Node<T> n = new Node<T>(t); // if there's nothing, add just set the head to the new node
			head = n;
		}

		Node<T> temp = head;
		// aa

		while (temp.next != null) {
			// we know it's not the end of the list unless the next node reference
			// is pointing to null
			temp = temp.next;
		}
		temp.next = new Node<T>(t); // done!

		size++;
	}

	public void addFront(T t) {

		if (head == null) {
			head = new Node<T>(t); // if there's no head, then the next node becomes the head

		} else {
			Node<T> n = new Node<T>(t); // makes it into a new node
			n.next = head.next; // makes this new node into the new head
			head.next = n;
		}
		size++; // increment size after adding an element
	}

	public Node<T> remove() {
		if (size == 0) { // return null if it's empty
			return null;
		} else {
			Node<T> temp = head;
			head = temp.next; // replaces the head with the next element
			size--; // decrement size after removing an element
			return head;
		}

	}

	// remove Node at index i
	// REQUIRES: i<size
	public Node remove(int i) {
		Node<T> temp = head;
		Node<T> left = null; // create this node to keep track of the previous node
		if (i == 0 && temp != null) { // if it's 0, it means that the head needs to be removed
			head = temp.next;
		}

		int count = -1; // use a counter to keep track of position

		while (temp != null) {
			if (count == i) { // we finish when the count reaches i
				left.next = temp.next;
				break;
			} else { // if not, then we keep going and move to the next node and increment

				left = temp;
				temp = temp.next; // next node
				count++; // track position
			}

		}
		size--; // decrease the size by 1 after an element is removed (when this method finishes
				// running)
		return head;
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
6: Test add 2 elements and remove
7: Test call to add, remove, and size
8: Test call to add, remove, remove, and size
9: Test call to add 3 2 1 -5 remove at 1, and peek
10: undisclosed test 0
11: undisclosed test 1
==========
Failures
==========
0: Test call to add, remove, and peek
1: Test call to add, add, remove, and peek
2: Test call to add, add, remove at 0, and peek
3: Test call to add 3 2 1 -5 remove at 1, remove, and peek returned:3
4: Test call to add 3 2 1 remove 4 times, peek did not return null
5: Test addFront twice and peek
6: Test addFront twice, remove, peek
7: undisclosed test 2

Score:
12
	 * 
	 * 
	 */
}
