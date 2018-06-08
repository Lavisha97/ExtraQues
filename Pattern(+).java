class Pattern
{
	public static void main(String args [])
	{
		int n = 10 , a = 3;
		int z = n/2 , i = 0 , j = 1;
		for(i = 1 ; i <= n ; i++)
		{
			if(i == z)
			{
				for(a = 3 ; a < 20 ; a++)
				{
					System.out.print("*");
				}
				/*for(j = 1 ; j <= 8 ; j++);
				{
					System.out.print("*");
				}*/
				System.out.println("");
			}
			else
			{
				System.out.print("\t*");
				System.out.println("");
			}
		}
	}
}