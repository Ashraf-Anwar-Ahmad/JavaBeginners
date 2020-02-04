import java.util.Random;

public class Array3d 
{
	public static void main(String ab[])
	{
		int a[][][]=new  int [5][5][5];
		

		Random ek=new Random();
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					a[i][j][k]=ek.nextInt(50);
				}
			}
		}
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					System.out.print(" "+a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}
