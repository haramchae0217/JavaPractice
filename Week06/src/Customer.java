import java.util.*;

public class Customer {
	public static void main(String[] args) {
		HashMap<String, Integer> customer = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("exit...");
				break;
			}
			int point = sc.nextInt();
			if(customer.get(name) == null) {
				customer.put(name, point);
			} else {
				customer.put(name, customer.get(name)+point);
			}
			
			Set<String> key = customer.keySet();
			Iterator<String> it = key.iterator();
			while( it.hasNext() ) {
				String people = it.next();
				Integer sum = customer.get(people);
				System.out.print("{ " + people + " = " + sum + " }");
			}
			System.out.println();
		}
		sc.close();
	}
}
