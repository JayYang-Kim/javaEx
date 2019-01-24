package ex1221;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : ���� Ŭ���� ����
 * */

// ����� ���� Ŭ���� �����
// Serial Version ID : �ش�Ǵ� ��ü�� ã������ ��ȣ
class MyException extends Exception { // Exception super class�� ��� ����

	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		super(msg); // super Ŭ������ �����ڸ� ȣ��
	}
}

class Ex11 {
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) throws MyException {
		if (num < 0) {
			throw new MyException("0���� ũ�ų� ���ƾ� �մϴ�.");
		}
		this.num = num;
	}
}

public class Exception_Ex11 {

	public static void main(String[] args) {
		Ex11 ee = new Ex11();
		
		try {
			ee.setNum(-10);
			
			System.out.println(ee.getNum());
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}
