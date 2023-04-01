package apps;
import adts.ArrayListQueue;
import adts.ArrayQ;

public class QPlay {

	public static void main(String[] args) {
		
		 ArrayListQueue<String> myQ = new  ArrayListQueue<String>();
		
		myQ.enqueue("Mets");
		myQ.enqueue("Nationals");
		myQ.enqueue("Phillies");
		myQ.enqueue("Braves");
		myQ.enqueue("Marlins");
		System.out.println(myQ);
		
		System.out.println(myQ);
		
		
		System.out.println(myQ.isEmpty() ? "myQ is empty" : "myQ is not empty");
		System.out.println(myQ.isFull()  ? "myQ is full"  : "myQ is not full");
	    System.out.println(myQ.dequeue());  
		myQ.dequeue();
		myQ.dequeue();
		myQ.dequeue();
		myQ.dequeue();
		System.out.println(myQ);
		System.out.println(myQ.isEmpty() ? "myQ is empty" : "myQ is not empty");
		System.out.println(myQ.isFull()  ? "myQ is full"  : "myQ is not full");
		
		
		ArrayListQueue<Integer> myIntQ = new ArrayListQueue<Integer>();
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				myIntQ.enqueue(i);
			}
		}
		System.out.println(myIntQ);
		
		while (!myIntQ.isEmpty()) {
			myIntQ.dequeue();
		}
		System.out.println(myIntQ);
		System.out.println(myIntQ.isEmpty() ? "It's empty now!" : "How did I get here?");
		/**/

	}

}