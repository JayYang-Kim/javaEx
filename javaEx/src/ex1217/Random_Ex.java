package ex1217;

import java.util.Random;

/* 날짜 : 2018.12.17
 * 내용 : Random Class
 * 기타 : 여러 형태의 난수를 제공
 * */

public class Random_Ex {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				n = rnd.nextInt(100) + 1; // 1 ~ 100사이 난수
				System.out.printf("%4d", n);
			}
			
			System.out.println();
		}
	}

}
