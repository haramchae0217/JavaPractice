import java.io.*;

public class FileCopy {
	public static void main(String[] args) {
		byte b[] = new byte[28];
		try {
			FileInputStream fin = new FileInputStream("/Users/Haram/Project/JavaPractice/Week11/hangul.txt");
			FileOutputStream fout = new FileOutputStream("/Users/Haram/Project/JavaPractice/Week11/h.txt");
			int n = 0, c;
			while((c = fin.read()) != -1) {
				b[n] = (byte)c;
				n++;
			}
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fin.close();
			fout.close();
		} catch(IOException e) {
			System.out.println("IO error");
		}
	}
}
