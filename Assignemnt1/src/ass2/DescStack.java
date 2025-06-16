package ass2;

import java.util.Scanner;

public class DescStack {

	private int arr[];
	private int top;
	private final int SIZE;
	
	public DescStack( int size) {
		
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	
	public  void push(int value) {	
		if(isFull())
			System.out.println("Stack is Full");
		else {
			top--;
			arr[top]=value;
		}	
	}
	
	public int pop(){
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
		    return -1;
		}
		else {
			int temp = arr[top];
			top++;
		    return temp;
		}
	}
	
	public int peek() {
	    if(isEmpty()) 
	    {
	    	System.out.println("Stack is empty");
	    	return -1;
	    }
	    else{
	    	return  arr[top];
	    	}
        
	}
	
	public boolean isFull() {
		return top ==0;
	}
	public boolean isEmpty() {
		return top == SIZE;
	}
	


	public static void main(String[] args) {
	
		DescStack ds = new DescStack(5);
		
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1.Push \n2.Pop\n3.Peek");
			System.out.println("Enter choice");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Data to be inserted");
				int data = sc.nextInt();
				ds.push(data);
				break;
			case 2:
				System.out.println("Poped data :" +ds.pop());
				break;
			case 3:
				System.out.println("Peeked data:"+ds.peek());
				break;
				
			}
			
		}while(choice !=0);

		sc.close();
	}

}
