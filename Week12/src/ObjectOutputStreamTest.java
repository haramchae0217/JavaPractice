import java.io.*;

public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		Employee e1 = new Employee("John", "111-1111");
		Employee e2 = new Employee("Susan", "222-2222");
		Employee e3 = new Employee("Bob", "333-3333");
		int[] arr = {100, 200, 300, 400};
		
		try {
			ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("employee.out") );
			
			output.writeObject(e1);
			output.writeObject(e2);
			output.writeObject(e3);
			output.writeObject(arr);
			output.close();
		} catch(IOException e) {
			System.out.println("IO error");
		}
	}
}
