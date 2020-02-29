import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyTryBlock 
{
	public static void main(String ab[]) throws IOException
	{
		try(BufferedReader ek=new BufferedReader(new InputStreamReader(System.in)))
		{
			String st="";
			st=ek.readLine();
			System.out.println(st);
			System.out.println(ek);
		}
	}
}