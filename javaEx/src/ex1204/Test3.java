package ex1204;

/* ��¥ : 2018.12.04
 * ���� : ���� �ڷ��� �׽�Ʈ
 * ��Ÿ : 
 * */
public class Test3 {

	public static void main(String[] args) {
		char c1;
		char c2 = 'A', c3 = '��';
		int a;
		
		c1 = '\u0041';
		System.out.println("c1 : " + c1 + " c2: " + c2 + " c3 : " + c3);
		
		c1 = '\101'; // 8������ ǥ���ϴ� �����ڵ�
		System.out.println(c1);
		
		a = '��';
		System.out.println(a); // ��ǻ�Ϳ� ����Ǵ� ������ �� (45824)
		
		//c1 = a; // [������ ����]
		c1 = (char)a;
		System.out.println(c1);
		
		c1 = 45824;
		System.out.println(c1);
		
		//c1 = "A"; // [������ ����] ���ڿ��� char�� ���� �Ұ�
	
		c1 = 0x41; // c1 = 65; c1 = '\u0041'; c1 = 'A';
		System.out.println(c1);
	}

}
