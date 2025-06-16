
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque dq = new Deque();
		
		dq.addFirst(10);
		dq.addFirst(20);
		dq.addFirst(30);
		dq.addFirst(40);
		dq.addFirst(50);
		dq.deleteFirst();
		dq.deleteLast();
		dq.displayForward();
		dq.displayReverse();

	}

}
