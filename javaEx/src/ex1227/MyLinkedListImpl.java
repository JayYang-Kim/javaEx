package ex1227;

public class MyLinkedListImpl<E> implements MyLinkedList<E>{
	private Node<E> head;
	private Node<E> tail;
	private int size = 0;
	
	private class Node<T> {
		private T data;			// 데이터
		private Node<T> next;	// 다음 데이터의 주소
		
		public Node(T e) {
			this.data = e;
			this.next = null;
		}
	}
	
	private Node<E> node(int index) {
		if(index<0 || index>=size)
			return null;
		
		Node<E> node = head;
		for(int i=0; i<index; i++) {
			node = node.next;
		}
		
		return node;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void addFirst(E e) {
		Node<E> node = new Node<>(e);
		
		if(size==0) {
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
		if(size==0) {
			addFirst(e);
		} else {
			Node<E> node = new Node<>(e);
			tail.next = node;
			tail = node;
			size ++;
		}
		
		return true;
	}

	@Override
	public boolean add(int index, E e) {
		if(index < 0 || index > size)
			throw new ArrayIndexOutOfBoundsException("size:"+size+", index="+index);
		
		if(index==0) {
			addFirst(e);
		} else {
			Node<E> t1 = node(index-1);
			Node<E> t2 = t1.next;
			
			Node<E> newNode = new Node<>(e);
			t1.next = newNode;
			newNode.next = t2;
			
			size++;
			if(newNode.next==null) {
				tail = newNode;
			}
		}
		
		return true;
	}

	@Override
	public boolean remove(E e) {
		Node<E> node = head;
		Node<E> before = null;
		
		while(node != null) {
			if(node.data.equals(e)) {
				if(node == head) {
					head = node.next;
					if(head == null) {
						head = tail = null;
					}
				} else {
					before.next = node.next;
					if(before.next == null) {
						tail = before;
					}
				}
				size--;
				node = null;
				return true;
			}
			before = node;
			node = node.next;
		}
		
		return false;
	}

	@Override
	public E remove(int index) {
		if(index >= size)
			throw new ArrayIndexOutOfBoundsException("size:"+size+", index="+index);
		
		Node<E> node = node(index);
		if(node == null)
			return null;
		
		E e = node.data;
		if(remove(e)) {
			return e;
		}
		
		return null;
	}

	@Override
	public E removeFirst() {
		return remove(0);
	}

	@Override
	public E removeLast() {
		return remove(size-1);
	}

	@Override
	public void clear() {
		Node<E> t1=head;
		Node<E> t2;
		
		while(t1 != null) {
			t2 = t1.next;
			t1 = null;
			t1 = t2;
		}
		
		head = tail = null;
		size = 0;
	}

	@Override
	public E get(int index) {
		if(index >= size)
			throw new ArrayIndexOutOfBoundsException("size:"+size+", index="+index);
		
		Node<E> node = node(index);
		
		return node.data;
	}

	@Override
	public int indexOf(E e) {
		Node<E> node = head;
		int index = 0;
		
		while(node.data != e) {
			node = node.next;
			index++;
			if(node ==null) {
				return -1;
			}
		}
		
		return index;
	}

	@Override
	public E set(int index, E e) {
		if(index >= size)
			throw new ArrayIndexOutOfBoundsException("size:"+size+", index="+index);
		
		Node<E> node = node(index);
		E oldNode = node.data;
		
		node.data = e;
		
		return oldNode;
	}

	@Override
	public MyIterator<E> iterator() {
		return new MyIteratorImpl();
	}
	
	private class MyIteratorImpl implements MyIterator<E> {
		private Node<E> lastReturned;
		private Node<E> next;
		private int nextIndex;
		
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
			if(nextIndex==0)
				throw new IllegalStateException();
			
			MyLinkedListImpl.this.remove(nextIndex-1);
			
			nextIndex--;
		}
	}

	@Override
	public E removeList() {
		// TODO Auto-generated method stub
		return null;
	}

}
