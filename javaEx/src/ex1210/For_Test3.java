package ex1210;

/* 날짜 : 2018.12.10
 * 내용 : For문 테스트
 * 기타 : 두 개의 주사위를 던져 두 주사위 눈의 합이 9가 되는 경우를 모두 출력하는 프로그램
 * */
public class For_Test3 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			
			for(int j = 1; j <= 6; j++) {
				
				if (i + j == 9) {
					System.out.println(i + " , " + j);
				}
				
			}
			
		}
	}

}
