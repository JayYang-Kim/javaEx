package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : throw ���������� ó��
 *      checked ����
 * */

class Ex9 {
	private int num;
	
	public void setNum(int num) throws Exception { // checked ����
		// ���� üũ
		if (num < 0) {
			throw new Exception("0���� ũ�ų� ���ƾ� �մϴ�."); // ������ ��� ���ܸ� ���� (���� ������ ���� �� ���� ����)
		}
		this.num = num; // ���� �ȵ�
	}
	
	public int getNum() {
		return num;
	}
	
	public void set(int n) throws Exception {
		try {
			setNum(n);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			
			throw e; // ���ܸ� �ٽ� ������.
		}
	}
}

public class Exception_Ex9 {

	public static void main(String[] args) {
		Ex9 e = new Ex9();
		
		try {
			e.set(-10);
			System.out.println(e.getNum());
		} catch (Exception e1) {
			//e1.printStackTrace();
			System.out.println(e1.toString());
		}
	}

}
