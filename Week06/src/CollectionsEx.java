import java.util.*;

public class CollectionsEx {
	public static void main(String[] args) {
		LinkedList<String> myList= new LinkedList<String>();
		
		myList.add("Transformer");
		myList.add("Starwars");
		myList.add("Matrix");
		myList.add(0,"Terminator");
		myList.add(2,"Avatar");
		System.out.println( myList );
		
		Collections.sort( myList ); // 요소정렬, 리스트컬렉션을인자로받음
		System.out.println( myList );
		
		int index = Collections.binarySearch( myList, "Starwars") ; // 이진탐색, 리스트컬렉션을인자로받음
		System.out.println( "Starwarsis at" + index );
		
		Collections.reverse( myList); // 요소의순서를반대로, 리스트컬렉션을인자로받음
		System.out.println( myList);
	}
}
