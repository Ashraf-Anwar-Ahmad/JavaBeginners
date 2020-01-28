import  java.util.Scanner;
public class String2Char {
	public static void main(String a[])
	{	
		String str="";
		char ch;
		Scanner ek=new Scanner(System.in);
		System.out.println("Enter the String");
		str=ek.nextLine();
		ek.close();
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			System.out.println("charater at "+i+" position "+ch);
		}
	}
}
