package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : 1 ~ 100���� ���� 3 �Ǵ� 5�� ��� �հ� ����� ���ϴ� ���α׷�
 * */
public class While_Test2 {

	public static void main(String[] args) {
		int a, b, c;
		a=b=c=0;
		
		while (a < 100) {
			a++;
			if(a % 3 == 0 || a % 5 == 0) {
				b += a; // 3, 5�� ��� ��
				c++; // 3, 5�� ��� ī��Ʈ
			} else {
				
			}
			
		}
		
		System.out.println("�� : " + b);
		System.out.println("��� : " + (b / c));
	}

}
