
public class LabeledBreak 
{
	public static void main(String ab[])
	{
		System.out.println("UnLabeled Break");
			for(int i=1;i<5;i++)
			{
				for(int j=1;j<5;j++)
				{
					if(i==3)
						break;// only exit inner loop only(Unlabeled break)
					System.out.print(" * ");
				}
				System.out.println(" ");
			}
		System.out.println("____________________________________");
		System.out.println("Labeled Break");
			anwar: //Break point
			for(int i=1;i<5;i++)
			{
				for(int j=1;j<5;j++)
				{
					if(i==3)
						break anwar;// only exit whole loop from the break point(labeled break)
					System.out.print(" * ");
				}
				System.out.println(" ");
			}
	}
}
