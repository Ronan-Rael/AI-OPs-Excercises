import java.io.Serializable;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int empId;
	String empName;
	String department;
	double salary;
	
	Employee(int id, String name, String department, double salary){
		empId = id;
		empName = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + ", salary=" + salary
				+ "]";
	}
	
	
}
