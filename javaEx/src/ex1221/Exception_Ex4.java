package ex1221;

import java.util.Scanner;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : 
 * */

public class Exception_Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		try {
			System.out.println("나이를 입력해주세요.");
			a = sc.nextInt();
			
			System.out.println(a > 19 ? "성인" : "미성년자");
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
