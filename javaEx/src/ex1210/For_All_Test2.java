package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 1~100까지 수중 3,6,9가 들어 있는 수는 *로 출력하고 나머지 숫자는 자신의 수를 출력, 한줄에 10개씩 출력하는 프로그램
 * */
public class For_All_Test2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			int c = 0; // 카운트 초기화
			
			// 10자리
			if((i / 10) >= 3 && (i / 10) % 3 == 0) { // 30이상이고 3으로 나누었을때 나머지가 0인걸 찾기 (3, 6, 9찾기)
				c++;
			}
			// 1자리
			if((i % 10) >= 3 && (i % 10) % 3 == 0) {
				c++;
			}
			
			if(c >= 1) {
				System.out.println(" * ");
			} else {
				System.out.printf("%5d", i);
			}
			
			// 10개 넘어가면 줄내림 처리
			if(i % 10 == 0) {
				System.out.println();
			}
			
		}

	}

}
