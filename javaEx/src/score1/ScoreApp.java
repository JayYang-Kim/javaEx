package score1;

import java.util.Scanner;

/* 날짜 : 2018.12.19
 * 내용 :  
 * 기타 :  
 * */

public class ScoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreService ss = new ScoreService(); 
		int ch;
		
		while (true) {
			do {
				System.out.println("1.입력 2.출력 3.학번검색 4.이름검색 5.수정 6.삭제 7.종료");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 7);
			
			// 종료 시 while문 빠져나오기
			if (ch == 7) {
				break;
			}
			
			switch (ch) {
			case 1 : ss.input(); break;
			case 2 : ss.print(); break;
			case 3 : ss.searchHak(); break;
			case 4 : ss.searchName(); break;
			case 5 : ss.update(); break;
			case 6 : ss.delete(); break;
			}
		}
		
		sc.close();
	}

}
