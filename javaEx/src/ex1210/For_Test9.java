package ex1210;

/* ��¥ : 2018.12.10
 * ���� : For�� �׽�Ʈ
 * ��Ÿ : 1~100���� ���� �Ҽ��� �� �ٿ� 10���� ����ϰ� �������� �Ҽ��� ������ ����ϴ� ���α׷�
 * */
public class For_Test9 {

	public static void main(String[] args) {
		int cnt = 0;
		boolean b;
		
		for(int i = 2; i <=100; i++) {
			b = false;
			
			for(int j = 2; j < i; j++) {
				// b = true�� ���, �Ҽ��� �ƴ�
				if(i % j ==0) {
					b = true;
					break;
				}
			}
			
			if(!b) {
				System.out.printf("%5d", i);
				cnt++;
				if(cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("\n���� : " + cnt);
	}

}
