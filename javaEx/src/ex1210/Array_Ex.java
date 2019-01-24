package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 
 * */
public class Array_Ex {

	public static void main(String[] args) {
		int []a; // 정수형 배열 선언
		a = new int[5]; // 메모리 할당, 5개의 정수형 변수 선언과 유사
		
		System.out.println("배열의 길이 : " + a.length);
		
		System.out.println(a[0]); // 0번째 인덱스의 값. 초기화 하지 않으면 정수형 변수는 0
		
		System.out.println(a); // 해당 배열의 위치를 찾기 위한 값
	}

}
