
public class Inheritanace {
public static void main(String ab[])
{
	C obj=new C();
	obj.i=5;
	obj.j=7;
	obj.add();//method of class A
	obj.sub();//method of class B 
	obj.mul();//method of class C
	System.out.println("Addition from class A "+obj.sum);
	System.out.println("Substraction from Class B "+obj.diff);
	System.out.println("Multiplication from Class C "+obj.into);
}
}
class A
{	int  i,j,sum=0;
	public void add(){
		sum=i+j;
	}
}
class B extends A //Single Inheritance
{
	int diff;
	public void sub()
	{
		diff=i-j;
	}
}
class C extends B //Multilevel Inheritance
{
	int into;
	public void mul()
	{
		into=i*j;
	}
}