package ex1226;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* 날짜 : 2018.12.26
 * 내용 : set interface
 * 기타 : 
 * */

public class Set_Ex2 {

	public static void main(String[] args) {
		// 삽입순서를 유지, 중복을 허용하지 않음
		Set<String> set = new LinkedHashSet<>();
		
		set.add("자바");
		set.add("안드로이드");
		set.add("빅데이터");
		set.add("웹프로그래밍");
		set.add("서블릿");
		
		System.out.println(set);
		
		// 동일한 데이터 중복 불가
		set.add("서블릿"); 
		
		System.out.println(set); // [결과] 서블릿 추가 안됨
		
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		
		System.out.println();
	}

}
