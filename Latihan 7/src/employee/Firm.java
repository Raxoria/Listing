package employee;

//******************************************************
// Author  : Lewis/Loftus
// Rewrite : Syelvie Ira
// Demonstrates polymorphism via inheritance
//******************************************************

public class Firm {
	//----------------------------------------------------------
	//	Create a staff of empployees for a firm and pays them.
	//----------------------------------------------------------
	public static void main (String[] args) {
		Staff personnel = new Staff();
				
		personnel.payday();
	}
}
