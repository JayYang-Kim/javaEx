package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, len, temp;
		
		System.out.println("정수를 입력해주세요.");
		num = sc.nextInt();
		
		temp = num; // 정수 임시저장
		
		// 절대값 구하기
		if(temp < 0) {
			temp = -temp;
		}
		
		len = 1;
		while(temp >= 10) {
			len++;
			temp /= 10;
		}
		
		System.out.println(num + " , " + len);
		
		sc.close();
		
		
	}

}
