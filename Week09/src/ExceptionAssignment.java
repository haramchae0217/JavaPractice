import java.util.*;

public class ExceptionAssignment {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0을 입력하지 마세요 : ");
		String s = input.nextLine();
		try {
			f(s);
			System.out.println(s + "를 입력했습니다.");
		} catch (Exception ex) {
			System.out.println("제발 0을 입력하지 마세요!");
		}
		input.close();
	}
	static void f(String s) throws Exception {
		if(s.equals("0"))
			throw new Exception();
	}
}
