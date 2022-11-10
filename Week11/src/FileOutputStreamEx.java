import java.io.*;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,24};
		try {
			FileOutputStream fout = new FileOutputStream("/Users/Haram/Project/JavaPractice/Week11/test.out");
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]);
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("/Users/Haram/Project/JavaPractice/Week11/에 저장할 수 없었습니다. 경로명을 확인해주세요.");
			return;
		}
		System.out.println("/Users/Haram/Project/JavaPractice/Week11/test.out을 저장하였습니다.");
	}
}
