package score1;

import java.util.Scanner;

/* ��¥ : 2018.12.19
 * ���� :  
 * ��Ÿ :  
 * */

public class ScoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ScoreService ss = new ScoreService(); 
		int ch;
		
		while (true) {
			do {
				System.out.println("1.�Է� 2.��� 3.�й��˻� 4.�̸��˻� 5.���� 6.���� 7.����");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 7);
			
			// ���� �� while�� ����������
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
