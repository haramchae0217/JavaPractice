import java.util.Vector;
import java.util.Scanner;

class PersonToPoint {
	private String name;
	private int point;
	
	public PersonToPoint(String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	public String toString() {
		return "[" + name + " " + point + "]";
	}
	
	public String getName() {
		return name;
	}
	
	public int getPoint() {
		return point;
	}
	
	public boolean equals(Object o) {
		PersonToPoint p = (PersonToPoint) o;
		return name == p.name;
	}
}

public class Customer {
	private Scanner sc = new Scanner(System.in);
	private Vector<PersonToPoint> v = new Vector<PersonToPoint>();
	
	private boolean contains(String name) {
		for (int i = 0; i < v.size(); i++) {
			if(v.get(i).getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	private int addPoints(String name) {
		for (int i = 0; i < v.size(); i++) {
			if(v.get(i).getName().equals(name)) {
				return v.get(i).getPoint();
			}
		}
		return 0;
	}
	
	private int getIndex(String name) {
		for (int i = 0; i < v.size(); i++) {
			if(v.get(i).getName().equals(name)) {
				return i;
			}
		}
		return 0;
	}
	
	public void run() {
		while(true) {
			System.out.print("이름과 포인트 입력 > ");
			String name = sc.next();
			int point = sc.nextInt();
			
			if (contains(name)) {
				int editPoint =  addPoints(name) + point;
				int index = getIndex(name);
				PersonToPoint p = new PersonToPoint(name, editPoint);
				v.set(index, p);
			} else {
				v.add(new PersonToPoint(name, point));	
			}
			
			allData();
		}
	}	
	
	public void allData() {
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Customer c = new Customer();
		c.run();
	}
}
