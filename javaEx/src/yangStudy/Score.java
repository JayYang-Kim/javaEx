package yangStudy;

/* 날짜 : 2018.12.19
 * 내용 : 학번, 이름, 점수(국어, 영어, 수학), 총점, 평균의 데이터를 저장
 * 기타 :
 * 관련 class : ScoreApp, ScoreService, ScoreVO   
 * */

public class Score {
	private ScoreVO[] list; // ScoreVO a1, a2, a3 ....;
	
	// 객체 생성 시 생성자 초기화
	public Score() {
		allocation(5); // allocation 메소드에 인자를 담아 호출
	}
	
	// Sub 클래스에서 배열 크기를 증가값을 받기 위해 protected 접근 제어자를 사용
	protected void allocation(int capacity) { // 생성자에서 배열 개수 초기화한 값을 받음
		ScoreVO[] temp = new ScoreVO[capacity]; // 생성자에서 값을 받은 만큼 배열 생성
		
		// list에 값이 들어있을 경우 배열 복사처리
		if (list != null && list.length > 0) {
			System.arraycopy(list, 0, temp, 0, list.length);
		}
		
		list = temp;
	}
	
	// list의 길이 구하기
	public int getSize() {
		if (list == null) {
			return 0;
		}
		
		return list.length;
	}
	
	// getList() 호출하면 ScoreVO[] 객체를 리턴해주고 list의 주소값을 전달해준다.
	public ScoreVO[] getList() {
		return list;
	}
}
