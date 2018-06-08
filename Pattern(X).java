class Pattern
{
	public static void main(String Args [])
	{
		int n = 4, j = 0 , i = 1 , k = 0;
		for(i = 1 ; i <= n ; i++)
		{
			for(k = 0 ; k <= i-1 ; k++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(j = n; j >= i; j--) 
			{
			   System.out.print(" ");
			   System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
		if(i == n+1)
		{
			for(k = 0 ; k <= i-1 ; k++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println("");
		for(i = 0 ; i <= n ; i++)
		{
			for(j = n; j >= i; j--) 
			{
			   System.out.print(" ");
			}
			System.out.print("*");
			for(k = 0 ; k <= i-1 ; k++)
			{
				System.out.print(" ");
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println("");
		}
	}
}