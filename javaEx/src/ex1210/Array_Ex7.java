package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 5명의 이름과 점수를 입력 받아 편차를 계산하여 출력하고, 마지막에 총합과 평균을 출력하는 프로그램 
 * */
public class Array_Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int []score = new int[5];
		
		int tot = 0;
		double ave;
		
		// 5명의 이름과 점수 입력 받기
		for(int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "번째 이름을 입력해주세요.");
			name[i] = sc.next();
			System.out.println("점수를 입력해주세요.");
			score[i] = sc.nextInt();
			
			tot += score[i]; // 총점 계산
		}
		
		ave = (double)tot / 5; // 평균
		
		System.out.println("이름\t점수\t편차");
		
		for(int i = 0; i < name.length; i++) {
			// 편차 (점수 - 평균)
			System.out.println(name[i] + "\t" + score[i] + "\t" + (score[i] - ave));
		}
		
		System.out.println("총합 : " + tot);
		System.out.println("평균 : " + ave);
		
		sc.close();
	}

}