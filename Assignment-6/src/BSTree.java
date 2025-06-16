
public class BSTree {

	static class Node{
		private int data;
		private Node right, left;
		
		public Node(int value)
		{
			data = value;
			right = left = null;
		}
		
	}
	
	private Node root; 
	
	public BSTree()
	{
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void add(int value) {
		Node nn = new Node(value);
		if(root == null)
		{
			root = nn;
		}
		else
		{
			Node trav = root;
			while(true) {
				if(value < trav.data)
				{
					if(trav.left == null)
					{
						trav.left = nn;
						break;
					}
					else 
						trav = trav.left;
				}
				else 
				{
					if(trav.right == null)
					{
						trav.right = nn;
						break;
					}
					else
						trav = trav.right;
				}
			}
		}
	}
	
	private Node addRecursion(Node root, int key )
	{
		
		Node nn = new Node(key);
		if(root == null)
		{
			return nn;
			
		}
		
		if (key < root.data) {
	        root.left = addRecursion(root.left, key);
	    } else {
	        root.right = addRecursion(root.right, key);
	    }

	    return root;
		
	}
	
	
	public void addRecursion(int key) {
		root = addRecursion(root, key);
	}
	private boolean BinarySearch(Node root, int key)
	{
		Node trav = root;
		if(trav == null)
		{
			return false;
		}
		
		if(trav.data == key)
		{
			return true;
		}
		else if(trav.data > key)
		{
			return BinarySearch(trav.left , key);
		}
		else 
			return BinarySearch(trav.right, key);
	}
	
	public boolean BinarySearch(int key)
	{
		return BinarySearch(root,key);
	}
	
	private void  inOrder(Node trav)
	{
		if(trav == null)
		{
			return ;
		}
		inOrder(trav.left);
		System.out.print(" " +trav.data);
		inOrder(trav.right);
		
	}
	
	public void inOrder()
	{
		System.out.print("In Order : ");
		inOrder(root);
		System.out.println("");
	}
	
	private void  postOrder(Node trav)
	{
		if(trav == null)
		{
			return ;
		}
		postOrder(trav.left);
		
		postOrder(trav.right);
		System.out.print(" " +trav.data);
		
	}
	
	public void postOrder()
	{
		System.out.print("Post Order : ");
		postOrder(root);
		System.out.println("");
	}
	
	private void  preOrder(Node trav)
	{
		if(trav == null)
		{
			return ;
		}
		System.out.print(" " +trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
		
		
	}
	
	public void preOrder()
	{
		System.out.print("Pre Order : ");
		preOrder(root);
		System.out.println("");
	}
	
	public int successor(int key)
	{
		Node trav = root;
		while(trav != null)
		{
			if(trav.data == key)
			{
				break;
			}
			
			else if(key < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
			
		}
		
		if(trav == null)
			return -1;
		if(trav.right == null)
		{
			return -1;
		}
		Node suc = trav.right;
        
		while(suc.left != null)
		{
			suc = suc.left; 
		}
		
		return suc.data;
	}
	
	public int getDepth(int key)
	{
		int count = 0;
		Node trav = root;
		
		while(true)
		{
			if(trav == null)
			{
				break;
			}
			if(trav.data == key)
			{
				return count;
				
			}
			else if(trav.data > key)
			{
				trav = trav.left;
			}
			else 
				trav = trav.right;
			count++;
		}
		return -1;
	}
	
	public void deleteNode(int key) {
		Node trav = root;
		Node parent = null;
		
		while(trav != null)
		{
			if(key == trav.data)
				break;
			parent = trav;
			if(key < trav.data)
				trav = trav.left;
			else
				trav =  trav.right;
			
		}
		
		if(trav == null)
			return;
		if(trav.left != null && trav.right != null)
		{
			Node pred = trav.left;
			parent  = trav;
			
			while(pred.right != null)
			{
				parent = pred;
				pred = pred.right;
				
			}
			
			trav.data = pred.data;
			trav = pred;
		}
		
		if( trav.left!= null) {
			if(trav ==  root)
			{
				root= trav.left;
			}
			else if (trav == parent.left)
				parent.left = trav.left;
			else if (trav == parent.right)
				parent.right= trav.left;
		}
		
		
		else
		{
			if(trav  == root)
				root = trav.right;
			else if(trav == parent.left)
				parent.left = trav.right;
			
			else if ( trav  == parent.right)
				parent.right = trav.right;
		}
	}
	
	 public void deleteNodeRecursively(int key) {
	        root = deleteRecursively(root, key);
	    }

	    private Node deleteRecursively(Node root, int key) {
	        if (root == null)
	            return null;

	        if (key < root.data) {
	            root.left = deleteRecursively(root.left, key);
	        } else if (key > root.data) {
	            root.right = deleteRecursively(root.right, key);
	        } else {
	            // Node with only one child or no child
	            if (root.left == null)
	                return root.right;
	            else if (root.right == null)
	                return root.left;

	            // Node with two children: Get the inorder predecessor (max in left subtree)
	            Node predecessor = getMax(root.left);
	            root.data = predecessor.data;

	            // Delete the inorder predecessor
	            root.left = deleteRecursively(root.left, predecessor.data);
	        }

	        return root;
	    }

	    private Node getMax(Node node) {
	        while (node.right != null)
	            node = node.right;
	        return node;
	    }
	

	
}
