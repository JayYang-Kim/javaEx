package ex1218;

import java.util.Scanner;

/* ��¥ : 2018.12.18
 * ���� : 
 * ��Ÿ :  
 * */

// VO : �����͸� ���� (private)
class UserVo {
	// Ŭ���� ���� ���� �� priavte�� ����
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

// ���� �̸�, ������ �Է¹޴� Ŭ���� (�Է¹��� ����� ī��Ʈ)
class User {
	private Scanner sc = new Scanner(System.in);
	private UserVo[] list = new UserVo[10]; // UserVo u1, u2, u3 ... u10;
	private int count = 0;
	
	public void input() {
		if (count >= 10) {
			System.out.println("�Է� �ʰ�");
			return;
		}
		
		list[count] = new UserVo();
		
		System.out.println("�̸��� �Է����ּ���.");
		list[count].setName(sc.next()); // UserVo.name�� �����Ҽ��� ���� ������ set�� ���Ͽ� ���� �Է� (private)
		
		System.out.println("������ �Է����ּ���.");
		list[count].setScore(sc.nextInt());
		
		count++;
	}

	public UserVo[] getList() {
		return list;
	}

	public int getCount() {
		return count;
	}
}

class UserService {
	private User user;
	//private User user = new User(); // UserService Ŭ������ ����ɶ����� ���ο� ��ü�� ����
	
	public UserService(User user) {
		this.user = user;
	}
	
	public void print() {
		//UserVo[] data = user.getList();
		
		System.out.println("\n���� ����Ʈ");
		
		for (int i = 0; i < user.getCount(); i++) {
			//UserVo vo = data[i];
			UserVo vo = user.getList()[i]; // ���� �ּ� ������ �ѹ��� ó��
			
			System.out.println(vo.getName() + " : " + vo.getScore());
		}
	}
}

public class UserApp {

	public static void main(String[] args) {
		User uu = new User();
		UserService us = new UserService(uu);
		//UserService us = new UserService(); // [������ ����] ���ڰ� ���� �����ڰ� ���� ������ ����
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		while (true) {
			do {
				System.out.println("1.�Է� 2.��� 3.����");
				ch = sc.nextInt();
			} while(ch < 1 || ch > 3);
			
			if (ch == 3) {
				break;
			}
			
			switch(ch) {
			case 1 : uu.input(); break;
			case 2 : us.print(); break;
			}
		}
		
		sc.close();

	}

}