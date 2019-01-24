package mylist;

/* 날짜 : 2018.12.24
 * 내용 : 테스트
 * 기타 : 
 * */

public class App {

	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<>();
		
		list.add("서울");
		list.add("부산");
		list.add("인천");
		
		System.out.println(list.get(1));
		
		list.add(2, "대구");
		
		list.set(0,"seoul");
		//String s = list.set(0, "seoul");
		
		System.out.println(list);
		
		System.out.println("전체 - 1");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "  ");
		}
		
		System.out.println();
	}

}
