import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropetiesFile 
{
	public static void main(String ab []) throws Exception
	{
		//to Create txt file
		Properties p=new Properties();
		OutputStream os=new FileOutputStream("C:\\Users\\ashra\\Desktop\\filename.properties");
		p.setProperty("Url", "localhost:3306\\mydb");
		p.setProperty("Uname", "Anwar");
		p.setProperty("Pass", "0000");
		p.store(os, null);
		
		
		//to read created file
		InputStream is=new FileInputStream("C:\\Users\\ashra\\Desktop\\filename.properties");
		p.load(is);
		System.out.println(p.getProperty("Uname"));
		p.list(System.out);
	}
}
