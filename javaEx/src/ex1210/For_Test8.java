package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 1-2+3-4+5- ~ +9-10 = 결과를 출력하는 프로그램
 * */
public class For_Test8 {

	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			// 짝수는 - / 출력은 결과 뒤에 +
			if(i % 2 == 0) {
				s -= i;
				
				// 10일경우는 끝에 = 붙이기
				if(i == 10) {
					System.out.println(i + " = ");
				} else {
					System.out.println(i + " + ");
				}
			// 홀수는 + / 출력은 결과 뒤에 -
			} else { 
				s += i;
				System.out.println(i + " - ");
			}
		}
		
		// 결과값 출력
		System.out.println(s);
	}

}
