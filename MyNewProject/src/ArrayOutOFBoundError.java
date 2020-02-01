import java.util.Random;

public class ArrayOutOFBoundError {
	public  static void main(String ab[])
	{
		int a[]=new int[20];
		Random rv=new Random();
		for(int i=0;i<a.length;i++)
		{
			a[i]=rv.nextInt(50);
		}
		try {
			System.out.println(a[21]);
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index Limit to 19");
			// TODO: handle exception
		}
		for(int i : a)
			System.out.println(i);
	}
}
