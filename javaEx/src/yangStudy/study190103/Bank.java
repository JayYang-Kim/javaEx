package yangStudy.study190103;

public interface Bank {
	public void newAccount(); // ���»���
	public void deposit(); // �Ա�
	public void withdraw(); // ���
	public void remit(); // �۱�
	public void selectAccount(); // ���� Ȯ��
	public void delete(); // ���� ����
	public void login(); // �α���
	public void logout(); // �α׾ƿ�
	
	public BankVO loginCheck(); // �α��� ���� 
}
