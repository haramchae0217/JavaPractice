import java.util.Stack;
import java.util.Scanner;

public class Postfix {
	public static void main(String[] args) {
		Stack<Double> st = new Stack<Double>();
		double a = 0.0, b = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Postfix> ");
		String input = sc.nextLine();
		
		String[] postFix = input.split(" ");
		
		for (String op : postFix) {
			switch(op) {
			case "+":
				b = st.pop();
				a = st.pop();
				st.push(a+b);
				break;
			case "-":
				b = st.pop();
				a = st.pop();
				st.push(a-b);
				break;
			case "*":
				b = st.pop();
				a = st.pop();
				st.push(a*b);
				break;
			case "/":
				b = st.pop();
				a = st.pop();
				st.push(a/b);
				break;
			default:
				st.push(Double.valueOf(op));
				break;
			}
		}
		System.out.print("result> " + st.pop() );
	}
}
