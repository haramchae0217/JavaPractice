import java.io.*;

public class WritingPerformanceTest {
	public static void main(String[] args) {
		long start, end;
		final int FILESIZE = 1000 * 1000;
		final int ARRAYSIZE = 10000;
		
		try {
			FileOutputStream fout = new FileOutputStream("tempfile");
			start = System.currentTimeMillis();
			for(int i = 0; i < FILESIZE; i++) {
				fout.write((byte) i);
			}
			end = System.currentTimeMillis();
			fout.close();
			System.out.println(end - start);
			
			fout = new FileOutputStream("tempfile");
			byte[] arr = new byte[ARRAYSIZE];
			start = System.currentTimeMillis();
			for(int i = 0; i < FILESIZE / ARRAYSIZE; i++) {
				fout.write(arr, 0, ARRAYSIZE);
			}
			end = System.currentTimeMillis();
			fout.close();
			System.out.println(end - start);
			
			fout = new FileOutputStream("tempfile");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			start = System.currentTimeMillis();
			for(int i = 0; i < FILESIZE; i++) {
				bout.write((byte) i);
			}
			end = System.currentTimeMillis();
			bout.close();
			System.out.println(end - start);
		} catch(IOException e) {
			System.out.println("IO Error");
		}
	}
}
