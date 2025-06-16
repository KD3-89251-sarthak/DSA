
public class Q1 {

	public static void main(String[] args) {
		BSTree tree = new BSTree();
		tree.add(8);
		tree.add(3);
		tree.add(10);
		tree.add(2);
		tree.add(6);
		tree.add(15);
		tree.add(14);
		if(tree.BinarySearch(8))
			System.out.println("Key found");
		else 
			System.out.println("Key Not Found");
		
		tree.inOrder();
		tree.postOrder();
		tree.preOrder();
		

	}

}
