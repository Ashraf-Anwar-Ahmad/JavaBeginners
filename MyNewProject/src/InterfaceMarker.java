interface Xc
{
	
}
class Xcz implements Xc
{
	public void show()
	{
		System.out.println("Hello Marker");
	}
}
public class InterfaceMarker {
	public static void main(String ab[])
	{
		Xcz ek=new Xcz();
		if(ek instanceof Xc)
			ek.show();
		else
			System.out.println("There's no  instance related to Interface");
	}

}
