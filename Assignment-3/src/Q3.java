
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new List();
		
		l.addPosition(30, 20);
		l.addPosition(20, 30);
		l.addPosition(40, 20);
		l.addPositionBefore(50, 20);
		l.addPositionBefore(30, 50);
		
		l.displayReverse();
	}

}
