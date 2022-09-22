import java.util.Scanner;
import java.util.Arrays;

public class SpiltAndSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문장을 입력하세요>> ");
			String a = sc.nextLine();
			
			if (a.equals("exit")) {
				break;
			}
			
			String s[] = a.split(" ");
			System.out.println("어절의 개수는 " + s.length);
			Arrays.sort(s);
			for (int i=0; i<s.length; i++) {
				System.out.println(s[i]);	
			}
		}
	}
}
