package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : unchecked ����
 * */

class Ex10 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (num < 0) {
			throw new RuntimeException("������ �Է��� �Ұ����մϴ�."); // unchecked ���� �߻�
		}
		
		this.num = num;
	}
}

public class Exception_Ex10 {

	public static void main(String[] args) {
		Ex10 ee = new Ex10();
		
		try {
			ee.setNum(-5);
			System.out.println(ee.getNum());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("����");
	}

}
