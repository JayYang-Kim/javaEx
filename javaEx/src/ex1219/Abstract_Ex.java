package ex1219;

/* ��¥ : 2018.12.19
 * ���� : Abstract(�߻�ȭ) Ŭ����
 * ��Ÿ : 
 * */

// �߻� Ŭ����
// �߻� �޼ҵ尡 �ϳ��� ���� ���, �߻� Ŭ������ �־���Ѵ�. 
// ��ü ���� �Ұ�
abstract class SortInt {
	private int[] value;
	
	protected abstract void sorting(); // �߻� �޼ҵ�
	
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
	
	// ���̰�
	protected final int compare(int i, int j) {
		return value[i] - value[j];
	}
	
	// �ڸ� �ٲ��ֱ�
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
		
		//SortInt a = new sortInt(); // �߻�Ŭ������ ��ü ���� �Ұ�
		
		SortInt ss = new SeletionSort(); // [��ĳ����]
		//SortInt ss = new BubbleSort(); // [��ĳ����]
		
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
