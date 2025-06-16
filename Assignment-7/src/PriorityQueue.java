
public class PriorityQueue {
	private int arr[];
	private int size;
	
	public PriorityQueue(int length) {
		arr = new int[length + 1];
		size = 0;
		
	}
	
	public void add (int value) {
		size++;
		
		arr[size] = value;
		
		int ci = size;
		int pi = ci/2;
		while(pi >= 1) {
			if(arr[pi] > arr[ci])
				break;
			
			int temp = arr[pi];
			arr[pi] =  arr[ci];
			arr[ci] = temp;
			
			ci = pi;
			pi = ci/2;
		}
	}
	
	public int delete() {
		int max = arr[1];
		
		arr[1] = arr[size];
		
		size--;
		
		int pi = 1;
		int ci = pi * 2;
		
		while(ci <= size) {
			if((ci + 1) <= size && arr[ci+1] > arr[ci])
			{
				ci = ci + 1;
				
			}
			
			if(arr[ci] < arr[pi])
				break;
			
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] =  temp;
			
			pi = ci;
			ci = pi * 2;
		}
		
		return max;
	}
	
	public boolean isFull() {
		return size == arr.length -1;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getRoot() {
		return arr[1];
	}
}
