
public class Q1 {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(9);
		
		System.out.println("isEmpty : " + q.isEmpty());
		System.out.println("isFull : " + q.isFull());
		
		q.add(6);
		q.add(14);
		q.add(3);
		q.add(26);
		
		System.out.println("Peeked data : " + q.getRoot());
		
		q.delete();
		System.out.println("Peeked data : " + q.getRoot());
		q.delete();
		System.out.println("Peeked data : " + q.getRoot());
	}

}
