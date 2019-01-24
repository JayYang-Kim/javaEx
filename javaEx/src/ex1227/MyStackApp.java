package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Stack ���� 
 * ��Ÿ : App
 *      ������ stack�� ũ�⸦ ���Ͽ� �� ũ�⸸ŭ�� �Է��� �� �ֵ��� ���α׷� �ۼ�
 * */

public class MyStackApp {

	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStackImpl<>(10); // ���ڰ��� �Է��Ͽ� �迭 �ʱⰪ �Է�
		 
		ms.push(20);
		ms.push(10);
		ms.push(30);
		ms.push(50);
		
		while (!ms.isEmpty()) {
			int n = ms.pop();
			
			System.out.println(n);
		}
	}

}
