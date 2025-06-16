
public class Q5 {
	
	public static int linearSearch(int arr[], int key)
	{
		int rank =0;
		for(int i = 0; i< arr.length; i++)
		{
			if(key >= arr[i])
			{
				rank++;
			}
				
		}
		return rank;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		int key = 4;
		int rank = linearSearch(arr, key);
		System.out.println("The rank of "+key+" is: "+rank);

	}

}
