public class PrintException1 {
	public static void main(String[] args) {
		try {
			int a = 100 / 0;
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("End of main");
	}
}
