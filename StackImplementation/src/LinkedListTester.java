
public class LinkedListTester {
	public static void main(String[] args) {
		LinkedList<Integer> gang = new LinkedList<Integer>();
		gang.add(3);
		gang.addFront(2);
		gang.add(1);
		gang.add(-5);
		gang.remove();

		System.out.println(gang.toString());
		

	}
}
