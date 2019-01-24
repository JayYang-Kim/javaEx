package ex1224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 날짜 : 2018.12.24
 * 내용 : List<> / ArrayList
 * 기타 : List 구현 클래스 : ArrayList, LinkedList, Vector
 * */

public class List_Ex2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("경기");
		list2.add("강원");
		list2.add("춘청");
		list2.add("전라");
		list2.add("경상");
		list2.add("제주");
		
		// list에 list2 모든 데이터를 추가
		list.addAll(list2); // 같은 형은 객체만 가능
		                    // list.addAll(index위치, 복사할 객체); index위치에 저장
		
		System.out.println(list);
		
		// List<String> => String[]
		System.out.println("List에서 배열로 변환");
		
		String[] ss = list.toArray(new String[list.size()]);
		
		for (String s : ss) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// String[] => List<String>
		System.out.println("배열에서 List로 변환 - 1");
		
		//List<String> list3 = new ArrayList<>(Arrays.asList(ss));
		List<String> list3 = Arrays.asList(ss);
		
		System.out.println(list3);
		
		// 특정 데이터를 가지고 새로운 객체 생성
		System.out.println("특정 데이터를 가지고 객체 생성");
		
		// index 2 ~ 4까지 추출
		List<String> list4 = list.subList(2, 5); // subList 특정 위치를 추출 (fromIndex, toIndex)
		
		System.out.println(list4);
		
		// 2번째 index ~ 4번째 index까지 제거
		System.out.println("2 ~ 4 index까지 제거");
		
		list.subList(2, 5).clear();
		
		System.out.println(list);
		
		// list2 모두 지우기
		list2.clear();
		
		System.out.println("list2 : " + list2.size());
	}

}
