
public class ThisKeyword {
	public static void main(String ab[])
	{
		int j=5; //class variable
		abd ek=new abd(5);
		ek.show();
	}
}
class abd
{
	private int i; //instance variable
	public abd(int i) //local variable
	{
		this.i=i; //Current Instance
	}
	public void show()
	{
		System.out.println("i is "+i);
	}
}
