package ex1207;

/* ��¥ : 2018.12.07
 * ���� : ���� For�� ����
 * ��Ÿ : 
 * */
public class For_Ex2 {

	public static void main(String[] args) {
		/*for (int i = 1; i <=3; i++) {
			System.out.println("i : " + i);
			
			for(int j = 1; j <= 2; j++) {
				System.out.println("i : " + i + " , j : " + j);
			}
			
			System.out.println("====================");
		}*/
		
		/*for (int i = 1; i <=3; i++) {
			System.out.println("i : " + i);
			
			for(int j = 1; j <= i; j++) {
				System.out.println("i : " + i + " , j : " + j);
			}
			
			System.out.println("====================");
		}*/
		
		// ������
		/*for (int i = 2; i <= 9; i++) {
			System.out.println(i + "��\n");
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " : " + (i * j));
			}
			
			System.out.println("====================");
		}*/
		
		// ������ ���η� ���
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "��");
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %2d\t", i, j, i * j);
			}
			
			System.out.println();
		}
	}

}
