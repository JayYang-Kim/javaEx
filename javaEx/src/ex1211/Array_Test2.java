package ex1211;

/* ��¥ : 2018.12.11
 * ���� : Array ����
 * ��Ÿ : ����1) 5�� 5���� �迭�� 1~25������ ���� ������ó�� ���� ������� ä�� ����ϴ� ���α׷� 
 * */
public class Array_Test2 {

	public static void main(String[] args) {
		int [][]n = new int [5][5];
		int a = 0;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				a++;
				if (i % 2 == 0) {
					n[i][j] = a;
				} else {
					n[i][4-j] = a;
				}
			}
			
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			
			System.out.println();
		}

	}

}
