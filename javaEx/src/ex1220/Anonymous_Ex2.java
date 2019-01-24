package ex1220;

/* ��¥ : 2018.12.20
 * ���� : Inner class (���� Ŭ����)
 * ��Ÿ : �͸� Ŭ���� (Anonymous class) 
 * */

class Button {
	// ��ø(����) �������̽�
	// Listener : �̺�Ʈ�� �߻������� �̺�Ʈ�� ó��
	public interface OnclickListener {
		public void onClick();
	}
}

public class Anonymous_Ex2 {

	public static void main(String[] args) {
		Button.OnclickListener ob = new Button.OnclickListener() {
			
			@Override
			public void onClick() {
				System.out.println("���Ϸ��� ����");
			}
			
		};
		
		ob.onClick();
	}

}
