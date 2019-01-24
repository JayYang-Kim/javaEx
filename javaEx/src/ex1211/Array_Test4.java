package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : Array 문제
 * 기타 : 문제3)  
 * */
public class Array_Test4 {

	public static void main(String[] args) {
		int [][]n = new int [4][5];
		int a = 0;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				a++;
				if (i % 2 == 0) {
					n[j][i] = a;
				} else {
					n[3-j][i] = a;
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
