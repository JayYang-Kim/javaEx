package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : �Ǻ���ġ���� 1+1+2+3+5+8+13+21 ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * */
public class While_Test6 {

	public static void main(String[] args) {
		int a = 1, b = 1, c;
		int s=2;
		
		int n = 2;
		while(n < 8) {
			c = a + b; // 2 = 1 + 1
			s = s + c; // 4 = 2 + 2
			a = b; // 1 = 1
			b = c; // 2 = 2
			n++; // 3
		}
		
		System.out.println(s);
	}

}
