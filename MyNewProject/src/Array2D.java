
public class Array2D {
	public static void main(String ab[])
	{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {9,10,11,12};
		
		int d[][]= 
			{
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
			};
		for(int i=0;i<d.length;i++)
		{
			for(int j=0;j<d[0].length;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i[]:d)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
