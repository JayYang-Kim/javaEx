package ex1211;

/* ��¥ : 2018.12.11
 * ���� : ���� �迭(2���� �迭) ����
 * ��Ÿ : ��� a�� b�� �հ� ���� ����ϴ� ���α׷�
 * */
public class Array_Ex6 {

	public static void main(String[] args) {
		int [][]a = {{1,5,6},{2,4,7},{2,5,8}};
		int [][]b = {{7,1,6},{3,4,7},{4,6,3}};
		
		int [][] c = new int[3][3]; // ��
		int [][] d = new int[3][3]; // ��
		
		// ��� ��
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("��");
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		// ��� ��
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					d[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("��");
		
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + "\t");
			}
			
			System.out.println();
		}
	}

}
