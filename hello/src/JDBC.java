import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC 
{
	public static void main(String ab[])
	{
		System.out.println("Select any One Operation");
		System.out.println("1.Insertion"
				+ "\n2.Deletion"
				+ "\n3.Show Balance");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dolly","root","root");
				/*
				 //Insertion
				PreparedStatement ps=con.prepareStatement("insert into anwar values(?,?)");
				System.out.println("Enter id  and Name");
				Scanner ek=new Scanner(System.in);
				int i=ek.nextInt();ek.nextLine();
				String b=ek.nextLine();
				ps.setInt(1,i);
				ps.setString(2,b);
				int n=ps.executeUpdate();
				System.out.println(n+" Record Inserted");
				*/
				/*
				 ##Deletion
				PreparedStatement bs=con.prepareStatement("delete from anwar where name=?");
				bs.setString(1,"");
				int n=bs.executeUpdate();
				System.out.println(n+" Record Deleted");
				*/
				
				 //Select Query
				PreparedStatement ns=con.prepareStatement("Select * from anwar");
				ResultSet rs=ns.executeQuery();
				while(rs.next())
				{
					System.out.println("Name "+rs.getString(2)+" id "+rs.getInt(1));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
