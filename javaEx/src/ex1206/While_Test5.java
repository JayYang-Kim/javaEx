package ex1206;

/* ��¥ : 2018.12.06
 * ���� : while �׽�Ʈ
 * ��Ÿ : ����7)
 * */
public class While_Test5 {

	public static void main(String[] args) {
		int x, y, s;

		x = 100;
		y = 0;
		s = 0;
		
		while (x >= y) { 
			s++; // �ʸ� ����
			x+=2; 
			y+=5;
		}
		
		System.out.println("x :" + x + " , y : " + y);
		System.out.println("�ɸ��ð� : " + s + "��");
	}

}
