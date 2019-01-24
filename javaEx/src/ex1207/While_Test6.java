package ex1207;

import java.util.Scanner;

/* 날짜 : 2018.12.07
 * 내용 : while / do ~ while문 문제
 * 기타 : 
 * */
public class While_Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com, user, cnt;
		
		// 난수 생성
		com = (int)(Math.random() * 100) + 1;
		
		cnt = 0;
		
		/*while(true) {
			// 사용자 수 입력
			System.out.println("수를 입력해주세요");
			user = sc.nextInt();
			cnt++;
			
			if(com > user) {
				System.out.println("입력한 수보다 큰수입니다.");
			} else if (com < user) {
				System.out.println("입력한 수보다 작은수입니다.");
			} else if (com == user) {
				System.out.println(cnt + "번 만에 성공했습니다.");
				break;
			}
		}*/
		
		while (true) {
			System.out.println("수를 입력해주세요.");
			user = sc.nextInt();
			cnt++;
			
			if(user == com) {
				System.out.println(cnt + "번 만에 성공했습니다.");
				break;
			} else if (user > com) {
				System.out.println("입력한 수보다 작은수입니다.");
			} else if (user < com) {
				System.out.println("입력한 수보다 큰수입니다.");
			}
		}
		
		sc.close();
	}

}