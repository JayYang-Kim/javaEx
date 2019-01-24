package ex1226;

import java.util.LinkedList;
import java.util.Queue;

/* 날짜 : 2018.12.26
 * 내용 : Queue 
 * */

public class Queue_Ex {
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		
		// 큐의 마지막에 삽입
		qu.offer("서울");
		qu.offer("인천");
		qu.offer("대구");
		qu.offer("부산");
		
		System.out.println(qu);
		
		while (qu.peek() != null) { // peek() : head요소를 반환하고 삭제 하지 않음
			String s = qu.poll(); // poll() : head요소를 반환하고 삭제
			
			System.out.println(s);
		}
	}
}
