class Pattern
{
	public static void main(String args [])
	{
		int n  = 6 , i = 1 , j = 1 , k = 0 , space = 0 , count = 0 , count1 = 0;
		for(i=1; i<=n; ++i)
		{
			for(space=1; space <= n-i; ++space)
			{
				System.out.print("  ");
				++count;
			}

			while(k != 2*i-1)
			{
				if (count <= n-1)
				{
					System.out.print("* ");
					++count;
				}
				else
				{
					++count1;
					System.out.print("* ");
				}
				++k;
			}
			count1 = count = k = 0;

			System.out.print("\n");
		}
	}
}