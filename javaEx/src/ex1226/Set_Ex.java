package ex1226;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : 
 * */

public class Set_Ex {

	public static void main(String[] args) {
		// ���Լ����� �������� �ʰ�, �ߺ��� ������� ����
		Set<String> set = new HashSet<>();
		
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
