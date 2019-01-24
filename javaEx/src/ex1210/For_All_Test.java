package ex1210;

import java.util.Scanner;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 난수를 이용하여 컴퓨터와 가위, 바위, 보 게임을 진행하는 프로그램을 작성하시오.
 * */
public class For_All_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int user, com;
		
		while(true) {
			do {
				System.out.println("1. 가위 2. 바위 3. 보 4. 종료 =>");
				user = sc.nextInt();
			} while(user < 1 || user > 4);
			
			if(user == 4) {
				break;
			}
			
			com = (int)(Math.random()*3)+1;
			
			System.out.println("컴퓨터 : " + (com == 1 ? "가위" : com == 2 ? "바위" : "보"));
			System.out.println("사용자 : " + (user == 1 ? "가위" : user == 2 ? "바위" : "보"));
			
			// 결과 판별
			if(com == user) {
				System.out.println("비겼습니다.");
			} else if((user == 1 && com == 3) || (user == 2 && com == 1) || (user == 3 && com == 2)) {
				System.out.println("당신이 이겼습니다.");
			} else {
				System.out.println("당신이 졌습니다.");
			}
		}
		
		sc.close();
	}

}
