package selenium;

public class Employee {
	public static void empInfo(int empId, String empName) throws EmployeeNotFound
	{
		if(empId==1&&empName=="ABC") 
		{
			System.out.println("PASSED");	
		}
		else 
		{
			throw new EmployeeNotFound("not a valid id/name");
		}
		
	}
	public static void main(String[]args) throws EmployeeNotFound
	{
		empInfo(1,"ABC");
	}
	

}
