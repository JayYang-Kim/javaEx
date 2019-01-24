package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : Array(배열) 테스트
 * 기타 : 
 * */
public class Array_Ex5 {

	public static void main(String[] args) {
		int []a = new int[3]; // 정수형 배열 선언과 메모리 할당을 동시에
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int []b = a; // a와 b 참조변수가 하나의 배열의 공유
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[n]);
		}
		System.out.println("--------------------------------------------------");
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("b[%d] = %d\n", n, b[n]);
		}
		System.out.println("--------------------------------------------------");
		
		b[1] = 50;

		for(int n = 0; n < a.length; n++) {
			System.out.printf("a[%d] = %d\n", n, a[n]);
		}
		System.out.println("--------------------------------------------------");
		
		for(int n = 0; n < a.length; n++) {
			System.out.printf("b[%d] = %d\n", n, b[n]);
		}
		System.out.println("--------------------------------------------------");	
	}

}
