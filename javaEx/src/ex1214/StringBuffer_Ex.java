package ex1214;

/* ��¥ : 2018.12.14
 * ���� : StringBuffer / StringBuilder
 * ��Ÿ : �������� ���ڿ��� ó���Ҷ� String���� ����
 *      [StringBuilder]
 *      - ����ȭ �������� ����
 *      [StringBuffer]
 *      - StringBuilder���� ����
 *      - ����ȭ ����
 * */

public class StringBuffer_Ex {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("korea");
		
		// �뷮 �˾ƺ���
		System.out.println("�⺻ ���� ũ�� : " + sb1.capacity()); // [���] 16
		
		sb1.append("korea"); // ���ڿ� �߰�
		
		System.out.println(sb1);
		System.out.println(sb2);

		System.out.println(sb1 == sb2); // [���] false / �ּ� ��
		System.out.println(sb1.equals(sb2)); // [���] false / �ּ� ��
		
		// String���� ��ȯ
		String s = sb1.toString();
		System.out.println(s);
		
		// equals �� �񱳴� String�� ����
		// toString() ���ڿ��� ��ȯ
		System.out.println(sb1.toString().equals(sb2.toString())); // [���] true / �� ��
		
		// ���ڿ� �߰�
		sb1.append("�ѱ�");
		sb1.append("�̸�");
		sb1.append("����");
		sb1.append("����");
		sb1.append("abc");
		sb1.append("ABC");
		sb1.append("!@#");
		sb1.append("789456");
		sb1.append("<>?:");
		
		// �뷮 �˾ƺ���
		System.out.println("���� ũ�� : " + sb1.capacity());
		
		// ���ڿ� ����
		System.out.println("���ڿ� ���� : " + sb1.length());
		
		System.out.println(sb1);
		
		// ���ڿ� ����
		sb1.insert(0, "�̰���"); // �� ù���� �տ� �߰�
		System.out.println(sb1);
		
		sb1.insert(sb1.indexOf("�ѱ�") + "�ѱ�".length(), "web"); // �ѱ� ã�Ƽ� �ѱ� ������ web���ڿ� �߰�
		System.out.println(sb1);
		
		// ���ڿ� ����
		sb1.delete(sb1.indexOf("�̸�"), sb1.indexOf("�̸�") + "�̸�".length()); // �̸� ���ڿ� ã�Ƽ� ���� �����
		System.out.println(sb1);
		
		sb1.delete(0, sb1.length());
		System.out.println("��� : " + sb1);
		
		sb1.append("seoul");
		System.out.println(sb1.capacity()); // sb1�� �뷮 �˾ƺ���
		
		// ���ڿ� ���̷� ������ ũ�⸦ ����
		sb1.trimToSize(); 
		System.out.println(sb1.capacity());
	}

}
