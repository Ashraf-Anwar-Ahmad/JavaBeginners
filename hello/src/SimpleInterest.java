import java.util.Scanner;
public class SimpleInterest {
	public static void main(String a[])
	{
		float p,r,t,simp;
		Scanner cost=new  Scanner(System.in);
		System.out.println("Enter Principal Amount");
		p=cost.nextFloat();
		System.out.println("Enter Rate of Interest");
		r=cost.nextFloat();
		System.out.println("Enter the time Period");
		t=cost.nextFloat();
		simp=(p*r*t)/100;
		System.out.println("Simple Interest is "+simp);
	}
}
