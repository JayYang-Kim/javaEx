package ex1211;

import java.util.Arrays;
import java.util.Scanner;

/* 날짜 : 2018.12.11
 * 내용 : Array 문제
 * 기타 : 최소값, 최대값 구하는 방법 2가지
 *      1) 최소값 = 최대값, 최대값 = 최소값 대입 (if, if)
 *      2) 최소값 = 최대값 = 첫번째값 대입 (if, else if)
 * */
public class Array_Test {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		// 문제1) 생초는 12년 주기에 따라 각각의 해의 동물의 특징을 연관 짓는 구조 / 원숭이띠가 12로 나눌때 나머지가 0 그 이후로 다른 띠들은 1씩 증가 
		String []s = {"원숭이","닭","개","돼지","쥐","소","범","토끼","용","뱀","말","양"};
		int y;
		
		// 입력한 년도가 1900보다 적으면 재입력 처리
		do {
			System.out.println("년도를 입력해주세요.");
			y = sc.nextInt();
		} while(y < 1900);
		
		// 
		System.out.printf("%d년도는 %s띠의 해입니다.", y, s[y%12]);
		
		sc.close();*/
		
		// 문제2) 5개의 점수(0~10)를 입력받아 최대점수와 최소점수를 뺀 합을 구하는 프로그램
		/*Scanner sc = new Scanner(System.in);
		
		int []score = new int[5];
		int tot, max, min;
		tot = 0;
		
		// score배열의 수만큼 점수 입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "번째 점수를 입력해주세요.");
			// score배열에 들어있는 값이 0보다 작거나 10보다 클 경우 점수 재입력
			do {
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 10);
			
			// score점수 모두 더해서 tot변수에 대입
			tot += score[i];
		}
		
		// max, min에 초기값 세팅
		max = min = score[0];
		
		// 최대값, 최소값 구하기
		for(int i = 1; i < score.length; i++) { // score[0]에 있는 값은 초기값으로 max, min에 대입했기 떄문에 score[1]부터 비교
			if(max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.print("점수 리스트 : ");
		
		// score배열에 들어간 점수 출력
		for (int s : score) { // 우측에 있는 집합을 좌측 int s에 하나씩 대입
			System.out.print(s + "  ");
		}
		
		System.out.println();
		// 취득점수 : 전체점수의 합 - 최대점수 - 최소점수
		System.out.print("취득 점수 : " + (tot - max - min));
		
		sc.close();*/
		
		// 구매 개수 1~5사이 입력
		// 입력한 수만큼 반복
		// 1 ~ 45난수를 6번 출력
		// 난수는 동일한 수가 나올 수 있어서 배열을 사용해야함
		/*Scanner sc = new Scanner (System.in);
		
		int []num = new int[6];
		int a;
		
		// 개수가 1 ~ 5까지 입력 그외의 경우는 재입력
		do {
			System.out.println("개수를 입력해주세요.");
			a = sc.nextInt();
		} while(a < 1 || a > 5);
		
		for (int i = 1; i <=a; i ++) {
			for(int j = 0; j < num.length; j++) {
				num[j] = (int)(Math.random() * 45) + 1;
				
				for(int k = 0; k < j; k++) {
					if(num[j] == num[k]) {
						j--;
						break;
					} else {
						 
					}
				}
			}
			
			// 정렬
			Arrays.sort(num);
			
			System.out.println(i + "번째 : ");
			for (int s : num) {
				System.out.print(s + "  ");
			}
			
			System.out.println();
		}*/
		
		// 년, 월을 입력 받아 입력 받은 날짜의 달력을 출력하는 프로그램을 작성하시오.
		/*int []days = {31,0,31,30,31,30,31,31,30,31,30,31};
		int y, m;
		int tot;
		
		Scanner sc = new Scanner(System.in);
		
		// 년도가 1900보다 적을 경우 재입력
		do {
			System.out.print("년도를 입력해주세요.");
			y = sc.nextInt();
		} while(y < 1900);
		
		// 월이 1 ~ 12사이의 수가 아닐 경우 재입력
		do {
			System.out.print("월 입력해주세요.");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// 윤년계산 (4의 배수이고, 100의 배수가 아니거나, 400의 배수이면 윤년
		// 평년계산 (2월이 29일이며, 그렇지 않으면 2월이 28일)
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			days[1] = 29; // 윤년
		} else {
			days[1] = 28; // 평년
		}
		
		// 1.1.1에서 y년m월1일까지의 전체날수 계산
		tot = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		for (int i = 0; i < m - 1; i++) {
			tot += days[i];
		}
		
		tot += 1;
		
		System.out.println(tot);
		System.out.println(tot % 7);
		
		// 요일 구하기 7로 나눴을때 0이면 일요일
		int w = tot % 7;
		
		System.out.printf("\t%d年 %d月\n", y, m);
		System.out.println("     일      월      화      수      목      금      토");
		
		for (int i = 0; i < w; i++) {
			System.out.println("    ");
		}
		
		for(int i = 1; i <= days[m-1]; i++) {
			System.out.printf("%4d", i);
			
			w++;
			if(w % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		sc.close();*/
	}

}
