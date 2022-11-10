import java.io.*;

public class Encrypt {
	public static void main(String[] args) {
		try {
			FileReader fin = new FileReader("konkuk.txt");
			FileWriter fout = new FileWriter("konkuk2.txt");
			int c;
			while((c = fin.read()) != -1) {
				if(Character.isAlphabetic(c)) {
					c += 3;
				}
				fout.write(c);
			}
			fin.close();
			fout.close();
		} catch(IOException e) {
			System.out.println("IO error");
		}
	}
}
