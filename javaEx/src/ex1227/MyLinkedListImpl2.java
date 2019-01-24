package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : LinkedList 구현
 * 기타 : interface 구현
 * */

public class MyLinkedListImpl2<E> implements MyLinkedList<E> {
	// 필드
	private Node<E> head; // 처음 주소값
	private Node<E> tail; // 마지막 주소값
	private int size = 0;
	
	// 내부 클래스
	private class Node<T> {
		private T data; // 데이터
		private Node<T> next; // 다음 데이터가 들어가 있는 주소
		
		// 생성자
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
	
	// 인터페이스 메소드 재정의 (필수)
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
		// 필드
		private Node<E> lastReturned;
		private Node<E> next;
		private int nextIndex;
		
		// 생성자
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
