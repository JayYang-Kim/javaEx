package mylist;

/* 날짜 : 2018.12.24
 * 내용 : Iterator 만들어보기
 * 기타 : Interface 설계
 * */

public interface MyIterator<T> {
	public boolean hasNext();
	public T next();
	public void remove();
}
