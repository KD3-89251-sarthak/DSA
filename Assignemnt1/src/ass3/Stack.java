package ass3;

import java.util.Scanner;

public class Stack {
	private int arr[];
    private int top;
    private final int SIZE;
    
    public Stack(int size) {
    	SIZE = size;
    	arr = new int[SIZE];
    	top = -1;
    }
    
    public void push(int value) {
    
    	if(isFull())
    	   System.out.println("Stack is Full");
    	else 
    	{
    	  //1. reposition top 
    		top++;
    	  //2. add value at top index
    		arr[top] = value;
    	}
    }
    
    public int pop() {
    int temp = -1;
    if(isEmpty())
    	System.out.println("Stack is Empty");
    else
    {
    	temp = arr[top];
    	//1. reposition top 
    	top--;
    }
     return temp;
    }
    
    public int peek() {
    
    	int temp = -1;
    	if(isEmpty())
    	System.out.println();
    	{
    		// Read Value of top index and return 
    		temp = arr[top];
    	}
    	return temp;
    }
    
    public boolean isFull() {
    	return top == SIZE-1;
    }
    public boolean isEmpty() {
    	return top == -1;
    }
	

	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Input array
		
		int arr[] = {10,20,30,40,50};
		
		System.out.println("Before");
		for(int val : arr)
		{
			System.out.println(val+" ");
		}
		
		Stack st = new Stack(5);
		
		System.out.println("After that ");
		
		for(int i=0; i<arr.length; i++) {
			st.push(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=st.pop();
		}
		
		System.out.println("\nReversed array");
		for(int val : arr) {
			System.out.println(val + " ");
		}
		
		
		
	}

}
