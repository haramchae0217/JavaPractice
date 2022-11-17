import java.io.Serializable;

public class Student implements Serializable {
	private String sname;
	private String sid;
	private String ssn;
	
	public Student(String sname, String sid, String ssn) {
		this.sname = sname;
		this.sid = sid;
		this.ssn = ssn;
	}
	
	@Override
	public String toString() {
		return String.format("%s" + ", " + "%s" + ", " + "%s", sname, sid, ssn);
	}
}
