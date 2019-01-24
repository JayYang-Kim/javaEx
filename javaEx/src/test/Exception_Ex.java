package test;

import java.util.Scanner;

// Checked Exception �߻�
class test1 {
	private Scanner sc = new Scanner(System.in);
	int a, b;
	int c;
	
	public void division() throws Exception {
		System.out.println("�� ������ �Է����ּ���.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b == 0) {
			throw new Exception("0�� ������ �����ϴ�."); // checked exception �߻�
		}
		
		int c = a / b;
		
		this.c = c;
	}
}

// Unchecked Exception �߻�
class test2 {
	private Scanner sc = new Scanner(System.in);
	int a, b;
	int c;
	
	public void division() {
		System.out.println("�� ������ �Է����ּ���.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (b == 0) {
			throw new RuntimeException("0�� ������ �����ϴ�."); // Runtime exception �߻�
		}
		
		int c = a / b;
		
		this.c = c;
	}
}

public class Exception_Ex {
	
	public static void main(String[] args) {
		test1 t = new test1();
		test2 t2 = new test2();
		
		//t.division(); // [������ ����] test1 Ŭ������ division() �޼ҵ带 ȣ���� ���, checked exception �߻��Ͽ� ����ó�� �ϵ��� ����
		/*try {
			t.division();
			System.out.println(t.c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}*/
		
		try {
			t2.division();
			System.out.println(t2.c);
		} catch (RuntimeException e) {
			System.out.println(e.toString());
		}
		
		System.out.println("����");
	}
	
}
