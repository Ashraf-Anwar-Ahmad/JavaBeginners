class Display//creating class
{				//creating method 'show'
	public void show(float ...a) //VarArgs
	{
	for(float i : a)//enhanced for loop
		System.out.println(i);
	}
}
public class Varargs 
{
	public static void main(String ab[])
	{
	Display ek=new Display();//creating object for using class Display
	ek.show(1,5,6,8);//calling functions
	}	
}
