import java.util.*;

public class Movies {
	public static void main(String[] args) {
		String[] arr= { "Transformer", "Starwars", "Matrix", "Terminator", "Avatar",
				"Starwars", "Aliens", "Avatar", "Matrix", "Terminator", "AI", "Matrix",
				"The Martian", "Avatar", "Interstellar", "Transformer", "The Fly",
				"Cube", "Ex Machina", "I, Robot", "DejaVu", "The Martian", "Gravity",
				"Terminator", "The Martian", "Interstellar", "DejaVu", "Avatar" };
		
				ArrayList<String> list = new ArrayList<String>();
				for( String s : arr) {
					list.add( s );
				}
				
				HashSet<String> hset= new HashSet<String>( list);
				for( String s : hset) {
					System.out.println( s + ": " + Collections.frequency( list, s ) );
				}
	}
}
