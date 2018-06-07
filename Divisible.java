import java.util.Scanner;

class Divisible
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		int flag = 0 ,z = 0;
		z = a;
		int y = 0 , sum = 0;
		
		
		while(z != 0)
		{
			y = z % 10;
			z = z/10;
			sum = sum + y;
		}
		if(sum%3 == 0)
		{
			System.out.println("Acadview");
			flag++;
		}
		
		if(a % 10 == 0 || a % 10 == 5)
		{ 
			System.out.println("learning");
			flag++;
		}
		
		if(flag == 2)
		{
			System.out.println("Acadview Learning");
		}
		
	}
}