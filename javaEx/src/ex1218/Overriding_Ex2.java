package ex1218;

/* ��¥ : 2018.12.18
 * ���� : �޼ҵ� �������̵�(Method Overriding)
 * ��Ÿ : Ŭ������ ����ȯ�� ���� ����
 *      Ŭ�������� ����ȯ�� ���ϰ��迡���� �����ϴ�.
 *      �� ĳ���� (���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�� ����Ű�� ��)�� ������ ����
 *      �ٿ� ĳ���� (���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�� ��ȯ�ϴ°�)�� �� ĳ�����Ѱ͸� �����ϰ� �ݵ�� ��������� ĳ������ �ؾ� �Ѵ�. 
 * */

class Test7 {
	int a = 10;
	int b = 20;
	
	public void write() {
		System.out.println(a + " : " + b);
	}
	
	public void disp() {
		System.out.println("��� : " + a + " , " + b);
	}
}

class Sample7 extends Test7 {
	int b = 100;
	int c = 200;
	
	// �������̵�
	@Override
	public void write() {
		System.out.println(a + " : " + b + " : "+ c);
	}
	
	public void method() {
		super.write();
		System.out.println(super.b);
	}
}

public class Overriding_Ex2 {

	public static void main(String[] args) {
		Sample7 ob = new Sample7();
		Test7 tt = new Test7();
		System.out.println(ob.a);
		
		// Up casting / ������ ���� / casting ���� �ʾƵ� ��
		Test7 ts = ob;
		
		// Down casting / �ٿ� ĳ������ ��ĳ���� �Ѱ͸� ����
		// �ٿ� ĳ������ ��������� ĳ������ �ؾ���
		//Sample7 st = tt; // [������ ����]
		
		System.out.println(ts.b); // [���] 20 / �θ�(Test7)�� b
		                          // ��ĳ���� �Ǿ �ʵ�� �ڽ��� �켱������ ����
		//System.out.println(ts.c); // [������ ����]
		
		ts.write(); // �ڽ�(Sample7)��  write() ȣ��
		            // �޼ҵ尡 �����ǵǸ� ���� Ŭ������ �޼ҵ�� ��������.
		
		tt.write(); // �ڽ��� �޼ҵ�
		
		//Sample7 s = ts; [������ ����]
		Sample7 s = (Sample7)ts;
		System.out.println(s.c);
		
		Sample7 s2 = (Sample7)tt; // [��Ÿ�� ����] / ��ĳ�����Ѱ͸� �ٿ� ����
		s2.write();
	}

}
