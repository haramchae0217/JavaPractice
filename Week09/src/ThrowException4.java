public class ThrowException4 {
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception ex) {
			System.out.println("Exception is caught.");
		}
		System.out.println("This is main().");
	}
	static void f() throws Exception {
		Exception ex = new Exception();
		throw ex;
	}
}
