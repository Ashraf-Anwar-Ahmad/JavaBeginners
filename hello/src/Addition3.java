	public class Addition3 {
		public static void main(String []ab)
		{
			int a,b,c,s;
			if(ab.length==3)
			{
				a=Integer.parseInt(ab[0]);
				b=Integer.parseInt(ab[1]);
				c=Integer.parseInt(ab[2]);
				s=a+b+c;
				System.out.println(s);
			}
			else
				System.out.println("Wrong arguments");
		}
	
	}
