package ex1207;

/* ��¥ : 2018.12.07
 * ���� : while / do ~ while�� ����
 * ��Ÿ : 
 * */
public class While_Test {

	public static void main(String[] args) {
		int s, n;
		
		s = 0;
		n = 0;
		
		while (s < 100) { // ���� 100�̻��̱� ������ ������ ��
			n++;
			s = (n % 2 == 0) ? -n : +n;
			//s = (n % 2 == 1) ? +n : -n;
		}
		
		System.out.println(n + " , " + s);
	}

}
