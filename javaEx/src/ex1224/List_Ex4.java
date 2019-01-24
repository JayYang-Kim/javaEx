package ex1224;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/* 날짜 : 2018.12.24
 * 내용 : List<>, LinkedList
 * 기타 : List 구현 클래스 : ArrayList, LinkedList, Vector
 * */

public class List_Ex4 {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("서울"); // 중복 허용
		
		System.out.println(list); // 전체 데이터 출력 (list.toString() 동일)
		System.out.println("전체 개수 : " + list.size());
		
		// 순서대로 출력
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		
		System.out.println(list.get(list.size() - 1)); // 제일 마지막 값 출력
		
		// 처음에 한국 추가 (add)
		list.add(0, "한국"); // list.add(index 순서, 추가할 문자열)
		System.out.println(list);
		
		// index 순서에 있는 데이터 수정 (set)
		list.set(0, "대한민국");
		System.out.println(list);
		
		// 서울 존재 여부 확인
		if (list.contains("서울")) {
			System.out.println("서울이 존재합니다.");
		}
		
		// 부산의 인덱스(위치) 확인
		int i = list.indexOf("부산"); // 데이터가 없을 경우 -1 리턴
		System.out.println("부산 인덱스 확인 : " + i);
		
		// 대한민국 데이터 삭제
		list.remove("대한민국");
		System.out.println(list.size());
		System.out.println(list);
		
		// for를 이용한 전체 데이터 출력
		System.out.println("전체 출력 - 1");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j) + "  ");
		}
		
		System.out.println();
		
		// for를 이용한 전체 데이터 출력 (역순)
		System.out.println("역순출력");
		for (int j = list.size() - 1; j >= 0; j--) {
			System.out.println(list.get(j) + "  ");
		}

		System.out.println();
		
		// forEach를 이용한 전체 데이터 출력
		System.out.println("전체 출력 - 2");
		for (String s : list) {
			System.out.println(s + "  ");
		}
		
		System.out.println();
		
		// Iterator(반복자)를 이용한 전체 데이터 출력 : 처음부터 끝까지 하나씩 추출하는 반복
		System.out.println("전체 출력 - 3");
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) { // 데이터가 존재하면 true, 없으면 false
			String s = it.next(); // 데이터를 리턴해주고 다음으로 이동
			System.out.println(s + "  ");
		}
		
		System.out.println();
		
		// ListIterator를 이용한 전체 데이터 출력 
		// ListIterator : Vector에서는 존재하지 않고 역숙은로 출력 가능
		System.out.println("전체 출력 - 4");
		ListIterator<String> it2 = list.listIterator();
		
		while (it2.hasNext()) {
			String s = it2.next();
			System.out.println(s + "  ");
		}
		
		System.out.println();
		
		System.out.println("역순출력 - 2");
		// 가장 뒤로 이동한 다음에 출력 할 수 있다.
		
		while (it2.hasPrevious()) {
			String s = it2.previous();
			System.out.println(s + "  ");
		}
		
		System.out.println();
	}

}
