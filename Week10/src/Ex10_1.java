import java.io.*;
import java.util.*;

public class Ex10_1 {
	public static void main(String[] args) {
		try {
			Formatter output = new Formatter("konkuk.txt");
			output.format("Computer Engineering\r\n");
			output.format("KonKuk University\r\n");
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("cannot open");
		}
	}
}
