package ex1210;

/* ��¥ : 2018.12.10
 * ���� : Break�� ����
 * ��Ÿ : 
 * */
public class Break_Ex2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i + j == 4) {
					break;
				}
				
				System.out.println("i : " + i + ", j : " + j);
			}
			
			System.out.println(i);
		}

	}

}
