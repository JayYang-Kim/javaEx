package yangStudy;

/* ��¥ : 2018.12.19
 * ���� : �й�, �̸�, ����(����, ����, ����), ����, ����� �����͸� ����
 * ��Ÿ :
 * ���� class : ScoreApp, ScoreService, ScoreVO   
 * */

public class Score {
	private ScoreVO[] list; // ScoreVO a1, a2, a3 ....;
	
	// ��ü ���� �� ������ �ʱ�ȭ
	public Score() {
		allocation(5); // allocation �޼ҵ忡 ���ڸ� ��� ȣ��
	}
	
	// Sub Ŭ�������� �迭 ũ�⸦ �������� �ޱ� ���� protected ���� �����ڸ� ���
	protected void allocation(int capacity) { // �����ڿ��� �迭 ���� �ʱ�ȭ�� ���� ����
		ScoreVO[] temp = new ScoreVO[capacity]; // �����ڿ��� ���� ���� ��ŭ �迭 ����
		
		// list�� ���� ������� ��� �迭 ����ó��
		if (list != null && list.length > 0) {
			System.arraycopy(list, 0, temp, 0, list.length);
		}
		
		list = temp;
	}
	
	// list�� ���� ���ϱ�
	public int getSize() {
		if (list == null) {
			return 0;
		}
		
		return list.length;
	}
	
	// getList() ȣ���ϸ� ScoreVO[] ��ü�� �������ְ� list�� �ּҰ��� �������ش�.
	public ScoreVO[] getList() {
		return list;
	}
}
