package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ :  
 * */
public class While_Test {

	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		
		while (a < 10) {
			a++;
			
			if(a % 2 == 0) { // ¦�� üũ 
				b -= a; // ¦���� ���, "-" 
			} else { // Ȧ�� üũ ((n&1)==1)
				b += a; // ¦���� �ƴ� ���, "+" 
			}
		}
		
		/*while (a < 10) {
			a++;
			a += b; // ù��°�� ���Ѵ�
			
			a++;
			a -= b; // �ι�°�� ����
		}*/
		
		System.out.println(b);
	}

}
