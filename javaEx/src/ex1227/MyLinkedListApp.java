package ex1227;

/* 날짜 : 2018.12.27
 * 내용 : LinkedList 구현
 * 기타 : App
 * */

public class MyLinkedListApp {

	public static void main(String[] args) {
		MyLinkedList<String> m = new MyLinkedListImpl2<>();
		
		m.add("서울");
		m.add("부산");
		m.add("인천");
		m.add("대구");
		
		MyIterator<String> it = m.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			
			System.out.println(s);
		}
	}

}
