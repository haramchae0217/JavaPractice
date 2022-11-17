import java.io.*;
import java.util.*;

public class MyLs {
	public static void main(String[] args) {
		File f = new File(".");
		if(f.exists() && f.isDirectory()) {
			System.out.println(f.getPath() + " is a directory");
			File[] dir = f.listFiles();
			for(File file : dir) {
				System.out.print(file.isDirectory() ? 'D' : '-');
				System.out.print(file.canRead() ? 'R' : '-');
				System.out.print(file.canWrite() ? 'W' : '-');
				System.out.print(file.canExecute() ? 'X' : '-');
				System.out.printf("%8d", file.length() );
				System.out.printf(" %s", new Date(file.lastModified()) );
				System.out.printf(" %s\n", file.getName() );
			}
		}
	}
}
