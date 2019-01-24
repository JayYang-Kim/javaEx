package ex1224;

import java.util.Collections;
import java.util.Vector;

/* ��¥ : 2018.12.24
 * ���� : List<>, Vector
 * ��Ÿ : List ���� Ŭ���� : ArrayList, LinkedList, Vector
 * */


public class Vector_Ex {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		System.out.println("������ �뷮 : " + v.capacity()); // 10
		
		v.add("�ڹ�");
		v.add("�ȵ���̵�");
		v.add("HTML");
		v.add("CSS");
		v.add("�ϵ�");
		v.add("������");
		v.add("����Ŭ");
		v.add("MS-SQL");
		v.add("MYSQL");
		v.add("�ڹٽ�ũ��Ʈ");
		v.add("node.js");
		v.add("����");
		v.add("JSP");
		v.add("C");
		v.add("C++");
		v.add("PHP");
		
		System.out.println("�뷮 : " + v.capacity());
		
		// ù��° index ������ ��������
		System.out.println("ó�� : " + v.get(0)); 
		System.out.println("ó�� : " + v.firstElement()); 
		
		// ������ index ������ ��������
		System.out.println("������ : " + v.get(v.size() - 1)); 
		System.out.println("������ : " + v.lastElement());
		
		// ������ ����
		v.set(0, "JAVA");
		System.out.println(v);
		
		// ������ �߰�
		v.add(1, "�ڹ� JAVA");
		System.out.println(v);
		
		// ���� - �����ټ� (��������)
		Collections.sort(v);
		System.out.println(v);
		
		// �ݵ�� �������� ������ �Ǿ� �־���Ѵ�.
		// �˻� : �����˻�, �����˻�
		int n = Collections.binarySearch(v, "����Ŭ");
		if (n != -1) {
			System.out.println("����Ŭ : " + n + "�ε����� ����");
		}
		
		// ����  - �ٳ����� (��������)
		Collections.sort(v, Collections.reverseOrder());
		System.out.println(v);
		
		v.clear();
		
		System.out.println(v.size()); // ������ ��
		System.out.println(v.capacity()); // �뷮
		
		v.add("JAVA");
		// �뷮�� ������ ������
		v.trimToSize();
		
		System.out.println(v.size()); // ������ ��
		System.out.println(v.capacity()); // �뷮
	}

}
