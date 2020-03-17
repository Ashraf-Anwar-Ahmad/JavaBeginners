import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandling 
{
	public static void main(String ab[]) throws Exception
	{
		//To Create File
		FileOutputStream fos=new FileOutputStream("File Handling.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeUTF("Hello Bye");		
		
		//To Read Created file
		FileInputStream fis=new FileInputStream("File Handling.txt");
		DataInputStream dis=new DataInputStream(fis);
		String str=dis.readUTF();
		System.out.println(str);
	}
}
