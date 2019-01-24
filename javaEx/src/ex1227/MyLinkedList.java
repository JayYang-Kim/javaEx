package ex1227;

/* ��¥ : 2018.12.27
 * ���� : LinkedList ����
 * ��Ÿ : interface �ۼ�
 * */

public interface MyLinkedList<E> {
	public int size(); 					// ������ ���� ���ϱ�
	
	public void addFirst(E e); 			// ù ��° ��ġ�� ������ �����ϱ�
	public boolean add(E e); 			// ������ ��ġ�� ������ �߰�
	public boolean add(int index, E e); // Ư���� ��ġ�� ������ �߰�
	
	public boolean remove(E e); 		// ������ ����
	public E remove(int index); 		// Ư���� ��ġ�� �ִ� ������ ����
	public E removeFirst(); 			// ó�� ������ ����
	public E removeLast(); 				// ������ ������ ����
	public E removeList(); 				// ������ ������ ����
	
	public void clear(); 				// ��� ������ ����
	
	public E get(int index); 			// Ư�� �ε����� ������ ��ȯ 
	public int indexOf(E e); 			// �������� �ε��� ��ȯ
	public E set(int index, E e); 		// Ư�� �ε����� �����͸� ����
	
	public MyIterator<E> iterator(); 	// �ݺ���
}
