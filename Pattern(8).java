class Pattern
{
	public static void main(String args[])
	{
		int n = 10 , i = 0 , j = 0;
		if(n%2 == 0)
		{
			for(i = 0 ; i <= n ; i++)
			{
				if(i == 0 || i == 10 || i == n/2)
				{
					System.out.println("");
					for(j = 0 ; j <= 8;j++)
					{
						System.out.print("*");
					}
					
				}
				else 
				{
					System.out.print("\n");
					System.out.print("*	*");
				}
				
			}
		}
	}
}