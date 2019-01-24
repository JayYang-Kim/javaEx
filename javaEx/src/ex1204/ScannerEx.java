package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : Scanner 테스트
 * 기타 : scanner class import하기 
 * */
public class ScannerEx {

	public static void main(String[] args) {
		// System.in : 표준입력
		// System.out : 표준출력

		Scanner sc = new Scanner(System.in); // scanner 객체 생성

		String name;
		int age;
		char gender;
		double height;

		System.out.print("이름 ? ");
		name = sc.next(); // (문자열 입력) 공백은 입력 불가, 엔터 또는 공백이 구분 문자

		System.out.print("나이 ? ");
		age = sc.nextInt(); // (정수 입력)

		System.out.print("성별 ?");
		gender = sc.next().charAt(0); // 문자 입력, charAt(0) 입력글자에서 첫 번째 글자만 가져옴

		System.out.print("키 ?");
		height = sc.nextDouble();

		System.out.printf("이름 : %s \t 나이 : %d \n", name, age);
		System.out.printf("성별 : %c \t 키 : %f \n", gender, height);

		sc.close(); // scanner 종료
	}

}