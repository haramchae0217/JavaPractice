import java.util.*;
import java.io.*;

public class Ex10_4 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner( new File ("mtable.txt"));
			int n1 = 0, nc = 0;
			while(input.hasNext()) {
				String s = input.nextLine();
				n1++;
				nc += s.length();
			}
			System.out.printf("Number of chars : %d\nNumber of lines : %d\n", nc, n1);
			input.close();
		} catch (FileNotFoundException e) {
			System.err.println("cannot open");
		}
	}
}
