interface Cd
{
	void  show();
}
public class LambdaFunction 
{
	public static void main(String ab[])
	{
		/*A ek=new A()
				{
			public void show()
			{
				System.out.println("In Show");
			}
				}; */  //without lambda expression
		
		Cd ek= () -> System.out.println("In Show");
		
		ek.show();
	}
}
