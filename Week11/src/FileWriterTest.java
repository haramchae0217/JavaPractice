import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			FileWriter fout = new FileWriter("/Users/Haram/Project/JavaPractice/Week11/test.txt");
			for(int i = 0; i < 10; i++) {
				fout.write('0'+i);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("IO error");
		}
	}
}
