package score1;

/* ��¥ : 2018.12.18
 * ���� : ������ ����� Class
 * ��Ÿ :  
 * */

public class Score {
	private ScoreVO[] list;
	
	public Score() {
		allocation(10);
	}
	
	protected void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity]; // ScoreVO �迭 10�� ����
		
		// list �迭�� null�� �ƴϰ�, ���� �ִٸ� �迭 ����ó��
		if (list != null && list.length > 0) {
			System.arraycopy(list, 0, temp, 0, list.length); // �迭 ���� list�� �迭�� temp�� ����
		}
		
		list = temp;
	}
	
	public int getSize() {
		if (list == null) {
			return 0;
		}
		return list.length;
	}
	
	// ScoreVO[] list�� private ������ �ܺο��� ���� �Ұ� getList�� ���� list�� �ּҰ��� �Ѱ���
	public ScoreVO[] getList() {
		return list;
	}
}
