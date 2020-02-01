import java.util.Random;

public class RandomValues {
	public static void main(String ab[])
	{
		Random  rv=new Random();
		int a[]=new int[50];
		for(int i=0;i<a.length;i++)
			a[i]=rv.nextInt(50);
		for(int i : a)
			System.out.println(i);
	}

}
