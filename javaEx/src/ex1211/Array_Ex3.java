package ex1211;

/* ��¥ : 2018.12.11
 * ���� : ���� �迭(2���� �迭) ����
 * ��Ÿ : ���� �迭 ����
 * */
public class Array_Ex3 {

	public static void main(String[] args) {
		int[][] arr = new int[5][4];
		int n = 0;

		System.out.println("��� : " + arr.length);
		System.out.println("1���� ���� : " + arr[1].length);

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				n++;
				arr[j][i] = n;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}

			System.out.println();
		}
	}

}
