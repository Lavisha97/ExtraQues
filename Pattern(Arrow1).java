class Pattern
{
	public static void main(String args [])
	{
		int i = 0 , n = 5 , j = 0 , k = 0;
		for(j = 0 ; j < n ; j++)
		{
			for(i = 0 ; i < j ; i++)
			{
				System.out.print(" ");
				System.out.print(" ");
			}
			
			for(k = n ; k > j ; k--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(j = 2 ; j <= n ; j++)
		{
			for(i = n ; i > j ; i--)
			{
				System.out.print(" ");
				System.out.print(" ");
			}
			
			for(k = 1 ; k <= j ; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}