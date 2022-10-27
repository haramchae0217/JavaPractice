public class PrintException4 {
	public static void main(String[] args) {
		f();
	}
	static void f() {
		g();
	}
	static void g() {
		h();
	}
	static void h() {
		try {
			int a = 100 / 0;
		} catch (ArithmeticException ex) {
			StackTraceElement[] arr;
			arr = ex.getStackTrace();
			for(StackTraceElement ele : arr) {
				System.out.printf("%s \t%s \t%s \t%d\n",
						ele.getClassName(),
						ele.getMethodName(),
						ele.getFileName(),
						ele.getLineNumber() );
			}
		}
	}
}
