import java.util.Scanner;
class Week
{
	public static void main(String args [])
	{
		Scanner sci = new Scanner(System.in);
		int a , n ,c , sum = 0 , sum1;
		System.out.println("Enter a number:");
		a = sci.nextInt();
		n = a;
		
		while(a!= 0)
		{
			c = a%10;
			sum = sum+c;
			a = a/10;
		}
		sum1 = sum;
		sum = 0;
		while(sum1 > 8)
		{
			while(sum1 != 0)
			{
				c = sum1%10;
				sum = sum + c;
				sum1 = sum1/10;
			}
		}
		System.out.println(sum);
		
		switch(sum)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
		}
	}
}