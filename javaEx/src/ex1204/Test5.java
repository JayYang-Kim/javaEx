package ex1204;

/* ��¥ : 2018.12.04
 * ���� : �ּ�
 * ��Ÿ : /** �Է� �� enter, javadoc �ּ� ���� 
 * 		   javadoc -use ���ϸ�.java (javadoc �ּ��� HTML ��ȯ)  
 * 		   index.html ���� ����
 * */
public class Test5 {
	/**
	 * ���ڰ� ¦������ �Ǻ��ϴ� �޼ҵ�
	 * <p>
	 * ���ڸ� 2�� ������ �������� 0�̸� ¦��
	 * </p>
	 * @param num		¦������ �Ǻ��� �� <code>int</code>
	 * @return				¦�� ���θ� ��ȯ	<code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num%2 == 0;
	}
}