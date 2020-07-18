package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet");
		list.add(2, "Database");
		list.add("MySql");
		
		int size = list.size();   // 저장된 총 객체 수 얻기
		System.out.println("총 객체수:"+size);
		System.out.println();
		
		String skill = list.get(2);   // 2번 인덱스의 객체 얻기
		System.out.println("2: "+ skill);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {   // 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);  // 2번 인덱스 객체(Database) 삭제됨		
		list.remove(2);  // 2번 인덱스 객체(Servlet) 삭제됨
		list.remove("MySql");
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		// 향상된 for문
		int count = 0;
		for(String str : list) {			
			System.out.println(count+":"+str);
			count ++;
		}
		

	}

}
