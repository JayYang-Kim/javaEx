package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Iterator 구현
 * 기타 : interface 작성
 * */

public interface MyIterator<E> {
	public boolean hasNext();
	public E next();
	public void remove();
}
