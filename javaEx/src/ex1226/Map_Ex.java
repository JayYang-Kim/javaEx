package ex1226;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 날짜 : 2018.12.26
 * 내용 : Map interface 
 * 기타 : map에서는 추가할때 put메소드를 사용한다.
 *      list, set에서는 추가할때 add메소드를 사용
 *      map은 반복자가 없음
 * */

public class Map_Ex {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// map.put (입력)
		// list.add, set.add (입력)
		map.put("seoul", 1000);
		map.put("incheon", 270);
		map.put("busan", 250);
		map.put("seoul", 990); // key값이 동일하고 value만 변경할 경우 value는 덮어쓰기됨
		
		System.out.println(map);
		
		// key로 접근하여 value출력
		int n = map.get("busan");
		System.out.println(n);
		
		// map은 key가 set이므로 key를 이용하여 반복자로 순환하여 전체를 가져올 수 있다.
		// 전체 데이터 출력 - 1
		System.out.println("전체 데이터 출력 - 1");
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		System.out.println();
		
		// 전체 데이터 출력 - 2
		// foreach
		System.out.println("전체 데이터 출력 - 2");
		
		for (String s : map.keySet()) {
			Integer i = map.get(s);
			
			System.out.println(s + " : " + i); // s : key, i : value
		}
		
		System.out.println();
		
		// 전체 데이터 출력 - 3
		System.out.println("전체 데이터 출력 - 3");
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it2 = set.iterator();
		
		while (it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println();
		
		// 전체 데이터 출력 - 4
		System.out.println("전체 데이터 출력 - 4");
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}
		
		System.out.println();
	}
}
