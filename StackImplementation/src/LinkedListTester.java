
public class LinkedListTester {
	public static void main(String[] args) {
		LinkedList<Integer> gang = new LinkedList<Integer>();
		gang.add(3);	System.out.println(gang.size());
		gang.addFront(2);	System.out.println(gang.size());
		gang.add(1);	System.out.println(gang.size());
		gang.add(-5);	System.out.println(gang.size());
		gang.remove();	System.out.println(gang.size());
	gang.remove(0);
	System.out.println(gang.size());
	
		System.out.println(gang.toString());
		

	}
}
