package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : 1+2+n ������ ���� 100�� �Ѵ� �ּ��� n�� �׋��� ���� ������ ����ϴ� ���α׷�
 * */
public class While_Test3 {

	public static void main(String[] args) {
		int a, b;
		
		/*a=b=0;
		
		while (b <= 100) {
			a++;
			b += a;
		}
		
		System.out.println(a + " , " + b);*/
		
		a=b=0;
		
		/*while (true) {
			a++;
			b += a;
		}
		
		System.out.println(a + " , " + b);*/ // while���� ���ѷ����� �ɷ� �ش� ������ ������ �� ��� ������ �߻�
		
		while (true) {
			a++;
			b += a;
			if(b > 100) {
				break;
			}
		}
		
		System.out.println(a + " , " + b);
	}

}
