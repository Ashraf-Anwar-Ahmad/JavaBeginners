
public class StringBuff 
{
	public static void main(String ab[])
	{
		StringBuffer ek=new StringBuffer("Anwar ");
		System.out.println(ek);
		ek.append("Ahmad");
		System.out.println(ek);
		ek.replace(0, 5, "Ashraf");
		System.out.println(ek);
	}
}
