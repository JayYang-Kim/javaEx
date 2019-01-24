package yangStudy.study181227;

public class Bank {
	private BankVO[] list;
	
	// ������ �߰�
	public Bank() {
		allocation(10); // �ʱ� �迭 �� 
	}
	
	protected void allocation(int capacity) {
		// �����ڿ��� ���ڸ� ȣ���� �� ��ŭ �迭 ����
		BankVO[] temp = new BankVO[capacity];
		
		// BankVO[] list null�� �ƴϰ�, ���� �ִٸ� �迭 ����ó��
		if (list != null && list.length > 0) {
			System.arraycopy(list, 0, temp, 0, list.length);
		}
		
		list = temp;
	}
	
	// list�� �� �ִ� �� ���� ��ȯ
	protected int getSize() {
		if (list == null) {
			return 0;
		}
		
		return list.length;
	}
	
	// BankVO[]�� �ּҰ� ��ȯ
	protected BankVO[] getList() {
		return list;
	}
}
