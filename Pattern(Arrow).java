class Pattern
{
	public static void main(String args [])
	{
		int n = 10;
		int i = 0 , j = 0 , k = 0;
		int z = n/2 - 1;
		for(i = 0 ; i <= n ; i++)
		{
			if(i <= n/2)
			{
				for(k = 1 ; k <= i ; k++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			else if (i == n/2+1)
			{
				for(j=4; j>=1; --j)
				{
					for(k=1; k<=j; ++k)
					{
						System.out.print("*");
					}
					System.out.println("");
				}
    
			}
		}
	}
}