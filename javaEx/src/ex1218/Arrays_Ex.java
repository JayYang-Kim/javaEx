package ex1218;

import java.util.Arrays;
import java.util.Collections;

/* 날짜 : 2018.12.18
 * 내용 : Arrays Class
 * 기타 : [문자열 비교]
 * 	    == : 주소를 비교
 * 
 *      String의 equals() : 값 비교
 *      String의 compareTo() : 크기 비교 (ASCII 코드 차이값)
 * */

public class Arrays_Ex {
	public static void print(String title, String[] ss) {
		System.out.println(title);
		
		for (String s : ss) {
			System.out.println(s + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] ss = {"홍길동", "김자바", "이자바", "서대한", "이순신"};
		
		print("[원본]", ss); // static 메소드로 정의되어 바로 사용 가능
		
		// 오름차순 정렬
		// Arrays.sort
		Arrays.sort(ss);
		print("[오름차순 정렬 후]", ss);
		
		// 내림차순 정렬 
		// Arrays,sort(배열, Collections.reverseOrder())
		Arrays.sort(ss, Collections.reverseOrder());
		print("[내림차순 정렬 후]", ss);
		
		// Object : 자바의 최상위 클래스 -> 자바의 모든 객체를 가질 수 있다.
		//Object[] oo = {"서울", new Integer(30), "부산", "대구", new Integer(5)};
		//Arrays.sort(oo); [런타임 오류] 배열안에 들어있는 자료형이 다르기 때문에 정렬 오류
		
		// Arrays.copyOf
		char[] c1 = {'a', 'p', 'r', 'i', 'n', 'g'};
		char[] c2 = Arrays.copyOf(c1, c1.length);
		
		System.out.println(c1 == c2);
		System.out.println(Arrays.toString(c1)); // Arrays.toString() : 배열을 문자열로 변환
		System.out.println(Arrays.toString(c2));
		
		// Arrays.copyOfRange
		char[] c3 = Arrays.copyOfRange(c1, 1, 4); // (복사할 배열 선택, index 시작위치, index 종료 - 시작 (개))
		System.out.println(Arrays.toString(c3)); // [결과] [p, r, i]
		
		// Arraycopy
		char[] c4 = new char[c1.length];
		System.arraycopy(c1, 0, c4, 0, c1.length); // (복사대상, 복사대상 대상 index 위치, 붙여넣을 대상, 붙여넣을 대상 index, 길이)
		System.out.println(Arrays.toString(c4));
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = {1,2,3,4,5};
		
		System.out.println(a == b); // 주소 비교
		System.out.println(a.equals(b)); // 주소 비교 (배열은 객체이기 때문에 equals 사용가능)
		
		// 요소의 값 비교
		System.out.println(Arrays.equals(a, b)); // [결과] true
		System.out.println(Arrays.equals(a, c)); // [결과] false
		
		int[][] aa = {{1,2,3},{4,5,6}};
		int[][] bb = {{1,2,3},{4,5,6}};
		
		// 얕은 비교
		// 2차원 배열에서는 1차원에서 가지고 있는 주소 비교
		System.out.println(Arrays.equals(aa, bb)); // [결과] false
		
		// 깊은 비교
		// 2차원 배열에서는 1차원에서 가지고 있는 주소가 가진 값을 비교
		System.out.println(Arrays.deepEquals(aa, bb)); // [결과] true
	}

}
