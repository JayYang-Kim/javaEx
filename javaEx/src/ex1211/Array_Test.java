package ex1211;

import java.util.Arrays;
import java.util.Scanner;

/* ��¥ : 2018.12.11
 * ���� : Array ����
 * ��Ÿ : �ּҰ�, �ִ밪 ���ϴ� ��� 2����
 *      1) �ּҰ� = �ִ밪, �ִ밪 = �ּҰ� ���� (if, if)
 *      2) �ּҰ� = �ִ밪 = ù��°�� ���� (if, else if)
 * */
public class Array_Test {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		// ����1) ���ʴ� 12�� �ֱ⿡ ���� ������ ���� ������ Ư¡�� ���� ���� ���� / �����̶찡 12�� ������ �������� 0 �� ���ķ� �ٸ� ����� 1�� ���� 
		String []s = {"������","��","��","����","��","��","��","�䳢","��","��","��","��"};
		int y;
		
		// �Է��� �⵵�� 1900���� ������ ���Է� ó��
		do {
			System.out.println("�⵵�� �Է����ּ���.");
			y = sc.nextInt();
		} while(y < 1900);
		
		// 
		System.out.printf("%d�⵵�� %s���� ���Դϴ�.", y, s[y%12]);
		
		sc.close();*/
		
		// ����2) 5���� ����(0~10)�� �Է¹޾� �ִ������� �ּ������� �� ���� ���ϴ� ���α׷�
		/*Scanner sc = new Scanner(System.in);
		
		int []score = new int[5];
		int tot, max, min;
		tot = 0;
		
		// score�迭�� ����ŭ ���� �Է�
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1) + "��° ������ �Է����ּ���.");
			// score�迭�� ����ִ� ���� 0���� �۰ų� 10���� Ŭ ��� ���� ���Է�
			do {
				score[i] = sc.nextInt();
			} while(score[i] < 0 || score[i] > 10);
			
			// score���� ��� ���ؼ� tot������ ����
			tot += score[i];
		}
		
		// max, min�� �ʱⰪ ����
		max = min = score[0];
		
		// �ִ밪, �ּҰ� ���ϱ�
		for(int i = 1; i < score.length; i++) { // score[0]�� �ִ� ���� �ʱⰪ���� max, min�� �����߱� ������ score[1]���� ��
			if(max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.print("���� ����Ʈ : ");
		
		// score�迭�� �� ���� ���
		for (int s : score) { // ������ �ִ� ������ ���� int s�� �ϳ��� ����
			System.out.print(s + "  ");
		}
		
		System.out.println();
		// ������� : ��ü������ �� - �ִ����� - �ּ�����
		System.out.print("��� ���� : " + (tot - max - min));
		
		sc.close();*/
		
		// ���� ���� 1~5���� �Է�
		// �Է��� ����ŭ �ݺ�
		// 1 ~ 45������ 6�� ���
		// ������ ������ ���� ���� �� �־ �迭�� ����ؾ���
		/*Scanner sc = new Scanner (System.in);
		
		int []num = new int[6];
		int a;
		
		// ������ 1 ~ 5���� �Է� �׿��� ���� ���Է�
		do {
			System.out.println("������ �Է����ּ���.");
			a = sc.nextInt();
		} while(a < 1 || a > 5);
		
		for (int i = 1; i <=a; i ++) {
			for(int j = 0; j < num.length; j++) {
				num[j] = (int)(Math.random() * 45) + 1;
				
				for(int k = 0; k < j; k++) {
					if(num[j] == num[k]) {
						j--;
						break;
					} else {
						 
					}
				}
			}
			
			// ����
			Arrays.sort(num);
			
			System.out.println(i + "��° : ");
			for (int s : num) {
				System.out.print(s + "  ");
			}
			
			System.out.println();
		}*/
		
		// ��, ���� �Է� �޾� �Է� ���� ��¥�� �޷��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*int []days = {31,0,31,30,31,30,31,31,30,31,30,31};
		int y, m;
		int tot;
		
		Scanner sc = new Scanner(System.in);
		
		// �⵵�� 1900���� ���� ��� ���Է�
		do {
			System.out.print("�⵵�� �Է����ּ���.");
			y = sc.nextInt();
		} while(y < 1900);
		
		// ���� 1 ~ 12������ ���� �ƴ� ��� ���Է�
		do {
			System.out.print("�� �Է����ּ���.");
			m = sc.nextInt();
		} while(m < 1 || m > 12);
		
		// ������ (4�� ����̰�, 100�� ����� �ƴϰų�, 400�� ����̸� ����
		// ����� (2���� 29���̸�, �׷��� ������ 2���� 28��)
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			days[1] = 29; // ����
		} else {
			days[1] = 28; // ���
		}
		
		// 1.1.1���� y��m��1�ϱ����� ��ü���� ���
		tot = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		for (int i = 0; i < m - 1; i++) {
			tot += days[i];
		}
		
		tot += 1;
		
		System.out.println(tot);
		System.out.println(tot % 7);
		
		// ���� ���ϱ� 7�� �������� 0�̸� �Ͽ���
		int w = tot % 7;
		
		System.out.printf("\t%dҴ %d��\n", y, m);
		System.out.println("     ��      ��      ȭ      ��      ��      ��      ��");
		
		for (int i = 0; i < w; i++) {
			System.out.println("    ");
		}
		
		for(int i = 1; i <= days[m-1]; i++) {
			System.out.printf("%4d", i);
			
			w++;
			if(w % 7 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		sc.close();*/
	}

}
