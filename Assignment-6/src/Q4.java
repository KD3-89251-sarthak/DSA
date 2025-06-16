
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub''
		
		
		BSTree tre = new BSTree();
		tre.addRecursion(8);
		tre.addRecursion(3);
		tre.addRecursion(10);
		tre.addRecursion(2);
		tre.addRecursion(15);
		tre.addRecursion(6);
		tre.addRecursion(14);
		tre.addRecursion(4);
		tre.addRecursion(7);
		
		tre.deleteNode(8);
		tre.deleteNodeRecursively(7);
		
		tre.inOrder();

	}

}
