package yangStudy.study190110;

public interface Bank {
	public void newAccount(); // ���»���
	public void deposit(); // �Ա�
	public void withdraw(); // ���
	public void remit(); // �۱�
	public void selectAccount(); // ���� Ȯ��
	public void update(); // ��������
	public void delete(); // ���� ����
	public void login(); // �α���
	public void logout(); // �α׾ƿ�
	
	public BankVO loginCheck();
	public String loginKey();
}
