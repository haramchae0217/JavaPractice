import java.util.*;
import java.io.*;

public class Ex10_5 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("konkuk.txt");
			int c;
			while((c = fin.read()) != -1) {
//				if(c != 32) {
//					c += 3;
//				}
				if(Character.isLowerCase(c)) {
					c += 3;
					if(!Character.isLowerCase(c)) {
						c -= 26;
					}
				}
				if(Character.isUpperCase(c)) {
					c += 3;
					if(!Character.isUpperCase(c)) {
						c -= 26;
					}
				}
				System.out.print((char) c);
			}
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
