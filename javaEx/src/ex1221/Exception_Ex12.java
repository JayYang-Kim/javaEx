package ex1221;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 날짜 : 2018.12.21
 * 내용 : 예외 (Exception) 처리
 * 기타 : 예외 클래스 생성
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
			System.out.println("입력 초과");
			return;
		}
		
		System.out.println("자료 입력");
		
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("이름을 입력해주세요.");
			vo.setName(sc.nextLine());
			
			if (vo.getName().length() < 2) { // checked exception 예외 발생 (try ~ catch)
				throw new Exception("이름은 두글자 이상입니다.");
			}
			
			vo.setScore(inputScore("점수"));
			
			System.out.println("생년월일을 입력해주세요.");
			vo.setBirth(sc.nextLine());
			
			if (vo.getBirth().length() != 10) { // checked exception 예외 발생 (try ~ catch)
				throw new Exception("생년월일 형식이 일치하지 않습니다.");
			}
			
			list[count++] = vo; // 예외 발생 시 카운트가 올라가지 않는다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void print() {
		System.out.println("자료 출력");
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
				throw new Exception("점수는 0 ~ 100사이만 입력이 가능합니다."); 
			}
		} catch (InputMismatchException e) { // Scanner에서 입력을 잘못했을때 나는 예외
			throw new Exception("숫자만 입력 가능합니다.");
		} finally {
			sc.nextLine(); // 엔터를 읽어서 버림
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
				System.out.println("1.입력 2.출력 3.종료");
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
