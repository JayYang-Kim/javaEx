package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Lambda
 * ��Ÿ : �͸� Ŭ����
 * */

interface Demo9 {
	public void print();
}

public class Lambda_Ex { // Lambda_Ex$
	public static void main(String[] args) {
		Demo9 dd = new Demo9() {

			@Override
			public void print() {
				System.out.println("�͸� Ŭ����");
				
			}
			
		};
		
		dd.print();
	}
}
