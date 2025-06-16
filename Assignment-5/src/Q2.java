
public class Q2 {

	public static void main(String[] args) {
		int arr[] = {1,2,5,3,2,3,5,3};
		int max = 0;
		for(int i = 0; i < arr.length ; i++)
		{
		   if(arr[i] > max)
		   {
			   max = arr[i];
			   //System.out.println(max);
		   }
		}
		
		int arr1[] = new int[max];
		
		for(int i = 0; i<arr.length;i++)
		{
			
			//System.out.println(arr1[arr[i]]);
			arr1[arr[i]-1] = arr1[arr[i]-1]+1;
		}
		int mode = 0;
		for(int i = 0; i<arr1.length;i++)
		{
			
			if(arr1[i]> mode)
			{
				mode = arr1[i];
			}
			
			System.out.println(arr1[i]);
		}
		
		System.out.println("Mode of the array is : "+mode);

	}

}
