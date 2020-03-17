package serialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeSerialization 
{
	public static void main(String ab[])
	{
		try {
			XMLDecoder x=new XMLDecoder(new BufferedInputStream(new FileInputStream("MyCollegeDataSerializable.xml")));
			College c=(College)x.readObject();
			List<Student> s=c.getStudents();
			x.close(); 
			for(Student value : s)
			{
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
		}
	}
}
