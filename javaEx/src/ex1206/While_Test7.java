package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : �������� 2�ܿ��� 9�ܱ��� ���� ���ó�� ���η� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class While_Test7 {

	public static void main(String[] args) {
		int dan, n;
		
		/*dan = 2;
		while (dan <= 9) {
			n = 0;
			while(n < 9) {
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
			System.out.println("==================================================");
			dan++;
		}*/
		
		n=0;
		while (n < 9) {
			n++;
			dan = 2;
			while(dan <= 9) {
				System.out.printf("%d * %d = %2d  ", dan, n, dan*n);
				dan++;
			}
			System.out.println();
		}
	}

}
