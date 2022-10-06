import java.util.*;

public class IteratorVector {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(-1);
		v.add(-2);
		v.add(10);
		System.out.println("before : " + v);
		
		Iterator<Integer> it = v.iterator();
		while( it.hasNext() ) {
			if(it.next() < 0) {
				it.remove();
			}
		}
		System.out.println("after : " + v);
	}
}
