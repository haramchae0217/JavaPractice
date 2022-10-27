public class PrintException2 {
	public static void main(String[] args) {
		try {
			int a = 100 / 0;
		} catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("finally block");
		}
		System.out.println("End of main");
	}
}
