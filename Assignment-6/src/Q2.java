
public class Q2 {

	public static void main(String[] args) {
		BSTree tree = new BSTree();
		tree.add(8);
		tree.add(3);
		tree.add(10);
		tree.add(2);
		tree.add(15);
		tree.add(6);
		tree.add(14);
		tree.add(4);
		tree.add(7);
		
		tree.inOrder();

		System.out.println(tree.successor(10));
		System.out.println(tree.successor(8));
		System.out.println(tree.successor(15));
		System.out.println(tree.successor(6));
		tree.inOrder();
	}

}
