import java.util.Scanner;

public class StringRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr;
		
		System.out.println("문장을 입력하세요.");
		String a = sc.nextLine();
		arr = a.split(" ");
		
		for(int i=0; i<a.length(); i++) {
			String f = a.substring(0,1);
			String res = a.substring(1);
			a = res+f;
			System.out.println(a);
		}
	}
}
