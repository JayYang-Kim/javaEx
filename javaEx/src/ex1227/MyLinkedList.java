package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : LinkedList 구현
 * 기타 : interface 작성
 * */

public interface MyLinkedList<E> {
	public int size(); 					// 데이터 개수 구하기
	
	public void addFirst(E e); 			// 첫 번째 위치에 데이터 삽입하기
	public boolean add(E e); 			// 마지막 위치에 데이터 추가
	public boolean add(int index, E e); // 특정한 위치에 데이터 추가
	
	public boolean remove(E e); 		// 데이터 삭제
	public E remove(int index); 		// 특정한 위치에 있는 데이터 삭제
	public E removeFirst(); 			// 처음 데이터 삭제
	public E removeLast(); 				// 마지막 데이터 삭제
	public E removeList(); 				// 마지막 데이터 삭제
	
	public void clear(); 				// 모든 데이터 삭제
	
	public E get(int index); 			// 특정 인덱스의 데이터 반환 
	public int indexOf(E e); 			// 데이터의 인데스 반환
	public E set(int index, E e); 		// 특정 인덱스의 데이터를 수정
	
	public MyIterator<E> iterator(); 	// 반복자
}
