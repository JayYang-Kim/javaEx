package ex1224;

import java.util.Collections;
import java.util.Vector;

/* 날짜 : 2018.12.24
 * 내용 : List<>, Vector
 * 기타 : List 구현 클래스 : ArrayList, LinkedList, Vector
 * */


public class Vector_Ex {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		System.out.println("최초의 용량 : " + v.capacity()); // 10
		
		v.add("자바");
		v.add("안드로이드");
		v.add("HTML");
		v.add("CSS");
		v.add("하둡");
		v.add("몽고디비");
		v.add("오라클");
		v.add("MS-SQL");
		v.add("MYSQL");
		v.add("자바스크립트");
		v.add("node.js");
		v.add("서블릿");
		v.add("JSP");
		v.add("C");
		v.add("C++");
		v.add("PHP");
		
		System.out.println("용량 : " + v.capacity());
		
		// 첫번째 index 데이터 가져오기
		System.out.println("처음 : " + v.get(0)); 
		System.out.println("처음 : " + v.firstElement()); 
		
		// 마지막 index 데이터 가져오기
		System.out.println("마지막 : " + v.get(v.size() - 1)); 
		System.out.println("마지막 : " + v.lastElement());
		
		// 데이터 수정
		v.set(0, "JAVA");
		System.out.println(v);
		
		// 데이터 추가
		v.add(1, "자바 JAVA");
		System.out.println(v);
		
		// 정렬 - 가나다순 (오름차순)
		Collections.sort(v);
		System.out.println(v);
		
		// 반드시 오름차순 정렬이 되어 있어야한다.
		// 검색 : 순차검색, 이진검색
		int n = Collections.binarySearch(v, "오라클");
		if (n != -1) {
			System.out.println("오라클 : " + n + "인덱스에 존재");
		}
		
		// 정렬  - 다나가순 (내림차순)
		Collections.sort(v, Collections.reverseOrder());
		System.out.println(v);
		
		v.clear();
		
		System.out.println(v.size()); // 데이터 수
		System.out.println(v.capacity()); // 용량
		
		v.add("JAVA");
		// 용량을 벡터의 개수로
		v.trimToSize();
		
		System.out.println(v.size()); // 데이터 수
		System.out.println(v.capacity()); // 용량
	}

}
