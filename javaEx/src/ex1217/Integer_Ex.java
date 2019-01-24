package ex1217;

/* ��¥ : 2018.12.17
 * ���� : Wrapper Class
 * ��Ÿ : 
 * */

class Ex1 {
	Integer a; // ��ü null�� �ʱ�ȭ
	int b; // �⺻ �ڷ��� 0�� �ʱ�ȭ
	
	public int sub1() {
		return a + 10;
	}
	
	public int sub2() {
		return b + 10;
	}
}

public class Integer_Ex {

	public static void main(String[] args) {
		Ex1 ob = new Ex1();
		
		//System.out.println(ob.sub1()); // [��Ÿ�� ����]
		ob.a = 0;
		System.out.println(ob.sub1()); // [���] 10
		System.out.println(ob.sub2()); // [���] 10
		
		System.out.println(Integer.MAX_VALUE); // int ������ ǥ���� �� �ִ� �ִ� ��
		System.out.println(Integer.MIN_VALUE); // int ������ ǥ���� �� �ִ� �ּ� ��
		
		int n;
		String s;
		
		s = "123";
		n = Integer.parseInt(s); // ���ڿ��� int������ ��ȯ
		System.out.println(n);
		
		//s = "123.5";
		//n = Integer.parseInt(s); // [��Ÿ�� ����] NumberFormatException
		
		//n = Integer.parseInt("1, 123"); // [��Ÿ�� ����] NumberFormatException
		
		System.out.println(Integer.parseInt("101")); // ���ڿ��� ���ڷ� ����
		System.out.println(Integer.parseInt("101", 2)); // [���] 5 (2����)
		
		//System.out.println(Integer.parseInt("a01")); // [��Ÿ�� ����] NumberFormatException
		System.out.println(Integer.parseInt("a01", 16)); // [���] 5 (16����)
		
		n = 245;
		s = Integer.toString(n); // ���ڸ� ���ڿ��� ��ȯ
		
		s = Integer.toBinaryString(123);
		System.out.println(s);
		
		double d;
		d = Double.parseDouble("123.5"); // ���ڿ��� double������ ��ȯ
		System.out.println(d);
		
	}

}
