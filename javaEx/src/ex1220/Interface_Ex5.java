package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Interface
 * ��Ÿ : final, static 
 * */

// �������̽� ����
interface Ex5 {
	int A = 10; // public final static int A = 10; (����)
	
	public void print();
}

//�������̽� ����
class ExImpl5 implements Ex5 {

	@Override
	public void print() {
		System.out.println("print");
		
	}

}

public class Interface_Ex5 {
	
	public static void main(String[] args) {
		System.out.println(Ex5.A);
	}

}
