package ex1211;

/* ��¥ : 2018.12.11
 * ���� : ���� �迭(2���� �迭) ����
 * ��Ÿ : �迭�� �迭�� ���� for���� �̿��Ͽ� ������ ����
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
