package ex1221;

import java.io.IOException;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : throw ���������� ó��
 * */

class Ex7 {
	private int value;
	
	public void set(int value) throws Exception { // throws Exception : ���ܸ� ���
		if (value < 0) {
			throw new Exception("0���� ũ�ų� ���ƾ��մϴ�.");
		}
		
		this.value = value;
	}
	
	public int get() {
		return value;
	}
}

public class Exception_Ex7 {

	public static void main(String[] args) throws IOException {
		Ex7 e = new Ex7();
		
		try {
			e.set(-10);
			System.out.println(e.get());
		} catch (Exception e1) {
			//System.out.println(e1.toString());
			//System.out.println(e1.getMessage());
			e1.printStackTrace();
		}
	}

}
