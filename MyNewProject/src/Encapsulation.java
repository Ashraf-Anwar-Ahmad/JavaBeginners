
public class Encapsulation 
{
	public static void main(String ab[])
	{
		Emp e=new Emp();
		e.setEmpId(1);
		e.setEmpName("Anwar");
		System.out.println(e.getEmpName());
	}
}
class Emp
{
	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
