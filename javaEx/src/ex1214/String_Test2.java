package ex1214;

/* ��¥ : 2018.12.14
 * ���� : �ڹ��� �⺻ API Ŭ���� - (string)
 * ��Ÿ : 
 * */

public class String_Test2 {

	public static void main(String[] args) {
		// 369����. 1 ~ 100���� ���� ���ٿ� 10���� ��� �ϵ� 369�ڸ��� *�� ���
		// ���� ��� 13�� *, 33�� **
		String s;
		
		for (int i = 1; i <= 100; i++) {
			// ������ ���ڷ� �ٲ� �� 3,6,9�� ã�Ƽ� ���� ��ȯ
			s = Integer.toString(i).replaceAll("3|6|9", "*"); // 31 => *1
			
			// *�� ��ġã�� (���ʿ���)
			if (s.indexOf("*") != -1) { // ���� ���
				s = s.replaceAll("\\d", ""); // ���ڸ� �������� ��ȯ
			}
			
			System.out.print(s + "\t");
			
			// 10���� ���
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

}
