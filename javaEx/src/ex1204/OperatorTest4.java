package ex1204;

import java.util.Scanner;

/* 날짜 : 2018.12.04
 * 내용 : 문제 4) 주행거리와 시속을 입력 받아 주행시간을 계산하는 프로그램을 작성하시오.
 * 		   
 * 기타 : 시간까지는 계산했는데 분과 초는 어떻게 계산해야할지 잘 모르겠습니다.
 * */
public class OperatorTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, c, d;
		double e;

		System.out.println("주행거리를 입력해주세요.");
		a = sc.nextInt();
		System.out.println("시속을 입력해주세요.");
		b = sc.nextInt();
		
		//주행거리 : 467km / 시속 : 110km/h /
		// 주행거리 / 시속 = 값 -> 값 * 3600 (초로 변환) -> 시간, 분, 초를 구하기
		c = a / b;
		d = a / b;
		e = (a / b - c);
		
		System.out.println("주행거리 : " + a + "km" + " 시속 : " + b + "km/h");
		System.out.printf("%d시 %d분 %.2f초\n", c, d, e);
		System.out.println(d);
		
		sc.close();
	}

}
