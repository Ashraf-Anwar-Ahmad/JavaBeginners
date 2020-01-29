
public class StarPatternY
{
	public static void main(String ab[])
	{	int c1=1,c2=9;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j==c1||j==c2&&i<5)
					System.out.print("**");
				else
					System.out.print("  ");
			}
			if(i<=4)
			{
				c1++;
				c2--;
			}	
			else if(i<=10)
			{
				c2++;
			}
		System.out.println();
		}
	}
}
