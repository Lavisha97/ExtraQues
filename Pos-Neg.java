import java.util.Scanner;
class Sign
{
	public static void main(String args [])
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number a to check whether it is Positive or Negative");
		a = sc.nextInt();
		if(a < 0)
			System.out.println("Negative");
		else
			System.out.println("Positive");
	}
}