package ex1212;

/* ��¥ : 2018.12.12
 * ���� : System.arraycopy �޼ҵ�
 * ��Ÿ : 
 * */
public class Arg_Ex {

	public static void main(String[] args) {
		// test1)
		/*int []a = {10, 20, 30};
		int []b = a; // �ϳ��� �濡 a, b ���� (a�� b ���߿� �ϳ��� ���� �ٲ�� �Ѵ� �ٲ�)
		
		System.out.println(a==b); // (ture) [�ּҺ�] a�� b�� ������ ��ġ�� ����
		
		b[1] = 300; // a[1], b[1] = 300
		
		System.out.println(a[1] + " , " + b[1]);
		
		int []c = new int[a.length]; // new int[3] (����)
		
		// a�迭�� ���� c�迭�� ����
		// method(�����迭, ������ ������ ��ġ, �����Ұ�(�迭), �����Ұ��� ��ġ, ������ ����)
		System.arraycopy(a, 0, c, 0, a.length);
		
		System.out.println(a[0] + " , " + c[0]); // [���] 10 : 10
		System.out.println(a==c); // false (a, c�� �ּҰ��� �ٸ��� ������)
		
		c[1] = 20;
		
		System.out.println(a[1] + " , " + c[1]); // [���] 300 : 20*/
		
		// test2)
		// 2���� �迭���� arraycopy�� �� ���, ����� �ּҰ� ����Ǿ ������ ���� ���� ����� ���� ���� ���� �ٲ��.
		/*int [][] a = new int[][] {{1, 2, 3},{4, 5, 6}};
		int [][] b = new int[a.length][a[0].length];
		
		System.arraycopy(a, 0, b, 0, b.length);
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [���] 5 : 5
		
		b[1][1] = 300;
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [���] 300 : 300*/	
		
		
		// test3)
		int [][] a = new int[][] {{1, 2, 3},{4, 5, 6}};
		int [][] b = new int[a.length][a[0].length];
		
		System.arraycopy(a, 0, b, 0, b.length); // �ּҸ� ����
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [���] 5 : 5
		
		b[1][1] = 300;
		
		System.out.println(a[1][1] + " : " + b[1][1]); // [���] 300 : 300
		
		int [][] c = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(a[i], 0, c[i], 0, c[i].length); // �� ����
		}
		
		c[1][1] = 50;
		
		System.out.println(a[1][1] + " : " + c[1][1]); // [���] 300 : 50
	}

}
