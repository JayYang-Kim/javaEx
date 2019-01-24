package score2;

import java.util.Scanner;

/* 날짜 : 2018.12.24
 * 내용 : ScoreApp 
 * 기타 : 
 * */

public class ScoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		Score ss = new ScoreImpl();
		
		while (true) {
			do {
				System.out.println("1.입력 2.출력 3.이름검색 4.학번검색 5.수정 6.삭제 7.출력(총점순) 8.종료");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 8);
			
			if (ch == 8) {
				break;
			}
			
			switch (ch) {
			case 1 : ss.input(); break;
			case 2 : ss.print(); break;
			case 3 : ss.searchName(); break;
			case 4 : ss.searchHak(); break;
			case 5 : ss.update(); break;
			case 6 : ss.delete(); break;
			case 7 : ss.sortTot(); break;
			}
		}
		
		sc.close();
	}

}
