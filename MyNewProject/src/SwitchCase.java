import java.util.Scanner;

public class SwitchCase 
{
	public static void main(String ab[])
	{
		String s="";
		System.out.println("Kyun be");
		Scanner ek=new Scanner(System.in);
		s=ek.next();
		ek.close();
		switch(s)
		{
		case"Hello":
			System.out.println("Haan b");
			break;
		case"Hi":
			System.out.println("ohhh Esa");
			break;
		case"hey":
			System.out.println("Nikal le");
			break;
		default:
			System.out.println("Kuch toh bol");
			break;
		}
	}
}
