package ex1210;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : 1) 1~10���� ��, 11~20������ �� ~ 91~100���� ���� ���ϴ� ���α׷�
 *      2) 1~100���� ���� 4�� 6�� ������� ����ϴ� ���α׷�
 * */
public class For_Test4 {

	public static void main(String[] args) {
		/*int a, b;
		int sum;
		sum = 0;

		for (a = 1; a <= 100; a++) {

			for (b = 1; b <= 10; b++) {
				sum += b; // ��
			}
			
			System.out.println(a + " ~ " + b +" ���� �� : " + sum);
		}*/
		
		// 1)
		/*int s;
		for(int i = 1; i <= 10; i++) {
			s = 0;
			
			for(int j = (i - 1) * 10 + 1; j <= i + 10; j++) {
				s+=j;
			}
			
			System.out.printf("%d ~ %d ������ : %d\n", (i-1)*10+1, i+10, s);
		}*/
		
		// 2)
		for (int i = 1; i<= 100; i++) {
			if(i % 4 == 0 && i % 6 == 0) {
				System.out.println(i + "");
			}
		}
		System.out.println();
	}

}
