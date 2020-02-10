
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String> myStrs = new Stack<String>();
//		myStrs.push("Hello");
//		System.out.println(myStrs.pop());
//		System.out.println(myStrs.size());
//		
//		Stack<Integer> myNums = new Stack<Integer>();
//		myNums.push(777);
//		
//		Stack<Dave> daves = new Stack<Dave>();
//		daves.push(new Dave());
		QueQue<Integer> gang = new QueQue<Integer>();
		gang.add(3);
		gang.add(2);
		gang.add(1);
		System.out.println(gang.remove());
		gang.remove();
		System.out.println(gang.size());
//		gang.remove();
//		System.out.println(gang.size());
//		gang.remove();
//		System.out.println(gang.size());
//		System.out.println(gang.peek());
//		System.out.println(gang.size());

		
	//	System.out.println(gang.size());
//		gang.add(2);
//		System.out.println(gang.size());
//		gang.add(3);
//		System.out.println(gang.size());
//		gang.add(4);
//		System.out.println(gang.remove());
		
	}

}

class Dave{
	
}
