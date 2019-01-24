package ex1226;

import java.util.Stack;

/* 날짜 : 2018.12.26
 * 내용 : Collection > List > Vector > Stack 
 * 기타 : 추가 (push), 
 * */

public class Stack_Ex {

	public static void main(String[] args) {
		// LIFO구조 : Last in First Out
		Stack<String> st = new Stack<>();
		
		// 데이터 추가
		st.push("자바");
		st.push("안드로이드");
		st.push("웹");
		st.push("스프링");
		
		System.out.println(st);
		
		// peek() : top 위치의 데이터를 리턴하고 삭제하지 않는다.
		while (!st.empty()) { // 비어있지 않으면
			String s = st.pop(); // top 위치의 데이터를 리턴하고 삭제한다.
			System.out.println(s);
		}
	}

}
