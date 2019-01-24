package ex1205;

import java.util.Scanner;

/* 날짜 : 2018.12.05
 * 내용 : 조건문 예제 (if)
 * 기타 : 다음의 처리조건에 따른 성적처리 프로그램을 작성하시오.
 * */
public class If_Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num, name;
		int midterm, finals, absence, report;
		int midtermScore, finalsScore, attendScore, reportScore;
		int score;
		char grade;
		
		System.out.println("학번을 입력해주세요.");
		num = sc.nextLine();
		System.out.println("이름을 입력해주세요.");
		name = sc.nextLine();
		System.out.println("중간고사 점수를 입력해주세요.");
		midterm = sc.nextInt();
		System.out.println("기말고사 점수를 입력해주세요.");
		finals = sc.nextInt();
		System.out.println("결석횟수를 입력해주세요.");
		absence = sc.nextInt();
		System.out.println("레포트 점수를 입력해주세요.");
		report = sc.nextInt();
		
		midtermScore = (int)(midterm * 0.4); // 중간고사 점수
		finalsScore = (int)(finals * 0.4); // 기말고사 점수
		
		if(absence >= 6) {
			attendScore = 0;
		} else if (absence >= 4) {
			attendScore = 60;
		} else if (absence >= 2) {
			attendScore = 80;
		} else {
			attendScore = 100;
		}
		
		attendScore = (int)(attendScore * 0.1);
		reportScore = (int)(report * 0.1);
		
		score = midtermScore + finalsScore + attendScore + reportScore;
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("\n학번\t이름\t중간고사\t기말고사\t출석점수\t레포트\t합산점수\t학점");
		System.out.print(num+"\t");
		System.out.print(name+"\t");
		System.out.print(midtermScore+"\t");
		System.out.print(finalsScore+"\t");
		System.out.print(attendScore+"\t");
		System.out.print(reportScore+"\t");
		System.out.print(score+"\t");
		System.out.println(grade);
		
		sc.close();
	}

}
