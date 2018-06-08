class Pattern
{
	public static void main(String args[])
	{
		int n = 6 , i , j ,k;
		for (i = 1 ; i <= n; i++)
		{
			if(i == 1)
			{
				for(j = 0 ; j <= n ; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			else if(i == n)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("*");
				for(k = 1; k <= n-i; k++) 
				{
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println("");
			}
			
			
		}
	}
}