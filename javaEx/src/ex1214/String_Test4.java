package ex1214;

import java.util.Scanner;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - (string)
 * 기타 : 
 * */

public class String_Test4 {

	public static void main(String[] args) {
		// 이름을 입력 받아 김씨가 몇명인지 출력
		// 단, 입력 받은 이름이 end면 종료
		Scanner sc = new Scanner(System.in);
		String str;
		int count = 0;
		
		while(true) {
			System.out.println("이름을 입력해주세요.");
			str = sc.next();
			
			//if (str.startsWith("김"));
			//if (str.charAt(0) == '김');
			if (str.indexOf("김") == 0) { // 김이 첫번째 자리 있을때
				count++;
			} else if(str.equals("end")) {
				break;
			}
			
		}
		
		System.out.println("김씨는 : " + count + "(명)");
		
		sc.close();
	}

}
