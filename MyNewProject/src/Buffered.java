import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffered {
	public static void main(String ab[]) throws Exception
	{
		System.out.println("Enter Any Nuber");
		/*InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader ek=new BufferedReader(is);*/
		
		BufferedReader ek=new BufferedReader(new InputStreamReader(System.in));		
		int as=Integer.parseInt(ek.readLine());
		System.out.println(as);
	}
}
