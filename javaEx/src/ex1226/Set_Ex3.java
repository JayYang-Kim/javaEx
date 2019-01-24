package ex1226;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : 
 * */

public class Set_Ex3 {

	public static void main(String[] args) {
		// ũ������� ����, �ߺ��� ������� ����
		Set<String> set = new TreeSet<>();
		
		set.add("�ڹ�");
		set.add("�ȵ���̵�");
		set.add("������");
		set.add("�����α׷���");
		set.add("����");
		
		System.out.println(set);
		
		// ������ ������ �ߺ� �Ұ�
		set.add("����"); 
		
		System.out.println(set); // [���] ���� �߰� �ȵ�
		
		Iterator<String> it = set.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s + " ");
		}
		
		System.out.println();
	}

}
