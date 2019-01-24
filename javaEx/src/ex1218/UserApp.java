package ex1218;

import java.util.Scanner;

/* 날짜 : 2018.12.18
 * 내용 : 
 * 기타 :  
 * */

// VO : 데이터를 저장 (private)
class UserVo {
	// 클래스 변수 생성 시 priavte로 선언
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

// 유저 이름, 점수를 입력받는 클래스 (입력받은 사람을 카운트)
class User {
	private Scanner sc = new Scanner(System.in);
	private UserVo[] list = new UserVo[10]; // UserVo u1, u2, u3 ... u10;
	private int count = 0;
	
	public void input() {
		if (count >= 10) {
			System.out.println("입력 초과");
			return;
		}
		
		list[count] = new UserVo();
		
		System.out.println("이름을 입력해주세요.");
		list[count].setName(sc.next()); // UserVo.name에 접근할수가 없기 때문에 set을 통하여 값을 입력 (private)
		
		System.out.println("점수를 입력해주세요.");
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
	//private User user = new User(); // UserService 클래스가 실행될때마다 새로운 객체를 생성
	
	public UserService(User user) {
		this.user = user;
	}
	
	public void print() {
		//UserVo[] data = user.getList();
		
		System.out.println("\n성적 리스트");
		
		for (int i = 0; i < user.getCount(); i++) {
			//UserVo vo = data[i];
			UserVo vo = user.getList()[i]; // 위의 주석 두줄을 한번에 처리
			
			System.out.println(vo.getName() + " : " + vo.getScore());
		}
	}
}

public class UserApp {

	public static void main(String[] args) {
		User uu = new User();
		UserService us = new UserService(uu);
		//UserService us = new UserService(); // [컴파일 오류] 인자가 없는 생성자가 없기 때문에 오류
		
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
			
			switch(ch) {
			case 1 : uu.input(); break;
			case 2 : us.print(); break;
			}
		}
		
		sc.close();

	}

}