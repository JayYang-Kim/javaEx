package ex1213;

/* ��¥ : 2018.12.12
 * ���� : this �׽�Ʈ
 * ��Ÿ : ȣ���ϴ� ��ü �ڱ� �ڽ��� ��Ÿ��
 * */

class Test4 {
	private String name;
	private int age;
	
	public Test4() {
		
	}
	
	public Test4(String name, int a) {
		this.name = name; // this�� �����ϸ� �ٸ� ���
		age = a; // ����
		// this.age = a;
	}
	
	public void write() {
		// name = this.name + " : " + this.age
		// this = ȣ���ϴ� ��ü �ڱ� �ڽ��� ��Ÿ��
		System.out.println(name + " : " + age);
		//System.out.println(this.name + " : " + this.age); // this�� ���� ����
	}
}

public class This_Ex {

	public static void main(String[] args) {
		Test4 t1 = new Test4("���ڹ�", 10);
		Test4 t2 = new Test4("���ڹ�", 15);
		
		t1.write(); // [���] ���ڹ� : 10
		t2.write(); // [���] ���ڹ�: 15
	}

}
