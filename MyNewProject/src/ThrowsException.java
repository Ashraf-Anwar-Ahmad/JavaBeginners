import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException 
{
	public static void main(String ab[]) throws NumberFormatException, IOException
	{
		int i,j,k=0;
		BufferedReader ek=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any Number");
		i=5;
		j=Integer.parseInt(ek.readLine());
		k=i+j;
		System.out.println(k);
	}
}
