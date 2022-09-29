import java.util.*;

public class Lotto645 {
	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<Integer>();
		Random rand = new Random();
		
		while(hset.size() < 6) {
			int number = 1 + rand.nextInt(45);
			hset.add(number);
		}
		System.out.println(hset);
	}
}
