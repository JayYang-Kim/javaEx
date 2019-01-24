package ex1217;

import java.util.Random;
import java.util.Scanner;

/* 날짜 : 2018.12.17
 * 내용 : Random Class
 * 기타 : 1. (야구)
 *      2. 난수를 발생하여 20번 안에 맞추기
 * */

class Baseball {
	// 필드 (멤버변수)
	int ball; // ball count
	int strike; // strike count
	int out; // out count
	
	String com, user;
	
	Scanner sc = new Scanner(System.in);

	// 컴퓨터 난수 생성 (Method)
	public void toCom() {
		StringBuffer bf = new StringBuffer();
		
		Random rnd = new Random();
		int c;
		
		gogo:
		for (int i = 0; i < 3; i++) {
			c = rnd.nextInt(10); // 0 ~ 9 난수 대입
			
			for (int j = 0; j < bf.length(); j++) {
				if (c == Integer.parseInt(bf.substring(j, j+1))) {
					i--;
					continue gogo;
				}
			}
			
			bf.append(Integer.toString(c));
		}
		
		com = bf.toString();
	}
	
	// 유저 생성 (Method)
	public void toUser() {
		do {
			System.out.println("0 ~ 9사이의 세 정수를 입력해주세요.");
			user = sc.next();
		} while(user.length() != 3);
	}
	
	// 플레이 (Method)
	public void toPlay() {
		boolean finish = false;
		
		toCom();
		
		while (!finish) {
			this.strike = this.ball = 0;
			
			toUser();
			
			for (int i = 0; i < 3; i++) {
				// 스트라이크 체크
				if (Integer.parseInt(com.substring(i, i+1)) == Integer.parseInt(user.substring(i, i+1))) {
					this.strike++;
					continue;
				} else {
				
				}
				
				// 볼 체크
				for (int j = 0; j < 3; j++) {
					if (Integer.parseInt(com.substring(i, i+1)) == Integer.parseInt(user.substring(j, j+1))) {
						this.ball++;
						break;
					}
				}
			}
			
			if (strike == 3) {
				System.out.println("홈런입니다~~~~");
				finish = true;
				sc.close();
			} else if (strike == 0 && ball == 0) {
				this.out++;
				System.out.println("아웃");
			}
			
			if (out == 3) {
				System.out.println("재도전해주세요.");
				finish = true;
				sc.close();
			}
			
			System.out.print("스트라이크 개수 : " + this.strike + ",");
			System.out.print(" 볼 개수 : " + this.ball + ",");
			System.out.print(" 아웃 개수 : " + this.out + "\n");
		}
	}
	
}

public class Random_Test2 {
	
	public static void main(String[] args) {
		Baseball bs = new Baseball(); // 객체 생성 (메모리 할당)
		
		bs.toPlay();
	}

}