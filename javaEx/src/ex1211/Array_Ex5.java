package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : 가변 배열(2차원 배열) 예제
 * 기타 : 배열의 배열을 향상된 for문을 이용하여 접근한 예제
 * */
public class Array_Ex5 {

	public static void main(String[] args) {
		int [][] arr = new int[][] {{1,2,3},{10,11,12}};
		
		for (int []a : arr) {
			for(int n : a) {
				System.out.print(n + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("====================");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
	}

}
