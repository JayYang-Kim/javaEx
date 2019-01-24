package test;

import java.util.Scanner;

public class Array_Test {

	public static void main(String[] args) {

		Scanner br = new Scanner(System.in);

		System.out.print("\t�� ���� = ");
		int game = br.nextInt(); // ���Ӽ�

		int[][] lotto = new int[game][6];// �ζǹ�ȣ�� ������ ����

		System.out.println();
		for (int i = 0; i < game; i++) {// game�� ��ŭ �ݺ�
			for (int j = 0; j < lotto[i].length; j++) {// 6�� �ݺ�
				lotto[i][j] = (int) (Math.random() * 45) + 1;// 1~45������ �ϳ�
				for (int k = 0; k < j; k++) {
					if (lotto[i][j] == lotto[i][k]) {// ���� ���ڰ� �ִ��� ��
						j--;
						break;
					}
				} // end for k
			} // end for j �ζǹ�ȣ �Ѽ�Ʈ�� �������...

			// ��Ʈ���� ��
			for (int k = 0; k < i; k++) {// ���缼Ʈ���� �����͵�..
				int cnt = 0;// �������� ����
				for (int m = 0; m < lotto[i].length; m++) {// 6�� �ݺ�
					for (int n = 0; n < lotto[k].length; n++) {// 6�� �ݺ�
						if (lotto[i][m] == lotto[k][n]) {
							cnt++;
							break;
						}
					} // end for n
					if (cnt != m + 1) {// �������� ���ڰ� ����. ������ ���ʿ乫
						break;
					}
				} // end for m
				if (cnt == lotto[k].length) {// 6���� ���ڰ� ��ġ�� ���
					i--;
					break;
				}
			} // end for k
		} // end for i
			// *************��� ���*******************************
		for (int i = 0; i < lotto.length; i++) {
			System.out.print("\t" + (i + 1) + "��° ��õ��ȣ : ");
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.print(lotto[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
