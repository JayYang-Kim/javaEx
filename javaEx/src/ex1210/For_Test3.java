package ex1210;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : �� ���� �ֻ����� ���� �� �ֻ��� ���� ���� 9�� �Ǵ� ��츦 ��� ����ϴ� ���α׷�
 * */
public class For_Test3 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			
			for(int j = 1; j <= 6; j++) {
				
				if (i + j == 9) {
					System.out.println(i + " , " + j);
				}
				
			}
			
		}
	}

}
