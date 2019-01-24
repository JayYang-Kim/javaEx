package score3;

import java.util.Scanner;

public class ScoreApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int ch;
		Score ss=new ScoreImpl();
		
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3.이름검색 4.학번검색 5.수정 6.삭제 7.종료 => ");
				ch = sc.nextInt();
			} while(ch<1||ch>7);
			
			if(ch==7) break;
			
			switch (ch) {
			case 1:ss.input(); break;
			case 2:ss.print(); break;
			case 3:ss.searchName(); break;
			case 4:ss.searchHak(); break;
			case 5:ss.update(); break;
			case 6:ss.delete(); break;
			}
		}
		
		sc.close();
	}
}
