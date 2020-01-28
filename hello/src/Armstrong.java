import java.util.Scanner;
public class Armstrong 
{
public static void main(String ab[])
{	
	int n,x,r,s=0;
	System.out.println("Enter any number");
	Scanner ek=new Scanner(System.in);
	n=ek.nextInt();
	x=n;
	while(x!=0)
	{
		r=x%10;
		s=s+r*r*r;
		x=x/10;
	}
	if(s==n)
		System.out.println(n+" is a Armstrong Number");
	else
		System.out.println(n+" is not a Armstrong Number");
		
}
}
