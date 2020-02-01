
public class EnhancedForLoop 
{
	public static void main(String ab[])
	{
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		for(int i : a)//Enhanced For Loop
		{
			System.out.println(i);
		}
	}
}
