package ex1217;

/* ��¥ : 2018.12.17
 * ���� : Math Class
 * ��Ÿ : ���а� ���õ� �޼ҵ带 ����
 * */

public class Math_Ex {

	public static void main(String[] args) {
		double d;
		
		d = Math.PI;
		System.out.println(d);
		
		System.out.println(Math.sqrt(2)); // 2�� ������
		System.out.println(Math.pow(2, 10)); // 2�� 10��
		
		d = Math.sin(30.0 * Math.PI / 180); // ����
		System.out.println(d);
		
		d = Math.floor(12.77); // ����
		System.out.println(d);
	}

}
