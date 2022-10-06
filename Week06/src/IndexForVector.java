import java.util.*;

public class IndexForVector {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(-1);
		v.add(-2);
		v.add(10);
		System.out.println("before : " + v);
		
		// for문 반복 중 요소 삭제
		for(int i = 0; i < v.size(); i++) {
			if( v.get(i) < 0) { // 음수 값 삭제
				v.remove(i);
			}
		}
		System.out.println("after : " + v);
		
	}
}
