package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : Array 문제
 * 기타 : 문제1) 5행 5열의 배열에 1~25까지의 수를 실행결과처럼 ㄹ자 모양으로 채워 출력하는 프로그램 
 * */
public class Array_Test2 {

	public static void main(String[] args) {
		int [][]n = new int [5][5];
		int a = 0;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				a++;
				if (i % 2 == 0) {
					n[i][j] = a;
				} else {
					n[i][4-j] = a;
				}
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
