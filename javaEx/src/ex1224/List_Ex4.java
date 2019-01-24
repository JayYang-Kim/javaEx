package ex1224;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/* ��¥ : 2018.12.24
 * ���� : List<>, LinkedList
 * ��Ÿ : List ���� Ŭ���� : ArrayList, LinkedList, Vector
 * */

public class List_Ex4 {

	public static void main(String[] args) {
		List<String> list = new Vector<>();
		
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����"); // �ߺ� ���
		
		System.out.println(list); // ��ü ������ ��� (list.toString() ����)
		System.out.println("��ü ���� : " + list.size());
		
		// ������� ���
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		
		System.out.println(list.get(list.size() - 1)); // ���� ������ �� ���
		
		// ó���� �ѱ� �߰� (add)
		list.add(0, "�ѱ�"); // list.add(index ����, �߰��� ���ڿ�)
		System.out.println(list);
		
		// index ������ �ִ� ������ ���� (set)
		list.set(0, "���ѹα�");
		System.out.println(list);
		
		// ���� ���� ���� Ȯ��
		if (list.contains("����")) {
			System.out.println("������ �����մϴ�.");
		}
		
		// �λ��� �ε���(��ġ) Ȯ��
		int i = list.indexOf("�λ�"); // �����Ͱ� ���� ��� -1 ����
		System.out.println("�λ� �ε��� Ȯ�� : " + i);
		
		// ���ѹα� ������ ����
		list.remove("���ѹα�");
		System.out.println(list.size());
		System.out.println(list);
		
		// for�� �̿��� ��ü ������ ���
		System.out.println("��ü ��� - 1");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j) + "  ");
		}
		
		System.out.println();
		
		// for�� �̿��� ��ü ������ ��� (����)
		System.out.println("�������");
		for (int j = list.size() - 1; j >= 0; j--) {
			System.out.println(list.get(j) + "  ");
		}

		System.out.println();
		
		// forEach�� �̿��� ��ü ������ ���
		System.out.println("��ü ��� - 2");
		for (String s : list) {
			System.out.println(s + "  ");
		}
		
		System.out.println();
		
		// Iterator(�ݺ���)�� �̿��� ��ü ������ ��� : ó������ ������ �ϳ��� �����ϴ� �ݺ�
		System.out.println("��ü ��� - 3");
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) { // �����Ͱ� �����ϸ� true, ������ false
			String s = it.next(); // �����͸� �������ְ� �������� �̵�
			System.out.println(s + "  ");
		}
		
		System.out.println();
		
		// ListIterator�� �̿��� ��ü ������ ��� 
		// ListIterator : Vector������ �������� �ʰ� �������� ��� ����
		System.out.println("��ü ��� - 4");
		ListIterator<String> it2 = list.listIterator();
		
		while (it2.hasNext()) {
			String s = it2.next();
			System.out.println(s + "  ");
		}
		
		System.out.println();
		
		System.out.println("������� - 2");
		// ���� �ڷ� �̵��� ������ ��� �� �� �ִ�.
		
		while (it2.hasPrevious()) {
			String s = it2.previous();
			System.out.println(s + "  ");
		}
		
		System.out.println();
	}

}
