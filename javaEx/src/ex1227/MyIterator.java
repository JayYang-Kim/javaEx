package ex1227;

/* ��¥ : 2018.12.27
 * ���� : Iterator ����
 * ��Ÿ : interface �ۼ�
 * */

public interface MyIterator<E> {
	public boolean hasNext();
	public E next();
	public void remove();
}
