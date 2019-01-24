package ex1224;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 날짜 : 2018.12.24
 * 내용 : List<>, LinkedList
 * 기타 : List 구현 클래스 : ArrayList, LinkedList, Vector
 * */

public class List_Ex5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long s, e;
		
		s = System.nanoTime();
		
		for (int i = 1; i <= 100000; i++) {
			list.add("테스트" + i);
		}
		
		e = System.nanoTime();
		
		System.out.println("ArrayList : " + (e-s));
		
		s = System.nanoTime();

		for (int i = 1; i <= 100000; i++) {
			list2.add("테스트" + i);
		}

		e = System.nanoTime();

		System.out.println("LinkedList : " + (e - s));
	}

}
