package mylist;

/* 날짜 : 2018.12.24
 * 내용 : Iterator 구현
 * 기타 : 
 * */

public class MyArrayList<T> implements MyList<T> {
	
	private Object[] elementData;
	private int size;
	
	public MyArrayList() {
		capacityAllocation(10);
	}
	
	public MyArrayList(int capacity) {
		capacityAllocation(capacity);
	}
	
	// 배열 초기 할당
	private void capacityAllocation(int capacity) {
		Object[] temp = new Object[capacity];
		
		if (elementData != null && size > 0) {
			System.arraycopy(elementData, 0, temp, 0, size);
		}
		
		elementData = temp;
	}
	
	@SuppressWarnings("unchecked") // 컴파일 경고를 출력하지 않도록 한다.
	private T elementData(int index) {
		return (T)elementData[index];
	}
	
	@Override
	public void add(T element) {
		if (size >= elementData.length) {
			capacityAllocation(elementData.length + 10);
		}
		
		elementData[size++] = element;
	}

	@Override
	public boolean add(int index, T element) {
		if (index < 0 || index > size) {
			return false;
		}
		
		if (size >= elementData.length) {
			capacityAllocation(elementData.length + 10);
		}
		
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i]; 
		}
		
		elementData[index] = element;
		size++;
		
		return true;
	}

	@Override
	public T get(int index) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		return elementData(index);
	}

	@Override
	public T set(int index, T element) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		T old = elementData(index);
		elementData[index] = element;
		
		return old;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public T remove(int index) {
		if (index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		T t = elementData(index);
		
		for (int i = index + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i];
		}
		
		size--;
		elementData[size] = null;
		
		return t;
	}

	@Override
	public boolean remove(T element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void clear() {
		for (int i = 0; i < size; i++) {
			elementData[i] = null;
		}
		
		size = 0;
	}

	@Override
	public int indexOf(T element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(elementData[i])) {
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public MyIterator<T> iterator() {
		return new MyIteratorImpl();
	}
	
	private class MyIteratorImpl implements MyIterator<T> {
		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			return nextIndex < size();
		}

		@Override
		public T next() {
			return elementData(nextIndex++);
		}

		@Override
		public void remove() {
			MyArrayList.this.remove(nextIndex - 1);
			nextIndex++;
			
		}
	}

	@Override
	public String toString() {
		String s = "[";
		
		for (int i = 0; i < size; i++) {
			s += elementData[i];
			
			if (i < size - 1) {
				s += ", ";
			}
		}
		
		s += "]";
		
		return s;
	}

}
