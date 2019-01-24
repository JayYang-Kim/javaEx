package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Stack ���� 
 * ��Ÿ : interface ����
 *      ������ stack�� ũ�⸦ ���Ͽ� �� ũ�⸸ŭ�� �Է��� �� �ֵ��� ���α׷� �ۼ�
 * */

public class MyStackImpl<E> implements MyStack<E> {
	private Object[] elementData; // �����͸� � ������ �������� �𸣱� ������ ��ü �ڷ����� ���� �� �ִ� Object�� ���� ����
	private int index;
	
	public MyStackImpl(int size) {
		elementData = new Object[size]; // [��ĳ����] �μ��� ����ŭ �迭�� ũ�� ����
		index = 0; // index �ʱⰪ ����
	}
	
	@Override
	public E pop() { // ���� ����� �����͸� �������� �����ϴ� �޼ҵ�
		if (isEmpty()) { // �����Ͱ� ����ִ��� üũ (��������� true)
			throw new IndexOutOfBoundsException("Stack�� ������ϴ�."); // ���� ���� ó�� 
		}
		
		E item = peek();
		
		elementData[--index] = null;
		
		return item;
	}

	@SuppressWarnings("unchecked") // jdk5.0���� ������ ��� ������� �ʵ��� ����
	@Override
	public E peek() { // ���� ����� �����͸� �������� �޼ҵ�
		if (isEmpty()) { // �����Ͱ� ����ִ��� üũ (��������� true)
			throw new IndexOutOfBoundsException("Stack�� ������ϴ�."); // ���� ���� ó�� 
		}
		
		return (E)elementData[index - 1]; // [�ٿ�ĳ����]
	}

	@Override 
	public boolean isEmpty() { // �����Ͱ� ����ִ��� Ȯ���ϴ� �޼ҵ�
		return index <= 0;
	}

	@Override
	public void push(E data) { // �����͸� �߰��ϴ� �޼ҵ�
		if (index >= elementData.length) {
			throw new IndexOutOfBoundsException("Stack Full");
		}
		
		elementData[index++] = data;
	}
	
}
