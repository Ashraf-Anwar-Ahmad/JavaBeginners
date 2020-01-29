public class Pattern2 {
	public static void main(String ab[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{	int k=i+j-1;
				if(k>5)
				System.out.print(k-5+" ");
				else
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
