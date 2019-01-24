package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 1~100까지 수중 소수를 한 줄에 10개씩 출력하고 마지막에 소수의 개수를 출력하는 프로그램
 * */
public class For_Test9 {

	public static void main(String[] args) {
		int cnt = 0;
		boolean b;
		
		for(int i = 2; i <=100; i++) {
			b = false;
			
			for(int j = 2; j < i; j++) {
				// b = true일 경우, 소수가 아님
				if(i % j ==0) {
					b = true;
					break;
				}
			}
			
			if(!b) {
				System.out.printf("%5d", i);
				cnt++;
				if(cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.println("\n개수 : " + cnt);
	}

}
