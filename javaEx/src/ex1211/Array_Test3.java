package ex1211;

/* ��¥ : 2018.12.11
 * ���� : Array ����
 * ��Ÿ : ����2) 5�� 5���� �迭�� A~Y������ �����ڸ� ������ó�� ä�� ����ϴ� ���α׷�
 * */
public class Array_Test3 {

	public static void main(String[] args) {
		char [][]n = new char [5][5];
		char a = 'A';
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 4; j >= 0; j--) { // ��
				n[j][i] = a++;
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
