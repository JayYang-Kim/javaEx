package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Stack 구현 
 * 기타 : interface 작성
 * */

public interface MyStack<E> {
	public E pop(); // 스택 상단의 데이터를 가져오고 삭제하는 메소드
	public E peek(); // 스택 상단의 데이터를 가져오는 메소드
	
	public boolean isEmpty(); // 데이터가 비어있는지 확인하는 메소드
	
	public void push(E data); // 데이터를 추가하는 메소드
}
