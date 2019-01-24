package ex1224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* ��¥ : 2018.12.24
 * ���� : List<> / ArrayList
 * ��Ÿ : List ���� Ŭ���� : ArrayList, LinkedList, Vector
 * */

public class List_Ex2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("���");
		list2.add("����");
		list2.add("��û");
		list2.add("����");
		list2.add("���");
		list2.add("����");
		
		// list�� list2 ��� �����͸� �߰�
		list.addAll(list2); // ���� ���� ��ü�� ����
		                    // list.addAll(index��ġ, ������ ��ü); index��ġ�� ����
		
		System.out.println(list);
		
		// List<String> => String[]
		System.out.println("List���� �迭�� ��ȯ");
		
		String[] ss = list.toArray(new String[list.size()]);
		
		for (String s : ss) {
			System.out.println(s);
		}
		
		System.out.println();
		
		// String[] => List<String>
		System.out.println("�迭���� List�� ��ȯ - 1");
		
		//List<String> list3 = new ArrayList<>(Arrays.asList(ss));
		List<String> list3 = Arrays.asList(ss);
		
		System.out.println(list3);
		
		// Ư�� �����͸� ������ ���ο� ��ü ����
		System.out.println("Ư�� �����͸� ������ ��ü ����");
		
		// index 2 ~ 4���� ����
		List<String> list4 = list.subList(2, 5); // subList Ư�� ��ġ�� ���� (fromIndex, toIndex)
		
		System.out.println(list4);
		
		// 2��° index ~ 4��° index���� ����
		System.out.println("2 ~ 4 index���� ����");
		
		list.subList(2, 5).clear();
		
		System.out.println(list);
		
		// list2 ��� �����
		list2.clear();
		
		System.out.println("list2 : " + list2.size());
	}

}
