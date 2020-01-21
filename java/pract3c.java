class pract3c
{
	public static void main(String[] s)
	{
		int numbers[] = new int[]{32,43,53,54,38,65,63,99,43,23};
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] > largest)
				largest = numbers[i];
			else if(numbers[i] < smallest)
				smallest = numbers[i];
		}
	System.out.println("Largest number is: "+largest);
	System.out.println("Smallest number is: "+smallest);	

}
}