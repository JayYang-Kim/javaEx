package ex1227;

/* ��¥ : 2018.12.27
 * ���� : LinkedList ����
 * ��Ÿ : App
 * */

public class MyLinkedListApp {

	public static void main(String[] args) {
		MyLinkedList<String> m = new MyLinkedListImpl2<>();
		
		m.add("����");
		m.add("�λ�");
		m.add("��õ");
		m.add("�뱸");
		
		MyIterator<String> it = m.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			
			System.out.println(s);
		}
	}

}
