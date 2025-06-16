import java.util.Scanner;

public class Q2 {
	
	public static class Employee
	{
		private String name;
		
		public Employee(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Employee arr[] = {new Employee("Rahul"),new Employee("Shyam"), new Employee("Ram")};
		
		System.out.print("Enter the name to be searched : ");
		String key = sc.next();
		 
		for (int i = 0; i<arr.length; i++)
		{
			if(key.equalsIgnoreCase(arr[i].getName()))
			{
				System.out.println("Employee at index : "+i);
			}

		}
		sc.close();
		
		
		

	}

}
