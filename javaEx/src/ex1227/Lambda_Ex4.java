package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Lambda
 * ��Ÿ : �͸� Ŭ����
 * */

@FunctionalInterface // Lambda�� ����ϱ� ���� �������̽����� ����
interface User12 {
	public int add(int a, int b);
}

public class Lambda_Ex4 { 
	public static void main(String[] args) {	
		//User12 u = (a, b) -> {int c = a + b; return c;};
		//User12 u = (a, b) -> {return a + b;};	
		User12 u = (a, b) -> a + b;
		
		System.out.println(u.add(10, 5));
	}
}
