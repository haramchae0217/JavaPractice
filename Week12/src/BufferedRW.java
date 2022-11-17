import java.io.*;
import static java.lang.Character.*;

public class BufferedRW {
	public static void main(String[] args) {
		try {
			BufferedReader bin = new BufferedReader( new FileReader("/Users/Haram/Project/JavaPractice/Week12/test-in.txt"));
			BufferedWriter bout = new BufferedWriter( new FileWriter("/Users/Haram/Project/JavaPractice/Week12/test-out.txt"));
			int c;
			while((c = bin.read()) != -1) {
				if(isLowerCase((char) c))bout.write(toUpperCase((char) c));
				else if(isUpperCase((char) c))bout.write(toLowerCase((char) c));
				else bout.write(c);
			}
			bin.close();
			bout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
