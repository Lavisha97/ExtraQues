 class Pattern
 {
	public static void main(String args [])
	{
		int n = 10;
		int i, j;
		for(i=1; i<=n; i++)
		{
			for(j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=n; j++)
			{
				if(i==1 || j==1 || i==n || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}