import java.io.File;

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브리스트 입니다.-----");
		
		File[] subFiles = dir.listFiles();
		for(int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			System.out.print(f.getName());
			System.out.println("\t파일 크기 : " + f.length());
		}
	}
	
	public static void main(String[] args) {
		File f1 = new File("/Users/Haram/Project/JavaPractice/Week12/test-in.txt");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		
		String res = "";
		if(f1.isFile()) {
			res = "파일";
		} else if(f1.isDirectory()) {
			res = "디렉토리";		
		}
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		
		File f2 = new File("/Users/Haram/Project/JavaPractice/Week12/java_sample");
		if(!f2.exists()) {
			f2.mkdir();
		}
		listDirectory(new File("/Users/Haram/Project/JavaPractice/Week12/"));
		f2.renameTo(new File ("/Users/Haram/Project/JavaPractice/Week12/java_sample"));
		listDirectory(new File("/Users/Haram/Project/JavaPractice/Week12/"));
	}
}
