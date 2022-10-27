public class ThrowException2 {
	public static void main(String[] args) {
		f();
		System.out.println("This is main().");
	}
	static void f() {
		Exception ex = new Exception();
		// throw ex; // 이 위치에서 예외 발생. catch하지 않았으므로, 호출한 쪽으로 예외를 던짐. 그런데, Exception클래스는 checked exception임.
	}
}
