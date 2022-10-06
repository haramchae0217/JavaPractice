import java.util.*;

public class Unique {
	public static void main(String[] args) {
		String[] arr= { "a", "b", "b", "a", "a", "a", "c" };
		System.out.println( "arr= " + Arrays.toString(arr) );
		
		HashSet<String> hset= new HashSet<String>( Arrays.asList(arr) );
		String[] arr2 = hset.toArray( new String[0] );
		System.out.println( "arr2 = " + Arrays.toString(arr2) );
	}
}
