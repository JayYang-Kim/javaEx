package mylist;

/* ��¥ : 2018.12.24
 * ���� : Iterator ������
 * ��Ÿ : Interface ����
 * */

public interface MyIterator<T> {
	public boolean hasNext();
	public T next();
	public void remove();
}
