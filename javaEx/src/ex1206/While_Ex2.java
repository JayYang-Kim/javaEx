package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : 
 * */
public class While_Ex2 {

	public static void main(String[] args) {
		/*int a = 0;
		
		// 1 ~ 100���� 10���� ���
		while (++a <= 100) {
			System.out.print(a + "\t");
			if(a % 10 == 0) {
				System.out.println();
			}
		}*/
		
		// A ~ Z���� 10���� ���
		/*char b = 'A';
		while(b <= 'Z' ) {
			System.out.println(b + "\t");
			b++;
			if((b-65) % 10 == 0) {
				System.out.println();
			}
		}*/

		// A ~ Z���� 10���� ���
		char c = 'A';
		int n = 0;
		
		while (n < 26) {
			System.out.print(c + "\t");
			n++;
			c++;
			if(n % 10 == 0) {
				System.out.println();
			}
		}
		
	}

}