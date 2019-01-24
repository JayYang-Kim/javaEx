package ex1221;

import java.util.Scanner;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : try-with-resources
 * */

public class Exception_Ex5 {

	public static void main(String[] args) {
		int a;
		
		try (Scanner sc = new Scanner(System.in)){ // jdk7.0부터는 자동으로 close()해준다.
			System.out.println("나이를 입력해주세요.");
			a = sc.nextInt();
			
			System.out.println(a > 19 ? "성인" : "미성년자");
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
	}

}
