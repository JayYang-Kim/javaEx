package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 이름과 세과목 점수를 입력 받아 합격 여부를 판단하는 프로그램을 작성하시오.
 * */
public class If_Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		int b, c, d, e;
		
		System.out.println("이름을 입력해주세요.");
		a = sc.next();
		System.out.println("첫번째 점수를 입력해주세요.");
		b = sc.nextInt();
		System.out.println("두번째 점수를 입력해주세요.");
		c = sc.nextInt();
		System.out.println("세번째 점수를 입력해주세요.");
		d = sc.nextInt();
		
		// 평균 구하기
		e = (b + c+ d) / 3;
		
		System.out.println("평균 : " + e);
		
		/*if ((b >= 40 && c >= 40 && d >= 40) && (e >= 60)) {
			System.out.println(a + "님은" + " 합격 입니다.");
		} else if ((e >=60) || (b < 40 && c < 40 && d < 40)) {
			System.out.println(a + "님은" + " 과락 입니다.");
		} else {
			System.out.println(a + "님은" + " 불합격 입니다.");
		}*/
		
		if ((b >= 40 && c >= 40 && d >= 40) && (e >= 60)) {
			System.out.println(a + "님은" + " 합격 입니다.");
		} else if (e < 60) {
			System.out.println(a + "님은" + " 불합격 입니다.");
		} else {
			System.out.println(a + "님은" + " 과락 입니다.");
		}
		
		sc.close();
	}

}
