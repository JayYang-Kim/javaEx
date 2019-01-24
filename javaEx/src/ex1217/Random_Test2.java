package ex1217;

import java.util.Random;
import java.util.Scanner;

/* ��¥ : 2018.12.17
 * ���� : Random Class
 * ��Ÿ : 1. (�߱�)
 *      2. ������ �߻��Ͽ� 20�� �ȿ� ���߱�
 * */

class Baseball {
	// �ʵ� (�������)
	int ball; // ball count
	int strike; // strike count
	int out; // out count
	
	String com, user;
	
	Scanner sc = new Scanner(System.in);

	// ��ǻ�� ���� ���� (Method)
	public void toCom() {
		StringBuffer bf = new StringBuffer();
		
		Random rnd = new Random();
		int c;
		
		gogo:
		for (int i = 0; i < 3; i++) {
			c = rnd.nextInt(10); // 0 ~ 9 ���� ����
			
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
	
	// ���� ���� (Method)
	public void toUser() {
		do {
			System.out.println("0 ~ 9������ �� ������ �Է����ּ���.");
			user = sc.next();
		} while(user.length() != 3);
	}
	
	// �÷��� (Method)
	public void toPlay() {
		boolean finish = false;
		
		toCom();
		
		while (!finish) {
			this.strike = this.ball = 0;
			
			toUser();
			
			for (int i = 0; i < 3; i++) {
				// ��Ʈ����ũ üũ
				if (Integer.parseInt(com.substring(i, i+1)) == Integer.parseInt(user.substring(i, i+1))) {
					this.strike++;
					continue;
				} else {
				
				}
				
				// �� üũ
				for (int j = 0; j < 3; j++) {
					if (Integer.parseInt(com.substring(i, i+1)) == Integer.parseInt(user.substring(j, j+1))) {
						this.ball++;
						break;
					}
				}
			}
			
			if (strike == 3) {
				System.out.println("Ȩ���Դϴ�~~~~");
				finish = true;
				sc.close();
			} else if (strike == 0 && ball == 0) {
				this.out++;
				System.out.println("�ƿ�");
			}
			
			if (out == 3) {
				System.out.println("�絵�����ּ���.");
				finish = true;
				sc.close();
			}
			
			System.out.print("��Ʈ����ũ ���� : " + this.strike + ",");
			System.out.print(" �� ���� : " + this.ball + ",");
			System.out.print(" �ƿ� ���� : " + this.out + "\n");
		}
	}
	
}

public class Random_Test2 {
	
	public static void main(String[] args) {
		Baseball bs = new Baseball(); // ��ü ���� (�޸� �Ҵ�)
		
		bs.toPlay();
	}

}