
public class fibonacci {
	public static void main(String []ab)
	{
		int i,a=0,b=1,s=0;
		System.out.print(a+" "+b);
		for(i=1;i<=10;i++)
			{
			s=a+b;
			System.out.print(" "+s);
			a=b;
			b=s;
			}
		
	}
	

}
