import java.util.*;

class pract4a
{
	Scanner input = new Scanner(System.in);
	int num, i;
	int arr[];
	int temp = 0;
	public void getdata()
	{
		System.out.println("Enter the size of array: ");
		num = input.nextInt();
		arr = new int[num];
		System.out.println("Enter the number: ");
		
		for(i = 0; i < num; i++)
			{
			arr[i] = input.nextInt();
			}
	}
	
	void putdata()
	{
		System.out.println("Given numbers are: ");
		
		for(i = 0; i < num; i++)
			{
			System.out.println(arr[i]);
			}
	}

	void asce()
	{
		for(i = 0; i < num; i++)
		{
			for(int j = i+1; j < num; j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Ascending order of numbers are: ");
		for(int i = 0; i < num; i++)
		{
			System.out.println(arr[i]);
		}
	}

	void desc()
	{
		for(i = 0; i < num; i++)
		{
			for(int j = i+1; j < num; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Descending order of numbers are: ");
		for(int i = 0; i < num; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] s)
	{
		pract4a ob = new pract4a();
		ob.getdata();
		ob.putdata();
		ob.asce();
		ob.desc();
	}
}
			