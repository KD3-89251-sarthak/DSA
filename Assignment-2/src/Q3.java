import java.util.Scanner;

public class Q3 {
	
	public static boolean sortedArray(int arr[])
	{

		for(int i = 1; i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				return false;
			}
		}
		return true;
	}
	
	public static int binarySearch(int arr[], int key)
	{
		int start = 0, end = arr.length-1, mid;
		
		while(start <= end)
		{
			mid = (start+end)/2;
			if(key == arr[mid])
			{
				return mid;
			}
			else if(key >arr[mid])
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {99, 88, 77, 66, 55, 44, 33, 22, 11};
		
		if(sortedArray(arr))
		{
			System.out.println("Sorted array");
			System.out.print("Enter the key to be searched : ");
			int key = sc.nextInt();
			int index = binarySearch(arr, key);
			if(index == -1)
			{
				System.out.println("No such element in array");
			}
			else 
			{
				System.out.println("Element present at index : "+index);
			}
		}
		else 
		{
			System.out.println("Not sorted array");
		}
		sc.close();
	}

}
