package ex1211;

import java.util.Scanner;

/* 날짜 : 2018.12.11
 * 내용 : Array 예제
 * 기타 : 예제
 * */
public class Array_Ex {

	public static void main(String[] args) {
		// 예제8) 4380원을 지불하기 위해 필요한 500원, 100원, 50원, 10원짜리의 동전의 개수를 구하는 프로그램
		
		/*int []a; // int형 배열 선언
		a = new int[] {500, 100, 50, 10}; // 배열 초기화
		
		int m = 4380; // 금액 
		
		System.out.println("금액 : " + m);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "원   " + (m / a[i]) );
			m %= a[i]; // 500, 100, 50, 10원의 개수를 구한뒤 나머지
		}*/
		
		// 예제9) 년, 월, 일을 입력 받아 입력 받은 날짜의 요일을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int []days = {31,0,31,30,31,30,31,31,30,31,30,31};
		String []week = new String[] {"일","월","화","수","목","금","토"};
		int y, m, d;
		int tot, w;
		
		// 년도가 1900보다 적을 경우 재입력
		do {
			System.out.println("년도를 입력해주세요.");
			y = sc.nextInt();
		} while(y < 1900);

		// 월이 1 ~ 12사이의 수가 아닐경우 재입력
		do {
			System.out.println("월을 입력해주세요.");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// 윤년계산 (4의 배수이고, 100의 배수가 아니거나, 400의 배수이면 윤년
		// 평년계산 (2월이 29일이며, 그렇지 않으면 2월이 28일)
		if(y % 4 == 0 && y % 100 != 0 && y % 400 == 0) {
			days[1] = 29; // 윤년
		} else {
			days[1] = 28; //평년
		}
		
		do {
			System.out.println("일을 일렵해주세요.");
			d = sc.nextInt();
		} while(d < 1 || d > days[m-1]);
		
		// 1년 1월 1일 (월요일) ~ 입력한 년도 예시 (2018년 12월 11일)일까지의 날수
		// 2017(년도 - 1) * 365 + 2017(년도 - 1) / 4 - 2017(년도 - 1) / 100 + 2017(년도 - 1) / 400 + 1 2 3 4 5 6 7 8 9(월) + 11(일)
		tot = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		for (int i = 0; i < m-1; i++) {
			tot += days[i];
		}
		
		tot += d;
		
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n", y, m, d, week[tot % 7]);
		
		sc.close();
	}

}
