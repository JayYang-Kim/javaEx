package ex1213;

/* ��¥ : 2018.12.12
 * ���� : Class > �ʵ� (Field)
 * ��Ÿ : 
 * */

class Ex1 {
	public void sub1 (int[] n) { // Call By Reference, �Ķ���Ͱ� �迭
		// main�޼ҵ忡�� ob.sub1(num) ���� �� int []n = new int[] {1,2,3,4,5}
		n[1] = 10; // 
		
		for (int a : n) {
			System.out.println(a + " ");
		}
		
		System.out.println();
	}
	
	public int[] random(int cnt) {
		int []n = new int[cnt];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random() * 100) + 1;
		}
		
		return n;
	}
}

public class Method_Ex {

	public static void main(String[] args) {
		int []num = {1,2,3,4,5};
		int []n = new int[] {1,2,3,4,5};
		
		System.out.println(n[0]);
		
		Ex1 ob = new Ex1(); // Ex1 Ŭ������ ��ü ���� (�޸� ����)
		ob.sub1(num); // sub1 �Ű������� []num�� �ּҰ��� �����ش�.
		
		System.out.println("main : " + num[1]); // [���] 10
		
		// Method radomȣ��
		/*int []aa = new int[5];
		aa = ob.random(5);*/
		
		int []aa = ob.random(5);
		
		System.out.print("random : ");
		for (int a : aa) {
			System.out.print(a + " ");
		}
		
		System.out.println();
	}

}
