class Pattern
{
	public static void main(String args [])
	{
		int n = 7;
		int i, space, star=0;
		for(i = 1; i <= n; i++) 
		{
			for(space = 1; space <= n-i; space++) 
			{
			   System.out.print(" ");
			}
			while(star != (2*i - 1)) 
			{
				System.out.print("*");
				star++;;
			}
			star=0;
			System.out.print("\n");
		}
		n--;
		
		
		for(i = n;i >= 1; i--) 
		{
			for(space = 0; space <= n-i; space++) 
			{
			   System.out.print(" ");
			}
			star = 0;
			while(star != (2*i - 1)) 
			{
				System.out.print("*");
				star++;
			}
			System.out.print("\n");
		}
	}
}