
package Singleinheritence;
import java.text.*;
import java.util.Date;
import java.util.Scanner;


public class Employee{

	private int empId;
	private String empName;
	private String empDob;
	private String empDoj;
	Scanner sc=new Scanner(System.in);
	//creating the Date object
	Date dob=new Date();
	Date doj=new Date();
	/*SimpleDateFormat is a class in java.text.package to declare date format for
	 * converting string to date or date to another format 
	*/
	String pattern="yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern);
	public void addEmployee() throws ParseException {
		System.out.println("Enter employee details");
		System.out.println("Enter Employee id");
		empId=sc.nextInt();
		System.out.println("Enter Employee name");
		empName=sc.nextLine();
		System.out.println("Enter Employee DOB(dd/MM/yyyy)");
		empDob=sc.next();
		dob=convertStringToDate(empDob);
		System.out.println("Enter Employee DOJ(dd/MM/yyyy)");
		empDoj=sc.next();
		doj=convertStringToDate(empDoj);
		
	}
	public Date convertStringToDate(String date) throws ParseException {
		Date stringToDate = simpleDateFormat.format(date);
		return stringToDate;
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee Details are...");
		System.out.println("Employee Id = "+empId);
		System.out.println("Employee Name = "+empName);
		System.out.println("Employee DOB = "+dob);
		System.out.println("Employee DOJ = "+doj);
	}
	
	
}


