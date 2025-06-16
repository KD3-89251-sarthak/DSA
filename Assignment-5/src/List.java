

public class List {
	static class Node
	{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	
	private int count;
	
	public List()
	{
		//System.out.println("Constructor");
		tail = null;
	}
	
	public void display()
	{
		if(tail ==  null)
			return;
		Node trav = tail.next;
		do {
			System.out.print(" "+trav.data);
			trav = trav.next;
			
		}while(trav != tail.next);
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(tail == null)
		{
			tail = newnode;
			newnode.next = tail;
		}
		else
		{
			newnode.next = tail.next;
			tail.next = newnode;
		}
		count++;
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		if(tail == null)
		{
			tail = newnode;
			newnode.next = tail;
		}
		else
		{
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}
	
	public void addPosition(int value, int pos)
	{
		
		Node newnode = new Node(value);
		Node trav = tail.next;
		if(tail == null)
		{
			return;
		}
		
		if(count == pos) {
			addLast(value);
		}
		else if(pos == 0) {
			addFirst(value);
		}
		else
		{
			for(int i = 0; i<pos-1; i++)
				trav = trav.next;
			newnode.next = trav.next;
			trav.next = newnode;
		}
		count++;
	}
	
	public void deleteFirst()
	{
		if(tail == null)
			return;
		
		if(tail == tail.next)
			tail = null;
		else
		{
			tail.next = tail.next.next;
		}
	}
	
	public void deleteLast()
	{
		if(tail == null)
			return;
		
		if(tail == tail.next)
			tail = null;
		else
		{
			Node trav = tail.next;
			while(trav.next != tail)
			{
				trav = trav.next;
				
			}
			trav.next = tail.next;
			tail = trav;
			
		}
	}
	

}
