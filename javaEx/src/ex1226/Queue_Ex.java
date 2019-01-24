package ex1226;

import java.util.LinkedList;
import java.util.Queue;

/* ��¥ : 2018.12.26
 * ���� : Queue 
 * */

public class Queue_Ex {
	public static void main(String[] args) {
		Queue<String> qu = new LinkedList<>();
		
		// ť�� �������� ����
		qu.offer("����");
		qu.offer("��õ");
		qu.offer("�뱸");
		qu.offer("�λ�");
		
		System.out.println(qu);
		
		while (qu.peek() != null) { // peek() : head��Ҹ� ��ȯ�ϰ� ���� ���� ����
			String s = qu.poll(); // poll() : head��Ҹ� ��ȯ�ϰ� ����
			
			System.out.println(s);
		}
	}
}
