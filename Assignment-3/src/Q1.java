import java.util.Arrays;

public class Q1 {
	
	public static void InsertionSort(int arr[], int N)
	{
		for (int i = 1; i<N; i++ )
		{
			int temp = arr[i];
			int j;
			for( j = i-1; j>=0; j--)
			{
				if(temp > arr[j])
				{
					arr[j+1] = arr[j];
				}
				else 
				{
					break;
				}
			}
			
			arr[j+1] = temp;
					
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		InsertionSort(arr, arr.length);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
		

	}

}
