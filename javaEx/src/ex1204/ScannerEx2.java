package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : Scanner 테스트 (nextLine)
 * 기타 :
 * */
public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String tel;
		
		System.out.print("이름 ?");
		name = sc.nextLine(); // 공백 입력 가능
		
		System.out.print("나이 ?");
		age = sc.nextInt();
		sc.nextLine(); // enter 입력을 버리는 처리 (이 처리가 없을 경우 전화번호 입력쪽에서 enter가 입력되어 전화번호를 받을 수 없음)
		
		System.out.print("전화번호 ?");
		tel = sc.nextLine(); // 공백 입력 가능
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화번호 : " + tel);
		
		sc.close();
	}

}