
class Point1 {
	private int x, y;
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Example01 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // 클래스 이름 출
		System.out.println(obj.hashCode()); // 해시코드 
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출
		System.out.println(obj); // 객체 출
	}
	public static void main(String [] args) {
		Point1 p = new Point1(2,3);
		print(p);
	}
}
