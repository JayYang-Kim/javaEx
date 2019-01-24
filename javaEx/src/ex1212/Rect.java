package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : Class 접근 권한 테스트
 * 기타 : 1) 생략한 경우 (디폴트) : 동일한 패키지에 있는 클래스에서만 객체를 생성 가능
 *      2) public : 제약 없이 어디에서나 객체를 생성 가능
 *      3) 
 * */

//Rect class(틀) 생성 
//파일 하나당 하나의 클래스 작성
public class Rect { // public(접근 권한) class(클래스 키워드) Rect(클래스 이름)
	// 필드  - 데이터 정보 저장
	int width;
	int height;
	
	// 메소드 (Method) - 기능
	// 모든 메소드는 한가지의 기능만 작성
	public int area() {
		// 넓이 구하기 - 가로 * 세로
		return width * height;
	}
	
	public int len() {
		// 넓이 구하기 - (가로 + 세로) * 2
		return (width + height) * 2;
	}
}