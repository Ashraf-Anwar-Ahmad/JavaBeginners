import java.util.Scanner;
public class Vovels 
{
	
		public static void main(String ab[])
		{	
			char ch;
			System.out.println("Enter any Alphabet");
			Scanner ek=new Scanner(System.in);
			ch=ek.next().charAt(0);
			ek.close();
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
			{
				System.out.println(ch+" is a Vovel");
			}
			else
				if(ch>='A'&&ch<='Z'|| ch>='a'&&ch<='z')
				{
					System.out.println(ch+" is a Consonant");	
				}
				else
					System.out.println(ch+" is not a Alphabet");
		}
}
