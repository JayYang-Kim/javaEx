package ex1203;

/* ��¥ : 2018.12.03
 * ���� : print �׽�Ʈ
 * ��Ÿ : �̸����� (class���� > ��Ŭ�� > Refactor > Rename)
 * */
public class PrintEx {
	
	public static void main(String[] args) {
		System.out.print("Java");
		System.out.print("Web");
		System.out.print("Html5\n");
		System.out.print("CSS3");
		System.out.print("Spring");
		
		//System.out.print(); // [������ ����] print() �޼ҵ�� �ݵ�� �ϳ��� �μ��� �������Ѵ�.
		
		System.out.println(); // ���� �ѱ�, System.out.print("\n"); (����)
		System.out.println("�ڹ�");
		System.out.println("��");
		System.out.println("������");
		
		System.out.println("A\tB\tC\t\\"); // \t �ǰ� ���� ��� ex) A	B	C \
		
		System.out.println("�ڹ�" + 8); // ���ڿ��� �ٸ� ���ڰ� �������� ���ڿ��� �ν�
	}
	
}