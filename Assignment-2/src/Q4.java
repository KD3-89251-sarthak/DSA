
public class Q4 {
	
	public static int linearSearch(int arr[], int key, int occ)
	{
		int n = 0;
		for(int i = 0 ; i< arr.length && n<=occ; i++)
		{
			if(key == arr[i])
			{
				n++;
				if(n == occ)
				{
					return i;
				}
				
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2 ,3 ,4 , 5, 2, 4, 6, 2, 2, 4, 1, 3, 5};
		int key = 3;
		int occ = 2;
		int index = linearSearch(arr, key, occ );
		if(index == -1)
		{
			System.out.println("No such element in array at this occurence");
		}
		else 
		{
			System.out.println("Element present at index : "+index);
		}
		

	}

}
