package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : Stack 구현 
 * 기타 : App
 *      최초의 stack의 크기를 정하여 그 크기만큼만 입력할 수 있도록 프로그램 작성
 * */

public class MyStackApp {

	public static void main(String[] args) {
		MyStack<Integer> ms = new MyStackImpl<>(10); // 인자값을 입력하여 배열 초기값 입력
		 
		ms.push(20);
		ms.push(10);
		ms.push(30);
		ms.push(50);
		
		while (!ms.isEmpty()) {
			int n = ms.pop();
			
			System.out.println(n);
		}
	}

}
