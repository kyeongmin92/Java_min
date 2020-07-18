package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet");
		set.add("JAVA");
		set.add("MySql");
		
		int size = set.size();
		System.out.println("총 객체수:"+size);
		
		/*Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}*/
		// 향상된 for문 사용
		for(String element : set) {
			System.out.println(element);
		}

	}

}
