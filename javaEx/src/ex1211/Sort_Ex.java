package ex1211;

/* 날짜 : 2018.12.11
 * 내용 : sort 예제
 * 기타 : 
 * */
public class Sort_Ex {

	public static void main(String[] args) {
		// 1) Selection sort
		/*int []num = {66, 23, 60, 27, 40};
		int t;
		
		System.out.println("source data : ");
		
		for (int n : num) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
		
		// Selection sort (최소값 부터 먼저 구함)
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				// 최소값, 최대값 구하기 [i]최소값, [j]최대값
				if(num[i] > num[j]) {
					t = num[i]; num[i] = num [j]; num[j] = t;
				}
			}
		}
		
		System.out.println("sort date : ");
		for (int n : num) {
			System.out.print(n + "  ");
		}
		
		System.out.println();*/
		
		// 2) Bubble sort
		/*int []num = {66, 23, 60, 27, 40};
		int t;
		
		System.out.println("source data : ");
		
		for (int n : num) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
		
		// Bubble sort (최대값 부터 먼저 구함)
		for (int i = 1; i < num.length - 1; i++) { // 0
			for (int j = 0; j < num.length - i; j++) { // 1
				// Bubble sort 처리 확인
				//System.out.printf("%d : %d\n", num[j], num[j+1]); 
				
				// 최소값, 최대값 구하기 [i]최소값, [j]최대값
				if(num[j] > num[j+1]) {
					t = num[j]; num[j] = num [j+1]; num[j+1] = t;
				}
			}
		}
		
		System.out.println("sort date : ");
		for (int n : num) {
			System.out.print(n + "  ");
		}
		
		System.out.println();*/
		
		// 3) 개선된 Bubble sort
		/*int []num = {25,15,7,4,12,9,17,16,20,13};
		int t, pass;
		boolean flag;
		
		System.out.print("source data : ");
		
		for (int n : num) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
		
		// Bubble sort(개선)
		pass = 1;
		do {
			flag = false;
			
			for(int i = 0; i < num.length - pass; i++) {
				if(num[i] > num[i + 1]) {
					t = num[i]; num[i] = num[i + 1]; num[i + 1] = t;
					flag = true;
				}
			}
			
			// 과정
			System.out.print(pass + "회전 : ");
			for (int n : num) {
				System.out.print(n + " ");
			}
			System.out.println();
			
			pass++;
		} while(flag);
		
		System.out.print("sort data : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
		
		System.out.println();*/
		
		// 4) Insertion sort
	}

}
