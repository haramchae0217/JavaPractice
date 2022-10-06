import java.util.*;

public class CollectionsEx2 {
	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Transformer");
		c1.add("Starwars");
		c1.add("Matrix");
		System.out.println( "c1=" + c1 );
		
		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Terminator");
		c2.add("Avatar");
		c2.add("Starwars");
		System.out.println( "c2=" + c2 );
		
		boolean d = Collections.disjoint( c1, c2 );
		System.out.println( "disjoint(): " + d );
		
		Collections.replaceAll( c2, "Starwars", "E.T.");
		System.out.println( "c1=" + c1 );
		System.out.println( "c2=" + c2 );
		
		d = Collections.disjoint( c1, c2 );
		System.out.println( "disjoint(): " + d );
	}
}
