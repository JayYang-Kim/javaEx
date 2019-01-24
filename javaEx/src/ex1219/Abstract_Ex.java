package ex1219;

/* 날짜 : 2018.12.19
 * 내용 : Abstract(추상화) 클래스
 * 기타 : 
 * */

// 추상 클래스
// 추상 메소드가 하나라도 있을 경우, 추상 클래스가 있어야한다. 
// 객체 생성 불가
abstract class SortInt {
	private int[] value;
	
	protected abstract void sorting(); // 추상 메소드
	
	public void sort(int[] value) {
		this.value = value;
		sorting();
	}
	
	protected int length() {
		int n = -1;
		
		if (value != null) {
			n = value.length;
		}
		
		return n;
	}
	
	// 차이값
	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}
	
	// 자리 바꿔주기
	protected final void swap(int i, int j) {
		int t = value[i];
		value[i] = value[j];
		value[j] = t;
	}
}

class SeletionSort extends SortInt {

	@Override
	protected void sorting() {
		for (int i = 0; i < length() - 1; i++) {
			for (int j = i + 1; j < length(); j++) {
				if (compare(i, j) > 0) {
					swap(i, j);
				}
			}
		}
		
	}
	
}

class BubbleSort extends SortInt {

	@Override
	protected void sorting() {
		int pass = 1;
		boolean flag;
		
		do {
			flag = false;
			for (int i = 0; i < length() - pass; i++) {
				if (compare(i, i + 1) > 0) {
					swap(i, i + 1);
					flag = true;
				}
			}
			
			pass++;
		} while(flag);
	}
	
}

public class Abstract_Ex {

	public static void main(String[] args) {
		int[] data = {20,5,40,8,66,99,12,30};
		
		//SortInt a = new sortInt(); // 추상클래스는 객체 생성 불가
		
		SortInt ss = new SeletionSort(); // [업캐스팅]
		//SortInt ss = new BubbleSort(); // [업캐스팅]
		
		System.out.println("source : date : ");
		for (int n : data) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
		
		ss.sort(data);
		
		System.out.println("sort data : ");
		for (int n : data) {
			System.out.print(n + "  ");
		}
		
		System.out.println();
	}

}
