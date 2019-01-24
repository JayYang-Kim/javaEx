package ex1226;

import java.util.Stack;

/* ��¥ : 2018.12.26
 * ���� : Collection > List > Vector > Stack 
 * ��Ÿ : �߰� (push), 
 * */

public class Stack_Ex {

	public static void main(String[] args) {
		// LIFO���� : Last in First Out
		Stack<String> st = new Stack<>();
		
		// ������ �߰�
		st.push("�ڹ�");
		st.push("�ȵ���̵�");
		st.push("��");
		st.push("������");
		
		System.out.println(st);
		
		// peek() : top ��ġ�� �����͸� �����ϰ� �������� �ʴ´�.
		while (!st.empty()) { // ������� ������
			String s = st.pop(); // top ��ġ�� �����͸� �����ϰ� �����Ѵ�.
			System.out.println(s);
		}
	}

}
