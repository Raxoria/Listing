package Employee;

public class managerTestCase2 {

	public static void main(String[] args) {
		employee[] staff = new employee[3];
		staff[0] = new employee("Antonio Rossi", 2000000, 1, 10, 1989);
		staff[1] = new manager("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[2] = new employee("Isabel Vidal", 3000000, 1, 11, 1993);
		Sortable.shell_sort(staff);
		int i;
		for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();	

	}

}