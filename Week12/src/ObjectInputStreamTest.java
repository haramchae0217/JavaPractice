import java.io.*;

public class ObjectInputStreamTest {
	public static void main(String[] args) {
		try {
			ObjectInputStream input = new ObjectInputStream( new FileInputStream("employee.out") );
			Employee e1 = (Employee) input.readObject();
			Employee e2 = (Employee) input.readObject();
			Employee e3 = (Employee) input.readObject();
			int[] arr = (int[]) input.readObject();
			
			input.close();
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);
			for(int n : arr) {
				System.out.printf("%d ", n);
			}
		} catch(Exception e) {
			System.err.println("Error");
		}
	}
}
