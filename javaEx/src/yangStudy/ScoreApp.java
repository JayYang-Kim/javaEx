package yangStudy;

import java.util.Scanner;

/* 날짜 : 2018.12.19
 * 내용 : 입력, 출력, 학점검색, 수정, 삭제, 종료를 선택하는 프로그램
 * 기타 :
 * 관련 class : Score, ScoreService, ScoreVO   
 * */

public class ScoreApp {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ScoreService ss = new ScoreService();
		
		int choice; // 키보드 정보를 입력받을 변수
		
		// 무한루프
		while (true) {
			do {
				System.out.println("성적을 입력받는 프로그램입니다.\n무엇을 하시겠습니까?");
				System.out.println("[1.입력] [2.출력] [3.학번검색] [4.수정] [5.삭제] [6.종료]");
				choice = sc.nextInt();
			} while(choice < 1 || choice > 6); // 입력 숫자가 1 ~ 6 사이가 아닐경우 재입력 처리
			
			// 기능 선택
			switch (choice) {
			case 1 : ss.input(); break;
			case 2 : ss.print(); break;
			case 3 : ss.searchHakbun(); break;
			case 4 : ss.update(); break;
			case 5 : ss.delete(); break;
			}
			
			// 종료 처리
			if(choice == 6) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
		
		sc.close();
	}

}
