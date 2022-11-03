import java.util.*;
import java.io.*;

public class Ex10_3 {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner( new File ("konkuk.txt"));
			while(input.hasNext()) {
				String s = input.nextLine();
				System.out.println(new StringBuffer(s).reverse());
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.err.println("cannot open");
		}
	}
}
