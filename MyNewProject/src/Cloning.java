public class Cloning 
{
	public static void main(String ab[]) throws CloneNotSupportedException
	{	
		Abcz obj=new Abcz();
		obj.i=5;
		obj.j=6;
		Abcz obj1=(Abcz)obj.clone();
		System.out.println(obj1);
		System.out.println(obj);
	}
}
class Abcz implements Cloneable
{
	int i,j;
	@Override
	public String toString() 
	{
		return "Abc [i=" + i + ", j=" + j + "]";	
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}