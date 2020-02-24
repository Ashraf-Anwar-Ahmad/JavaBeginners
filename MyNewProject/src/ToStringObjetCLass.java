
public class ToStringObjetCLass {
	public static void main(String ab[])
	{
		Student ek=new Student(901,"Anwar");
		System.out.println(ek);
		Teacher aa=new Teacher(001,"Ahmad");
		System.out.println(aa);
	}

}
class Teacher
{
	int Number;
	String Name;
	public Teacher(int number, String name) {
		super();
		Number = number;
		Name = name;
	}
}
class Student
{
	int RollNumber;
	String Name;
	
	public Student(int rollNumber, String name) {
		super();
		RollNumber = rollNumber;
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", Name=" + Name + "]";
	}
}
