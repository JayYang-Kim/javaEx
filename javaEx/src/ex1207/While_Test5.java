package ex1207;

import java.util.Scanner;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int uint = 50000;
		int cnt;
		boolean sw = false;
		int money;
		
		System.out.println("�ݾ��� �Է����ּ���");
		money = sc.nextInt();
		
		while (true) {
			cnt = money / uint;
			System.out.println(uint + " : " + cnt);
			
			if(uint <= 1) break;
			
			money = money - uint * cnt;
			if(sw) {
				uint /= 2;
			} else {
				uint /= 5;
			}
			sw = !sw;
		}
		
		sc.close();
	}

}
