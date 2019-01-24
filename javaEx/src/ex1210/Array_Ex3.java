package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 
 * */
public class Array_Ex3 {

	public static void main(String[] args) {
		int []a = new int[5]; // 정수형 배열 선언과 메모리 할당을 동시에
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (i+1) * 2;
		}
		
		// 1)
		/*for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		
		// 2) n변수는 for영역 안에서만 사용가능
		for (int n : a) { // 향상된 for문 (JDK5.0)
			System.out.println(n);
		}
		
	}

}
