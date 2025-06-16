import java.util.ArrayList;

public class List {
	
	public static class Node
	{
		private int data;
		private Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	
	public List() 
	{
		head= null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addPosition(int value, int target)
	{
		Node newnode = new Node(value);
	
		if (head == null) {
	        head = newnode;
	        return;
	    }
		
		Node temp = head;

		while(temp != null)
		{
			if(temp.data == target)
			{
				System.out.println("Data Inserted at : "+target);
				newnode.next = temp.next;
	            temp.next = newnode;
	            return;
			}
			else
			{
				temp = temp.next;
			}
		}
		System.out.println("Target value not found");
	}
	
	public void addPositionBefore(int value, int target)
	{
		Node newnode = new Node(value);
	
		if (head == null) {
	        head = newnode;
	        return;
	    }
		
		Node temp = head;

		while(temp != null)
		{
			if(temp.next.data == target)
			{
				System.out.println("Data Inserted before at : "+target);
				newnode.next = temp.next;
	            temp.next = newnode;
	            return;
			}
			else
			{
				temp = temp.next;
			}
		}
		System.out.println("Target value not found");
	}
	
	
	public void insertSorted(int data)
	{
		Node newnode = new Node(data);
		if(head == null || head.data >= data)
		{
			newnode.next = head;
			head = newnode;
			return;
		}
		Node temp = head;
		while (temp.next != null && temp.next.data < data) 
		{
			temp = temp.next;
	    }
		newnode.next = temp.next;
		temp.next = newnode;
		
		
	}
	
	public void displayReverse() 
	{
		ArrayList<Integer> list = new ArrayList<>();
		Node temp = head;
		
		while(temp != null)
		{
			list.add(temp.data);
			temp = temp.next;
		}
		
		for(int i = list.size()-1 ; i >= 0 ; i--)
		{
			
			if(i == 0)
			{
				System.out.print(list.get(i));
			}
			else
			{
				System.out.print(list.get(i)+"->");
			}
		}
		
	}
}
