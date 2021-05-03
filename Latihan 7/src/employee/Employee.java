package employee;

public class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;
	
	//----------------------------------------------------------
	// Sets up an employee with the specified information. 
	//----------------------------------------------------------
	public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super (eName, eAddress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	//----------------------------------------------------------
	//	Returns information about an employee  as a string
	//----------------------------------------------------------
	public String toString() {
		String result = super.toString();
		
		result += "\nSosial Security Number : " + socialSecurityNumber;
		
		return result;
	}
	//----------------------------------------------------------
	//	Returns information about an employee  as a string
	//----------------------------------------------------------
	public double pay() {
		return payRate;
	}
}
