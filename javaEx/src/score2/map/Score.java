package score2.map;

/* 날짜 : 2018.12.26
 * 내용 : Score Interface 
 * 기타 : 기능 구현 설계
 * */

public interface Score {
	public void input(); // 입력
	public void print(); // 출력
	public void searchName(); // 이름 검색
	public void searchHak(); // 학번 검색
	public void update(); // 수정
	public void delete(); // 삭제
}
