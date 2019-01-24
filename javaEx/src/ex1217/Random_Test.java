package ex1217;

import java.util.Random;

/* 날짜 : 2018.12.17
 * 내용 : Random Class
 * 기타 : 여러 형태의 난수를 제공
 * */

public class Random_Test {
	// 5자리 난수
	public static String toNumber5() {
		StringBuffer sb = new StringBuffer();
		
		Random rd = new Random();
		
		for (int i = 0; i < 5; i++) {
			sb.append(Integer.toString(rd.nextInt(10))); // Integer.toString() : 숫자를 문자열로 변환 
												         // rd.nextInt(10) : 0 ~ 9까지의 난수
		}
		
		return sb.toString();
	}
	
	// 서로 다른 3자리 난수
	public static String toNumber3() {
		StringBuffer sb = new StringBuffer();
		
		Random rd = new Random();
		int n; // 정수
		
		gogo:
		for (int i = 0; i < 3; i++) {
			n = rd.nextInt(10); // 0 ~ 9 난수 대입
			
			for (int j = 0; j < sb.length(); j++) {
				if (n == Integer.parseInt(sb.substring(j, j+1))) {
					i--;
					continue gogo;
				}
			}
			
			sb.append(Integer.toString(n));
		}
		
		return sb.toString();
	}
	
	// A~Z, a~z, 0~9를 조합하여 10자리 문자열 만들기
	public static String toString10() {
		StringBuffer sb = new StringBuffer();
		
		Random rd = new Random();
		int n;
		String s = "ABCDEFGHIJKLMNOPQRSTYVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < 10; i++) {
			n = rd.nextInt(s.length());
			sb.append(s.charAt(n)); // 문자 추가 (뒤에)
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String s;
		
		s = toNumber5();
		System.out.println("다섯자리 난수 : " + s);
		
		s = toNumber3();
		System.out.println("서로 다른 세자리 난수 : " + s);
		
		s = toString10();
		System.out.println("A~Z, a~z, 0~9 : " + s);
	}

}
