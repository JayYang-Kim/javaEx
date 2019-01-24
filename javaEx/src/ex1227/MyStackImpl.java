package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Stack 구현 
 * 기타 : interface 구현
 *      최초의 stack의 크기를 정하여 그 크기만큼만 입력할 수 있도록 프로그램 작성
 * */

public class MyStackImpl<E> implements MyStack<E> {
	private Object[] elementData; // 데이터를 어떤 형으로 저장할지 모르기 때문에 전체 자료형을 담을 수 있는 Object로 변수 선언
	private int index;
	
	public MyStackImpl(int size) {
		elementData = new Object[size]; // [업캐스팅] 인수의 값만큼 배열의 크기 지정
		index = 0; // index 초기값 설정
	}
	
	@Override
	public E pop() { // 스택 상단의 데이터를 가져오고 삭제하는 메소드
		if (isEmpty()) { // 데이터가 비어있는지 체크 (비어있으면 true)
			throw new IndexOutOfBoundsException("Stack이 비었습니다."); // 강제 예외 처리 
		}
		
		E item = peek();
		
		elementData[--index] = null;
		
		return item;
	}

	@SuppressWarnings("unchecked") // jdk5.0부터 컴파일 경고를 사용하지 않도록 설정
	@Override
	public E peek() { // 스택 상단의 데이터를 가져오는 메소드
		if (isEmpty()) { // 데이터가 비어있는지 체크 (비어있으면 true)
			throw new IndexOutOfBoundsException("Stack이 비었습니다."); // 강제 예외 처리 
		}
		
		return (E)elementData[index - 1]; // [다운캐스팅]
	}

	@Override 
	public boolean isEmpty() { // 데이터가 비어있는지 확인하는 메소드
		return index <= 0;
	}

	@Override
	public void push(E data) { // 데이터를 추가하는 메소드
		if (index >= elementData.length) {
			throw new IndexOutOfBoundsException("Stack Full");
		}
		
		elementData[index++] = data;
	}
	
}
