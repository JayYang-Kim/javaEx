package ex1226;

import java.util.Map;
import java.util.TreeMap;

/* 날짜 : 2018.12.26
 * 내용 : Map interface 
 * 기타 : 
 * */

public class Map_Ex3 {
	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<>(); // 저장순서 유지하지 않음
		//Map<String, String> map = new LinkedHashMap<>(); // 입력순서 유지
		Map<String, String> map = new TreeMap<>(); // 키로 정렬 (단, 키는 comparable 인터페이스를 구현되어 있어야한다.)
		
		map.put("홍길동", "서울");
		map.put("김길동", "경기");
		map.put("진길동", "서울");
		map.put("양길동", "인천");
		map.put("서길동", "부산");
		map.put("허길동", "인천");
		
		System.out.println(map);
		
		// contains(Key, Value) : 존재하는지 확인 
		// 키가 존재하는지 체크
		if (map.containsKey("김길동")) {
			System.out.println("김길동은 키가 존재");
		} else {
			System.out.println("길김동은 키가 존재하지 않음");
		}
		
		// 값이 존재하는지 체크
		if (map.containsValue("제주")) {
			System.out.println("제주 값은 존재");
		} else {
			System.out.println("제주 값은 존재하지 않음");
		}
		
		// 값 삭제
		map.remove("홍길동");
		System.out.println(map);
	}
}
