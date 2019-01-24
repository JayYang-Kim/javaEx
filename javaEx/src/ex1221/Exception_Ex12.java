package ex1221;

import java.util.InputMismatchException;
import java.util.Scanner;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : ���� Ŭ���� ����
 * */

class ScoreVO {
	private String name;
	private int score;
	private String birth;
	
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}

class Score {
	private ScoreVO[] list = new ScoreVO[5];
	private int count;
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		if (count >= 5) {
			System.out.println("�Է� �ʰ�");
			return;
		}
		
		System.out.println("�ڷ� �Է�");
		
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("�̸��� �Է����ּ���.");
			vo.setName(sc.nextLine());
			
			if (vo.getName().length() < 2) { // checked exception ���� �߻� (try ~ catch)
				throw new Exception("�̸��� �α��� �̻��Դϴ�.");
			}
			
			vo.setScore(inputScore("����"));
			
			System.out.println("��������� �Է����ּ���.");
			vo.setBirth(sc.nextLine());
			
			if (vo.getBirth().length() != 10) { // checked exception ���� �߻� (try ~ catch)
				throw new Exception("������� ������ ��ġ���� �ʽ��ϴ�.");
			}
			
			list[count++] = vo; // ���� �߻� �� ī��Ʈ�� �ö��� �ʴ´�.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void print() {
		System.out.println("�ڷ� ���");
		for (int i = 0; i < count; i++) {
			System.out.println(list[i].getName() + "\t");
			System.out.println(list[i].getScore() + "\t");
			System.out.println(list[i].getBirth() + "\t");
		}
	}
	
	public int inputScore(String title) throws Exception {
		int s = 0;
		
		try {
			System.out.println(title + " ?");
			s = sc.nextInt();
			
			if (s < 0 || s > 100) { // checked exception (throws Exception)
				throw new Exception("������ 0 ~ 100���̸� �Է��� �����մϴ�."); 
			}
		} catch (InputMismatchException e) { // Scanner���� �Է��� �߸������� ���� ����
			throw new Exception("���ڸ� �Է� �����մϴ�.");
		} finally {
			sc.nextLine(); // ���͸� �о ����
		}
		
		return s;
	}
}

public class Exception_Ex12 {

	public static void main(String[] args) {
		Score ss = new Score();
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
			
			switch (ch) {
			case 1 : ss.input(); break;
			case 2 : ss.print(); break;
			}
		}
		
		sc.close();
	}

}
