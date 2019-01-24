package ex1227;

/* ��¥ : 2018.12.27
 * ���� : LinkedList ����
 * ��Ÿ : interface ����
 * */

public class MyLinkedListImpl2<E> implements MyLinkedList<E> {
	// �ʵ�
	private Node<E> head; // ó�� �ּҰ�
	private Node<E> tail; // ������ �ּҰ�
	private int size = 0;
	
	// ���� Ŭ����
	private class Node<T> {
		private T data; // ������
		private Node<T> next; // ���� �����Ͱ� �� �ִ� �ּ�
		
		// ������
		public Node(T e) {
			this.data = e;
			this.next = null;
		}
	}
	
	private Node<E> node(int index) {
		if (index < 0 || index > size) {
			return null;
		}
		
		Node<E> node = head;
		
		for (int i = 0; i < index; i++) {
			node = node.next;
		}
		
		return node;
	}
	
	// �������̽� �޼ҵ� ������ (�ʼ�)
	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(E e) {
		Node<E> node = new Node<>(e);
		
		if (size == 0) {
			head = tail = node;
			tail.next = null;
		} else {
			node.next = head;
			head = node;
		}
		
		size++;
	}

	@Override
	public boolean add(E e) {
		if (size == 0) {
			addFirst(e);
		} else {
			Node<E> node = new Node<>(e);
			tail.next = node;
			tail = node;
			size++;
		}
		
		return true;
	}

	@Override
	public boolean add(int index, E e) {

		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public E set(int index, E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyIterator<E> iterator() {
		return new MyIteratorImpl();
	}
	
	private class MyIteratorImpl implements MyIterator<E> {
		// �ʵ�
		private Node<E> lastReturned;
		private Node<E> next;
		private int nextIndex;
		
		// ������
		public MyIteratorImpl() {
			next = head;
			nextIndex = 0;
		}
		
		@Override
		public boolean hasNext() {
			return nextIndex < size();
		}

		@Override
		public E next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			
			return lastReturned.data;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

}
