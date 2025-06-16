package ass1;

import java.util.Scanner;

public class LinearQueue {
	
	private int arr[];
	private int front , rear;
	private final int SIZE;
	
	public LinearQueue( int size) {
		
		SIZE = size;
		arr = new int [SIZE];
		front = rear = 0;	
	}
	
	public void push(int value)
	{
		if(isFull())
			System.out.println("Queue is Full");
		else {
			arr[rear] = value;
			rear++;
			
		}
	}
	
	public int pop() {
		int temp = 0;
       if(isEmpty())
    	   System.out.println("Queue is empty");
       else {
    	   temp = arr[front];
    	   //1.reposition
    	   front++;
    	   if(front == rear)
    		   front = rear = 0;   
       }
       return temp;
	}

	public int peek() {
		int temp = 0;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			// read data from front + 1 index
			temp = arr[front];
			front++;
		}
		return temp;
	}
	
	
	
	public boolean isFull() {
	
		return rear == SIZE;
		
	}
	public boolean isEmpty() {
	
		return front==rear;
	}
	
	
	
public static void main(String[] args) {
		
		LinearQueue q = new LinearQueue(5);
		
		int choice ;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.Push \n2. Pop \n3.Peek");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter value to be pushed");
				int value = sc.nextInt();
				q.push(value);
				break;
			
			case 2 :
				System.out.println("Value Poped" + q.pop());
				break;
				
			case 3:
				System.out.println("Peek Value" +q.peek());
				break;
			    
			
		}
			
	}while(choice !=0);
		
		sc.close();	
}	
}
