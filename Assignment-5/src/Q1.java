
public class Q1 {

	public static void main(String[] args) {
		List l = new List();
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.addLast(50);
		l.addPosition(60, 5);
		
		l.deleteLast();
		l.display();
	}
}
