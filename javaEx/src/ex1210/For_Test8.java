package ex1210;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : 1-2+3-4+5- ~ +9-10 = ����� ����ϴ� ���α׷�
 * */
public class For_Test8 {

	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			// ¦���� - / ����� ��� �ڿ� +
			if(i % 2 == 0) {
				s -= i;
				
				// 10�ϰ��� ���� = ���̱�
				if(i == 10) {
					System.out.println(i + " = ");
				} else {
					System.out.println(i + " + ");
				}
			// Ȧ���� + / ����� ��� �ڿ� -
			} else { 
				s += i;
				System.out.println(i + " - ");
			}
		}
		
		// ����� ���
		System.out.println(s);
	}

}
