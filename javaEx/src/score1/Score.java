package score1;

/* 날짜 : 2018.12.18
 * 내용 : 데이터 저장용 Class
 * 기타 :  
 * */

public class Score {
	private ScoreVO[] list;
	
	public Score() {
		allocation(10);
	}
	
	protected void allocation(int capacity) {
		ScoreVO[] temp = new ScoreVO[capacity]; // ScoreVO 배열 10개 생성
		
		// list 배열이 null이 아니고, 값이 있다면 배열 복사처리
		if (list != null && list.length > 0) {
			System.arraycopy(list, 0, temp, 0, list.length); // 배열 복사 list의 배열을 temp에 복사
		}
		
		list = temp;
	}
	
	public int getSize() {
		if (list == null) {
			return 0;
		}
		return list.length;
	}
	
	// ScoreVO[] list는 private 변수라서 외부에서 접근 불가 getList를 통해 list의 주소값을 넘겨줌
	public ScoreVO[] getList() {
		return list;
	}
}
