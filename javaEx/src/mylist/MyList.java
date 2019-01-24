package mylist;

/* 날짜 : 2018.12.24
 * 내용 : Iterator 만들어보기
 * 기타 : Interface 설계
 * */

public interface MyList<T> {
	// 데이터 추가
	public void add(T element);
	
	// 특정 인덱스에 데이터 추가
	public boolean add(int index, T element);
	
	// 특정 인덱스 데이터 리턴
	public T get(int index);
	
	// 특정 인덱스 데이터 변경
	public T set(int index, T element);
	
	// 요소의 개수
	public int size();
	
	// 특정 인덱스 데이터 지우기
	public T remove(int index);
	
	// 특정 데이터 지우기
	public boolean remove(T element);
	
	// 전체 지우기
	public void clear();
	
	// 특정 데이터의 인덱스
	public int indexOf(T element);
	
	// 반복자 리턴
	public MyIterator<T> iterator();
}
