
public class Deque {
	
	public static class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	private Node tail;
	
	private int count ;
	
	public  Deque()
	{
		head= tail  = null;
		count =  0;
		
	}
	
	public boolean isEmpty()
	{
		return count==0;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(head == null)
		{
			head = tail = newnode;
		}
		else
		{
			newnode.next = head;
			head.prev = newnode;
			head = newnode;	
		}
		count++;
		
	}
	
	public void deleteLast()
	{
		if(head == null) 
		{
			return;
		}
		else if(head == tail)
		{
			head = tail = null;
		}
		else {
			tail = tail.prev;
			tail.next = null;
		}
		count--;
	}
	
	public void deleteFirst()
	{
		if(head == null) 
		{
			return;
		}
		else if(head == tail)
		{
			head = tail = null;
		}
		else {
			
			head = head.next;
			head.prev = null;
		}
		
		count--;
	}
	
	public void displayForward()
	{
		Node trav = head;
		System.out.print("Forward List :");
		while(trav != null)
		{
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void displayReverse()
	{
		Node trav = tail;
		System.out.print("Reverse List :");
		while(trav != null)
		{
			System.out.print(" "+trav.data);
			trav = trav.prev;
		}
		System.out.println("");
	}
	
	

}
