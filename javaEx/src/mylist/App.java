package mylist;

/* ��¥ : 2018.12.24
 * ���� : �׽�Ʈ
 * ��Ÿ : 
 * */

public class App {

	public static void main(String[] args) {
		MyList<String> list = new MyArrayList<>();
		
		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		
		System.out.println(list.get(1));
		
		list.add(2, "�뱸");
		
		list.set(0,"seoul");
		//String s = list.set(0, "seoul");
		
		System.out.println(list);
		
		System.out.println("��ü - 1");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "  ");
		}
		
		System.out.println();
	}

}
