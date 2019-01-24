package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 
 * */
public class Array_Ex4 {

	public static void main(String[] args) {
		int []a = new int[3]; // 정수형 배열 선언과 메모리 할당을 동시에
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[n]);
		}
		
		System.out.println("====================");
		
		a = new int[5]; // 배열의 크기를 변경하면 이전 배열은 가비지 컬렉터 (garbage collector)의 대상이 된다.
						// garbage collector가 낭비하는 메모리 처리를 언제하는지는 알수없다.
		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[0]);
		}
		
		System.out.println();
	}

}
