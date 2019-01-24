package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Lambda
 * ��Ÿ : �͸� Ŭ����
 * */

@FunctionalInterface // Lambda�� ����ϱ� ���� �������̽����� ����
interface User13 {
	public void method();
}

class Demo13 {
	int x = 10;
	
	public void sub() {
		int y = 10;
		
		User13 u = () -> {
			System.out.println(this); // this�� �͸� ��ü�� �ƴ϶� ���ٽ��� ������ Ŭ������ �ǹ�
			System.out.println(x);
			System.out.println(y);
		};
		
		// y = 20; // �����ϸ� �ȵ�
		
		u.method();
	}
}

public class Lambda_Ex5 { 
	public static void main(String[] args) {	
		Demo13 o = new Demo13();
		o.sub();
	}
}
