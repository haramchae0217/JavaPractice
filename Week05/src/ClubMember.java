import java.util.*;

public class ClubMember {
	public static void main(String[] args) {
		HashSet<String> all = new HashSet<String>();
		HashSet<String> atLeastOne = new HashSet<String>();
		HashSet<String> orNot = new HashSet<String>();
		
		String[] computer = {"대찬", "동권", "진석", "수현", "유림", "아현", "용민", "현우", "교선", "민재", "기태"};
		String[] soccer = {"창민", "진석", "희수", "유림", "용민", "현정", "한겅", "민재", "준영", "기태", "동권", "지선"};
		String[] dance = {"지선", "수현", "유림", "용민", "철희", "한겅", "태환", "기태", "서연", "예린", "현우"};
		
		for(String c : computer) {
			for (String s : soccer) {
				for (String d : dance) {
					if( c.contains(s) && s.contains(d)) {
						all.add(c);
					}
				}
			}
		}
		
		for(String c : computer) {
			for(String s : soccer) {
				for(String d : dance) {
					atLeastOne.add(c);
					atLeastOne.add(s);
					atLeastOne.add(d);
				}
			}
		}
		
		for(String s : soccer) {
			for(String d : dance) {
				orNot.add(s);
				orNot.add(d);
			}
		}
		
		for(String c : computer) {
			orNot.remove(c);
		}
		
		for(String s : all) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(String s : atLeastOne) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for(String s : orNot) {
			System.out.print(s + " ");
		}
		System.out.println();
			
	}
}
