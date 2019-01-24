package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 
 * */
public class Array_Ex2 {

	public static void main(String[] args) {
		int []a = new int[5]; // 정수형 배열 선언과 메모리 할당을 동시에
		
		// 배열의 각 요소 접근하여 상수 대입
		a[0] = 2;
		a[1] = 4;
		a[3] = 6;
		
		//a[5] = 10; // [런타임 오류] 배열의 첨자 위치를 벗어남 (ArrayIndexOutOfBoundsException)
		
		for(int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] = %d\n", i, a[i]);
		}
		
		System.out.println();
	}

}
