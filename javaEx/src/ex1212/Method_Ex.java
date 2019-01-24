package ex1212;

/* ��¥ : 2018.12.12
 * ���� : �޼ҵ� (Method)
 * ��Ÿ : 
 * */

class Ex1 {
	// 1 ~ n���� ��
	public int sum(int n) { // n : �Ű�����, ��������
		int s = 0; // ��������
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		
		return s; // ��ȯ��
	}
	
	// n�� ¦���̸� true, Ȧ���̸�  false
	public boolean isEven(int n) {
		return n%2 == 0;
	}
	
	public void trangle(int n) {
		for (int i = 1; i <= n; i++) {
			// ����ó��
			for (int j = 1; j <= n - i; j ++) {
				System.out.print("  ");
			}
			
			// �� ���
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		return; // return�� ������ ȣ���Ѱ����� ���ư���, ���� Ÿ���� void�� ��쿡�� return�� ������ �� �ִ�.
	}
	
	// ���ڰ� �ҹ����� ��� �빮�ڷ� ��ȯ�ϴ� �޼ҵ�
	public char upper(char c) {
		return c >= 'a' && c <= 'z' ? (char)(c-32) : c;
	}
	
	// ���� : 95 ~ 100 4.5 , 90 ~ 94 4.0, 0 ~ 59 : 0
	public double grade(int s) {
		double a;
		if(s >= 95 && s <= 100) {
			a = 4.5;
		} else if (s >= 90 && s <= 94) {
			a = 4.0;
		} else if (s >= 85 && s <= 89) {
			a = 3.5;
		} else if (s >= 80 && s <= 84) {
			a = 3.0;
		} else if (s >= 75 && s <= 79) {
			a = 2.5;
		} else if (s >= 70 && s <= 74) {
			a = 2.0;
		} else if (s >= 65 && s <= 69) {
			a = 1.5;
		} else if (s >= 60 && s <= 64) {
			a = 1.0;
		} else {
			a = 0.0;
		}
		
		return a;
	}
	
	// ������ ���� ���� ���ϱ�, 90 ~ 100 : �� / 80 ~ 89 : �� ... 0 ~ 59 : ��
	public String hakjeom(int s) {
		String result;
		
		switch(s / 10) {
		case 10 :
		case 9 : result = "��"; break;
		case 8 : result = "��"; break;
		case 7 : result = "��"; break;
		case 6 : result = "��"; break;
		// s ����� ������ case���� ���� ��찡 �� �� �ֱ� ������ defaultó��
		default : result = "��"; break; 
		}
		
		return result;
		
		/*switch(s / 10) {
		case 9 : return "��";
		case 8 : return "��";
		case 7 : return "��";
		case 6 : return "��";
		// s ����� ������ case���� ���� ��찡 �� �� �ֱ� ������ defaultó��
		default : return "��"; 
		}*/
	}
	
	// �ش� ���� ������ ��� (��, ���� 1 ~ 9 ���̰� ���� �ƴϸ� �ƹ��͵� ������� �ʴ´�.)
	public void gugudan(int dan) {
		
		/*if (dan < 1 || dan > 9) {
			System.out.println("");
		} else {
			System.out.print(dan + "�� : \n");
			for(int i = 1; i <= 9; i++) {
				System.out.print(dan + " * " + i + " : " + dan * i);
				System.out.println();
			}
		}*/
		
		// 2)
		if (dan < 1 || dan > 9) {
			return;
		}
		
		System.out.print(dan + "�� : \n");
		for(int i = 1; i <= 9; i++) {
			System.out.print(dan + " * " + i + " : " + dan * i + "\n");
		}
		
		// return; // ���� Ÿ���� void�� ��� ���� ����
	}
}

public class Method_Ex {

	public static void main(String[] args) {
		Ex1 ee = new Ex1(); // ��ü ����
		
		int s;
		
		s = ee.sum(100);
		System.out.println(s); // ����
		
		s = ee.sum(20);
		System.out.println(s); // ����
		
		ee.sum(20); // ȣ���� ���������� ������� ���� �� ����. ������ �ƴ�
		
		System.out.println("10�� ¦���Դϱ� ? : " + ee.isEven(10)); // boolean
		
		ee.trangle(5); // void �޼ҵ� ȣ��
		
		// �ҹ��� -> �빮�ڷ� ��ȯ 
		// ��� 1)
		/*char a;
		
		a = ee.upper('c');
		System.out.println("�빮�ڴ� : " + ee.upper(a));*/

		// ��� 2)
		System.out.println("�빮�ڴ� : " + ee.upper('c'));
		
		// ���� ���
		int b = 59;
		double c;
		c = ee.grade(b);
		System.out.println("���� : " + c);
		
		// ���� ���
		b = 70;
		String result;
		result = ee.hakjeom(b);
		System.out.println("���� : " + result);
		
		// ������
		/*int d = 3;
		ee.gugudan(d);*/
		
		ee.gugudan(3);
	}
}
