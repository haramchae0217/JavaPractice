import java.io.Serializable;

public class Employee implements Serializable{
	private String name;
	private String ssn;
	
	public Employee(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return String.format("Employee: %s (%s)",name,ssn);
	}
}
