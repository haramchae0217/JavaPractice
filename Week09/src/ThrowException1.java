public class ThrowException1 {
	public static void main(String[] args) {
		f();
		System.out.println("This is main");
	}
	static void f() {
		Exception ex;
		
		ex = new Exception();
		ex.printStackTrace();
		
		ex = new Exception("test exception");
		ex.printStackTrace();
		
		ex = new ArithmeticException();
		ex.printStackTrace();
		
		ex = new ArithmeticException("+-*/");
		ex.printStackTrace();
	}
}
