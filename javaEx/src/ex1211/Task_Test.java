package ex1211;

import java.util.Scanner;

/* ��¥ : 2018.12.11
 * ���� : Array ����
 * ��Ÿ : �迭�� �迭 ���� 4 ~ 8��, Insertion sort ���� / �� 6������ 2���� Ǯ�����
 *      ���� ������ Ǯ�����Ұ��, �����ð��� ���� ���� 3�� Ǯ��
 * */
public class Task_Test {

	public static void main(String[] args) {
		// ����4) 5�� 5���� �迭�� 1~15������ ���� ������ó�� �� ���� �ﰢ�� ������� ä�� ����ϴ� ���α׷�
		/*int [][] n = new int[5][5];
		int a = 1;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = i; j < n[i].length; j++) {
				n[i][j] = a;
				a++;
			}
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				if(n[i][j] == 0) {
					System.out.print("\t");
				} else {
					System.out.print(n[i][j] + "\t");
				}
				// �迭�� Ȯ�ο�
				// System.out.print(i + " : " + j + " : " + n[i][j] + "\n"); 
			}
			
			System.out.println();
		}*/
		
		// ����6) A ~ Z���� ���ڸ� ������ �̿��Ͽ� �߻��Ͽ� �߻��� ���ڸ� 4 * 4 �迭��  0�� 0������ ��켱���� �����Ͽ� ����ϴ� ���α׷�
		// 2���� �迭 �ߺ��� ���� �����ʿ�
		/*char [][]eng = new char[4][4];
		
		for (int i = 0; i < eng.length; i++) {
			for (int j = 0; j < eng[i].length; j++) {
				// ������ eng�迭�� ����
				eng[i][j] = (char)((Math.random() * 26) + 'A');
				
				// �ߺ��� ��
				for (int k = 0; k < j; k++) {
					if(eng[i][j] == eng[i][k]) {
						j--;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < eng.length; i++) {
			for (int j = 0; j < eng[i].length; j++) {
				System.out.print(eng[i][j] + "\t");
			}
			
			System.out.println();
		}*/
		
		// ����2) 1~20������ ���� �迭�� ������ó�� ä���� ����ϴ� ���α׷�
		// [����] 5�� 4���� �迭�� �̿��Ͽ� �ۼ��Ѵ�.
		/*int [][] num = new int [5][4];
		int na = 1;
		
		for (int i = 0; i < num.length; i++) { // ��
			for (int j = 0; j < num[i].length; j++) { // ��
				num[i][j] = na;
				na++;
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			
			System.out.println();
		}*/
		
		// ����3) 1~20������ ���� �迭�� ������ó�� ä���� ����ϴ� ���α׷�
		// [����] 5�� 4���� �迭�� �̿��Ͽ� �ۼ��Ѵ�.
		/*int[][] num = new int[5][4];
		int na = 1;

		for (int i = 0; i < num[i].length; i++) { // ��
			for (int j = 0; j < num.length; j++) { // ��
				num[j][i] = na;
				na++;
			}
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}

			System.out.println();
		}*/
		
		// ����4) 5 * 4 ��Ŀ� 1~100������ ������ �߻��Ͽ� ������ �� ����ϰ�, 5 * 4 ����� 4 * 5 ��ķ� ��ȯ�Ͽ� ����ϴ� ���α׷�
		// [����] 1 ~ 100 ������ ���� �߻�
		/*int [][] num = new int[5][4];
		int [][] num2 = new int[4][5];
		
		// 5 * 4
		for (int i = 0; i < num.length; i++) { 
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = (int)(Math.random()*100) + 1;
			}
		}
		
		// 4 * 5
		for (int i = 0; i < num2.length; i++) { 
			for (int j = 0; j < num2[i].length; j++) { 
				num2[i][j] = num[j][i];
			}
		}
		
		System.out.println("5 * 4");
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}

			System.out.println();
		}
		
		System.out.println("4 * 5");
		
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2[i].length; j++) {
				System.out.print(num2[i][j] + "\t");
			}

			System.out.println();
		}*/
		
		// ����3) ���� ������ �Է¹޾� ���� ������ŭ�� �ζǸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		/*Scanner sc = new Scanner(System.in);
		
		int []lotto = new int[6];
		int cnt = 0;
		
		// 1 ~ 5 ���̰� �ƴ� ��� ���Է� ó��
		do {
			System.out.println("������ �Է����ּ���.");
			cnt = sc.nextInt();
		} while(cnt < 1 || cnt > 5);
		
		// lotto�� �迭�� ����ŭ ������ ���
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < lotto.length; j++) {
				lotto[j] = (int)(Math.random() * 45) + 1;
				
				// �ߺ� üũ
				for(int k = 0; k < j; k++) {
					if (lotto[j] == lotto[k]) {
						j--;
						break;
					} else {
						
					}
				}
			}
			
			System.out.print((i+1) + "��° : ");
			
			// for-each�� ����ؼ� ��� (����)
			for (int n : lotto) { // lotto������ int n�� �����Ͽ� ���
				System.out.print(n + "  ");
			}
			
			System.out.println();
		}*/
		
		// ����6) �����
		char [][]arr = new char[4][4];
		int []dup = new int[26];
		int k;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				k=(int)(Math.random()*26);
				if(dup[k]==0) {
					dup[k]++;
					arr[i][j]=(char)(k+'A');
				}
				else {
					j--;
					continue;
				}
			}
		}
		for(char []array : arr) {
			for(char ch : array) {
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}

}
