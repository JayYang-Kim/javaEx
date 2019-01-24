package ex1214;

import java.util.Scanner;

/* 날짜 : 2018.12.14
 * 내용 : 자바의 기본 API 클래스 - (string)
 * 기타 : 
 * */

public class String_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		// 수식을 입력 받아 연산 결과를 출력 하는 프로그램
		System.out.println("수식[10+7] ? ");
		str = sc.nextLine(); // 부호가 들어가는 경우에는 불가
		
		// 공백 제거
		str = str.replaceAll("\\s", "");
		
		for (String op : new String[] {"+","-","*","/"}) {
			// 연산자의 위치 (앞쪽에서 찾기)
			int pos = str.indexOf(op);
			
			if (pos > 0) {
				/*System.out.println(pos); // 연산자 순서
				System.out.println(str.charAt(pos)); // 문자 찾기
				System.out.println(str.substring(0, pos)); // [결과] 10 
				System.out.println(str.substring(pos + 1)); // [결과] 7*/
				
				int num1 = Integer.parseInt(str.substring(0, pos));
				int num2 = Integer.parseInt(str.substring(pos + 1));
				
				int result = 0;
				
				switch(op) {
				case "+" : result = num1 + num2;break;
				case "-" : result = num1 - num2;break;
				case "*" : result = num1 * num2;break;
				case "/" : result = num1 / num2;break;
				}
			}
		}
		
		sc.close();
	}

}
