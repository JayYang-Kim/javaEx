package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 주석
 * 기타 : /** 입력 후 enter, javadoc 주석 생성 
 * 		   javadoc -use 파일명.java (javadoc 주석을 HTML 변환)  
 * 		   index.html 파일 실행
 * */
public class Test5 {
	/**
	 * 숫자가 짝수인지 판별하는 메소드
	 * <p>
	 * 숫자를 2로 나누어 나머지가 0이면 짝수
	 * </p>
	 * @param num		짝수인지 판별할 수 <code>int</code>
	 * @return				짝수 여부를 반환	<code>boolean</code>
	 */
	public boolean isEven(int num) {
		return num%2 == 0;
	}
}