package ex1206;

/* 날짜 : 2018.12.06
 * 내용 : while 테스트
 * 기타 : 구구단을 2단에서 9단까지 실행 결과처럼 가로로 출력하는 프로그램을 작성하시오.
 * */
public class While_Test7 {

	public static void main(String[] args) {
		int dan, n;
		
		/*dan = 2;
		while (dan <= 9) {
			n = 0;
			while(n < 9) {
				n++;
				System.out.printf("%d * %d = %d\n", dan, n, dan * n);
			}
			System.out.println("==================================================");
			dan++;
		}*/
		
		n=0;
		while (n < 9) {
			n++;
			dan = 2;
			while(dan <= 9) {
				System.out.printf("%d * %d = %2d  ", dan, n, dan*n);
				dan++;
			}
			System.out.println();
		}
	}

}
