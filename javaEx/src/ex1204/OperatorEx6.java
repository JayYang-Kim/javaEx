package ex1204;

/* ��¥ : 2018.12.04
 * ���� : ���� ������
 * ��Ÿ : 
 * */
public class OperatorEx6 {
	public static void main(String[] args) {
		int a;
		
		a = 10; 
		// a = a + 1;
		++a;
		System.out.println(a); // �� : 11
		
		a = 10;
		a++;
		System.out.println(a); // �� : 11
		
		a = 10;
		a--;
		System.out.println(a); // �� : 9
		
		char c = 'A';
		
		// c = c + 1; // [������ ����]
		//c = (char)(c+1);
		c++;
		System.out.println(c); // B
	}
}
