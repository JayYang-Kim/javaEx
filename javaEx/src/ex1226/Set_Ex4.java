package ex1226;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* 날짜 : 2018.12.26
 * 내용 : set interface
 * 기타 : 
 * */

public class Set_Ex4 {

	public static void main(String[] args) {
		// Set => List
		Set<String> set = new HashSet<>();
		
		set.add("자바");
		set.add("안드로이드");
		set.add("빅데이터");
		set.add("웹프로그래밍");
		set.add("서블릿");
		
		System.out.println(set);
		
		// Set => List
		List<String> list = new LinkedList<>(set);
		System.out.println(list);
	}

}
