import java.util.*;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter dividend : ");
				int dividend = sc.nextInt();
				System.out.print("Enter divisor : ");
				int divisor = sc.nextInt();
				System.out.println("Quotient is " + quoient(dividend, divisor) );
				break;
			} catch ( ArithmeticException e) {
				System.out.println("Cannot divide by 0. Try again");
			} catch (InputMismatchException e) {
				System.out.println("You must enter integers. Try again");
				sc.next();
			}
		}
		sc.close();
	}
	public static int quoient(int a, int b) { // throws ArithmeticException -> 예외가 발생하면 던지겠다.
		return a / b;
	}
}