package ex1226;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/* ��¥ : 2018.12.26
 * ���� : Queue 
 * */

class User2 implements Comparable<User2> {
	private String name;
	private int age;
	
	public User2() {
		
	}
	
	public User2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User2 o) {
		return name.compareTo(o.getName());
	}
}

public class Queue_Ex2 {
	public static void main(String[] args) {
		// �켱���� ť
		PriorityQueue<User2> pq = new PriorityQueue<>();
		
		pq.offer(new User2("�ڹ�", 30));
		pq.offer(new User2("�ȵ���̵�", 70));
		pq.offer(new User2("��", 20));
		pq.offer(new User2("����", 15));
		pq.offer(new User2("������", 10));
		
		while (pq.peek() != null) {
			User2 u = pq.poll();
			System.out.println(u.getName() + " : " + u.getAge());
		}
		
		System.out.println();
	}
}
