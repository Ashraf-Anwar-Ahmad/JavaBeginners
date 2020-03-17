import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationXml 
{
	public static void main(String ab[])
	{
		Student1 st1=new Student1();
		st1.setRollno(101);
		st1.setSname("Anwar");
		
		Student1 st2=new Student1();
		st2.setRollno(102);
		st2.setSname("Aman");
		
		List<Student1> s=new ArrayList<>();
		s.add(st1);
		s.add(st2);
		
		College c=new College();
		c.setStudents(s);
		
		try {
			XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("MyCollegeDataSerializable.xml")));
			x.writeObject(c);
			x.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}

class Student1
{
	private int rollno;
	private String sname;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "College [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
}
class College
{
	private List<Student1> students;

	public List<Student1> getStudents() {
		return students;
	}

	public void setStudents(List<Student1> students) {
		this.students = students;
	}

}
