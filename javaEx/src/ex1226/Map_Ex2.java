package ex1226;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* 날짜 : 2018.12.26
 * 내용 : Map interface 
 * 기타 : 
 * */

public class Map_Ex2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<>(); // 동기화 지원
		
		map.put("자바", 90);
		map.put("스프링", 100);
		map.put("빅데이터", 60);
		map.put("오라클", 80);
		map.put("웹", 90);
		
		// map의 value를 List로 변환
		List<Integer> list = new LinkedList<>(map.values());
		
		System.out.println(list);
		
		// Map의 value를 Collection으로 변환
		Collection<Integer> c = map.values();
		
		for (int n : c) {
			System.out.println(n);
		}
	}
}
