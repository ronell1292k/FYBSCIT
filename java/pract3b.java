import java.util.Scanner;
class pract3b
{
	public static void main(String[] s)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input an integer");
		long n = input.nextLong();
		System.out.println("The sumof digits is: "+sumDigits(n));
	}

	public static int sumDigits(long n)
	{
		int sum = 0;
		while(n!=0)
		{
			sum += n% 10;
			n/=10;
		}
		return sum;
	}
}













