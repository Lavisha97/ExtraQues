class Pattern
{
	public static void main(String args [])
	{
		int i, j, n, star=0;
		n = 6;
		for(i = 1; i < n; i++) 
		{
			//Printing spaces
			for(j = 1; j <= n-i; j++) 
			{
			   System.out.print(" ");
			}
			//Printing stars
			while(star != (2*i - 1)) 
			{
				if(star==0 || star==2*i-2)
					System.out.print("*");
				else
					System.out.print(" ");
				star++;;
			}
			star=0;
			System.out.print("\n");
		}
		//print last row
		for(i=0; i<2*n-1; i++)
		{
			System.out.print("*");
		}
	}
}