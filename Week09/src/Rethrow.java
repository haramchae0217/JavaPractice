public class Rethrow {
	public static void main(String[] args) {
		try {
			f();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("This is main().");
	}
	static void f() throws Exception {
		try {
			g();
		} catch (Exception ex) {
			System.out.println("Exception is caught in f()");
			throw ex;
		}
	}
	static void g() throws Exception {
		throw new Exception("Exception generated in g().");
	}
}
