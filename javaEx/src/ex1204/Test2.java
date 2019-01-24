package ex1204;

/* 날짜 : 2018.12.04
 * 내용 : 실수 자료형 테스트
 * 기타 : 문자 상수에 의한 ASCll 코드 값
 *		   'A' : 65, 'Z' : 90, 'a' : 97, 'z' : 122, '0' : 48, '9' : 57, [Enter] : 13 or 10 (2byte), [ESC] : 27, \n : 10
 * */
public class Test2 {

	public static void main(String[] args) {
		// 실수 관련 데이터 타입
		// float : 단정도형실수, double : 배정도형실수
		float f1 = 10; // 정수를 float 변수에 대입. 자동으로 10.0f로 변환되어 저장
		//float f2 = 0.5; // [컴파일 오류] 0.5는 배정도형 실수이므로 float에 대입 불가능
		float f2 = 0.5f;
		float f3 = 1.2e04f;
		float f4, f5;
		f4 = 'A'; // 65
		
		double d1 = 0.5;
		double d2 = 3.14d;
		double d3 = 1.2e04;
		
		//f5 = d1; // [컴파일 오류] 작은 자료형에 큰 자료형은 대입 불가능 (float < double)
		f5 = (float)d1; // 강제로 자료형 변환
		
		System.out.println("f1 : " + f1 + ", " + " f2 : " + f2 + ", " +  " f3 : " + f3 + ", " +  " f4 : " + f4 + ", " +  " f5 : " + f5);
		System.out.println("d1 : " + d1 + ", " +  " d2 : " + d2 + ", " +  " d3 : " + d3);
		
		f1 = 2000000000;
		f2 = 2000000050; // float는 정밀도가 낮아 2000000000로 저장됨 
		
		System.out.println("f1 : " + f1 + ", " +  " f2 : " + f2); // 결과 : f1 : 2.0e9, f2 : 2.0e9
		
		d1 = 2000000000;
		d2 = 2000000050; 
		
		System.out.println("d1 : " + d1 + ", " +  " d2 : " + d2);
	}

}
