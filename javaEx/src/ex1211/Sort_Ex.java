package ex1211;

/* ��¥ : 2018.12.11
 * ���� : sort ����
 * ��Ÿ : 
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
		
		// Selection sort (�ּҰ� ���� ���� ����)
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				// �ּҰ�, �ִ밪 ���ϱ� [i]�ּҰ�, [j]�ִ밪
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
		
		// Bubble sort (�ִ밪 ���� ���� ����)
		for (int i = 1; i < num.length - 1; i++) { // 0
			for (int j = 0; j < num.length - i; j++) { // 1
				// Bubble sort ó�� Ȯ��
				//System.out.printf("%d : %d\n", num[j], num[j+1]); 
				
				// �ּҰ�, �ִ밪 ���ϱ� [i]�ּҰ�, [j]�ִ밪
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
		
		// 3) ������ Bubble sort
		/*int []num = {25,15,7,4,12,9,17,16,20,13};
		int t, pass;
		boolean flag;
		
		System.out.print("source data : ");
		
		for (int n : num) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
		
		// Bubble sort(����)
		pass = 1;
		do {
			flag = false;
			
			for(int i = 0; i < num.length - pass; i++) {
				if(num[i] > num[i + 1]) {
					t = num[i]; num[i] = num[i + 1]; num[i + 1] = t;
					flag = true;
				}
			}
			
			// ����
			System.out.print(pass + "ȸ�� : ");
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
