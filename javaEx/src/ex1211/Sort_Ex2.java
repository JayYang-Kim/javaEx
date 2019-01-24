package ex1211;

import java.util.Scanner;

/* 날짜 : 2018.12.11
 * 내용 : sort 예제
 * 기타 : 
 * */
public class Sort_Ex2 {

	public static void main(String[] args) {
		// 1) 순위 계산하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		// int inwon = 5;
		// String []name = new String[inwon];
		String []name = new String[5];
		int []score = new int [5];
		int []rank = new int [5];
		
		// 5명에 대한 이름, 점수 입력 받기
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "번째 이름을 입력해 주세요.");
			name[i] = sc.next();
			
			// 점수가 0보다 작거나 100보다 클경우 재입력
			do {
				System.out.println("점수를 입력해주세요.");
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 100);
		}
		
		// 순위 계산 (순위 계산 시 초기값은 1로 대입)
		for (int i = 0; i < rank.length; i ++) {
			rank[i] = 1;
		}
		
		// Selection sort방식
		for (int i = 0; i < score.length; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		
		// 이름, 점수 이름의 배열수만큼 출력
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + score[i] + "\t" + rank[i]);
		}
		
		sc.close();
	}

}
