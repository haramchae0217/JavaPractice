
class Circle {
	private int x, y;
	private int r;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.r = radius;
	}
	
	public boolean equals(Object obj) {
		Circle c = (Circle) obj;
		if(x == c.x && y == c.y && r == c.r)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "(" + x + "," + y + ") r=" + r; 
	}
}

public class CircleTest {
	public static void main(String [] args) {
		
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(1,3,5);
		Circle c = new Circle(2,3,5);
		
		System.out.println(a); // (2,3) r=5
		System.out.println(b); // (1,3) r=5
		
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
	}
}
