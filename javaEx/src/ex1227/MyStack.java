package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Stack ���� 
 * ��Ÿ : interface �ۼ�
 * */

public interface MyStack<E> {
	public E pop(); // ���� ����� �����͸� �������� �����ϴ� �޼ҵ�
	public E peek(); // ���� ����� �����͸� �������� �޼ҵ�
	
	public boolean isEmpty(); // �����Ͱ� ����ִ��� Ȯ���ϴ� �޼ҵ�
	
	public void push(E data); // �����͸� �߰��ϴ� �޼ҵ�
}
