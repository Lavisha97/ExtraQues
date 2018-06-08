class Pattern
{
	public static void main(String args [])
	{
		int n = 10 , i = 0 , j = 0;
		for(i = 1 ; i <= n ; i++)
		{
			if (i == 1 || i == n)
			{
				for(j = 0 ; j < 17 ; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			else
			{
				for(j = 0 ; j < 2 ; j++)
				{
					System.out.print("\t*");
				}
				System.out.println("");
			}
		}
	}
}