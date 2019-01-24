package mylist;

/* ��¥ : 2018.12.24
 * ���� : Iterator ������
 * ��Ÿ : Interface ����
 * */

public interface MyList<T> {
	// ������ �߰�
	public void add(T element);
	
	// Ư�� �ε����� ������ �߰�
	public boolean add(int index, T element);
	
	// Ư�� �ε��� ������ ����
	public T get(int index);
	
	// Ư�� �ε��� ������ ����
	public T set(int index, T element);
	
	// ����� ����
	public int size();
	
	// Ư�� �ε��� ������ �����
	public T remove(int index);
	
	// Ư�� ������ �����
	public boolean remove(T element);
	
	// ��ü �����
	public void clear();
	
	// Ư�� �������� �ε���
	public int indexOf(T element);
	
	// �ݺ��� ����
	public MyIterator<T> iterator();
}
