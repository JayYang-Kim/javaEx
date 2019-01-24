package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : Array 문제
 * 기타 : 문제2) 5행 5열의 배열에 A~Y까지의 영문자를 실행결과처럼 채워 출력하는 프로그램
 * */
public class Array_Test3 {

	public static void main(String[] args) {
		char [][]n = new char [5][5];
		char a = 'A';
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 4; j >= 0; j--) { // 행
				n[j][i] = a++;
			}
			
		}
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + "\t");
			}
			
			System.out.println();
		}

	}

}
