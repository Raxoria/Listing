package pack;

import com.horstman.corejava.*;
//the Employee class is defined in that package

import static java.lang.System.*;
/**
 * This program demonstrated the use of packaged
 * @version 1.1 12 April 2020
 * @author Syelvie Ira
 */

public class PackageTest 
{
	public static void main(String[] args) 
	{
		//because of the import statement, we dont have to use
		//com.horstmann.corejava.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		//because of the static import statement, we dont have to use System.out here 
		out.println("name=" + harry.getName() + ",salary=" + harry.getSalary()); 
	} 
}
