import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QR_Code 
{
	public static void main(String ab[]) throws Exception
	{
		String st="Hello World";
		ByteArrayOutputStream out=QRCode.from(st).to(ImageType.JPG).stream();
		File f=new File("D:\\Git Repository\\JavaBeginners\\MyNewProject\\src\\QR.jpg");
		FileOutputStream fos=new FileOutputStream(f);
		fos.write(out.toByteArray());
		fos.flush();
	}
}
