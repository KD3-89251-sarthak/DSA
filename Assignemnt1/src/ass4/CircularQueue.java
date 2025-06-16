package ass4;

import java.util.Scanner;

public class CircularQueue {
	private int arr[];
	private int front,rear;
	private final int SIZE;
	private int count;
	
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
		count = 0;
	}
	public void push(int value) {
		if(isFull())
			System.out.println("Queue is Full");
		else {
			arr[rear]= value;
			rear = (rear + 1) % SIZE;
			count++;
		}
		
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		    return -1;
		}
		else {
			int temp = arr[front];
			front = (front+1)%SIZE;
			count--;
			return temp;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return -1;
		}
		else {
			return arr[front];
		}
		
	}
	
	public boolean isEmpty() {
	
		 return count ==0;
		
	}
	
	public boolean isFull() {
		
		return count == SIZE;
		
	}
	
	

	public static void main(String[] args) {
		

		CircularQueue q = new CircularQueue(4);

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n0.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to be pushed: ");
                    int value = sc.nextInt();
                    q.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + q.pop());
                    break;
                case 3:
                    System.out.println("Peeked value: " + q.peek());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

		
	}

}
