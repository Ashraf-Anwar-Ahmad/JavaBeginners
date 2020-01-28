import java.util.Scanner;
public class CompoundInterest {
	public static void main(String a[])
	{
		double p,r,t,n;
		double cint;
		Scanner cost=new  Scanner(System.in);
		System.out.println("Enter Principal Amount");
		p=cost.nextDouble();
		System.out.println("Enter Annual Interest Rate");
		r=cost.nextDouble();
		System.out.println("Enter the number of times that interest is compounded per unit time");
		n=cost.nextDouble();
		System.out.println("Enter the time Period the money is invested or borrowed");
		t=cost.nextDouble();
		cost.close();
		cint=p * Math.pow(1 + (r / n), n * t);
		System.out.println("Compound Interest is "+cint);
	}

}
