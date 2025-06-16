
public class Q1 {
	
	public static int LinearSearch(int arr[],int key)
	{
		int index = -1;
		for(int i = 0; i<arr.length;i++)
		{
			if(key == arr[i])
			{
				index = i;
			}
			
		}
		return index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 22, 66};
        int index = LinearSearch(arr, 44);
        if(index == -1)
        	System.out.println("No element found");
        else
        	System.out.println("Element last occurence at index : "+ index);
	}

}
