
public class Looping 
{
	public static void main(String ab[])
	{
		int i=0;
		while(10>=i) //only work for true value
		{
			System.out.println("While i is "+i+" ");
			i++;
		}
		i=15;
		do //first execute once and then execute condiion
		{
			System.out.print("Do_While  "+i);
		}while(i<10);
	}
}
