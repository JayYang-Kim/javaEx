package yangStudy;

import java.util.Scanner;

/* 날짜 : 2018.12.19
 * 내용 : 입력, 출력, 학점검색, 수정, 삭제 기능 정의
 * 기타 : super class : Score / sub class : ScoreService
 * 관련 class : ScoreApp, Score, ScoreVO   
 * */

public class ScoreService extends Score {
	private Scanner sc = new Scanner(System.in);
	private int count; // 인원 수 체크
	// 디폴트 생성자가 생성되어 super class의 생성자를 호출
	
	public void input() {
		// list 배열의 길이를 넘거나 같을경우, 배열크기 증가
		if (count >= getSize()) {
			allocation(getSize() + 5);
		}
		
		ScoreVO sv = new ScoreVO(); // 객체 생성
		
		System.out.println("학번을 입력해주세요.");
		sv.setHakbun(sc.next());
		
		System.out.println("이름을 입력해주세요.");
		sv.setName(sc.next());
		
		System.out.println("국어 점수를 입력해주세요.");
		sv.setKor(sc.nextInt());
		
		System.out.println("영어 점수를 입력해주세요.");
		sv.setEng(sc.nextInt());
		
		System.out.println("수학 점수를 입력해주세요.");
		sv.setMat(sc.nextInt());
		
		// Score list변수 주소값을 호출하여 대입
		ScoreVO[] list = getList();
		list[count++] = sv; // list[count++]에 입력한 데이터 대입, 입력 후 count + 1 증가
	}
	
	public void	print() {
		ScoreVO[] list = getList();
		
		System.out.println("전체 인원 수 : " + count);
		
		System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
		// 전체 인원 수 만큼 반복
		for (int i = 0; i < count; i++) {
			System.out.println(list[i].toString());
		}
	}
	
	public void searchHakbun() {
		String hakbun;

		System.out.println("학번을 입력해주세요.");
		hakbun = sc.next();
		
		ScoreVO vo = readHakbun(hakbun);
		
		if (vo == null) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		
		System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println(vo.toString());
	}
	
	public void update() {
		String hakbun;
		
		System.out.println("학번을 입력해주세요.");
		hakbun = sc.next();
		
		// 입력한 학번이 있는지 확인 후 있는 경우 vo에 주소값 대입
		ScoreVO vo = readHakbun(hakbun);
		
		if (vo == null) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		
		// 학번이 있는 경우 진행
		System.out.println("이름을 입력해주세요.");
		vo.setName(sc.next());
		
		System.out.println("국어 점수를 입력해주세요.");
		vo.setKor(sc.nextInt());
		
		System.out.println("영어 점수를 입력해주세요.");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학 점수를 입력해주세요.");
		vo.setMat(sc.nextInt());
		
		System.out.println("정보를 수정했습니다.");
	}
	
	public void delete() {
		System.out.println("삭제");
		
		String hakbun;
		char choice;

		System.out.println("학번을 입력해주세요.");
		hakbun = sc.next();

		// 입력한 학번이 있는지 확인 후 있는 경우 vo에 주소값 대입
		ScoreVO vo = readHakbun(hakbun);

		if (vo == null) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		
		System.out.println("학번\t이름\t국어점수\t영어점수\t수학점수\t총점\t평균");
		System.out.println(vo.toString());
		
		System.out.println("삭제하시겠습니까? [Y/N]");
		choice = sc.next().charAt(0);
		
		// 입력값이 Y가 아니고 N이면 나감
		if (choice != 'Y' && choice == 'N') {
			return;
		}
		
		// 삭제할 위치 찾기
		int index = index(hakbun);
		
		// 학번이 없는 경우
		if (index == -1) {
			System.out.println("존재하지 않는 학번입니다.");
			return;
		}
		
		ScoreVO[] list = getList();
		for (int i = index; i < count - 1; i++) {
			list[i] = list[i + 1];
		}
		
		count--;
		list[count] = null;
		
		
		System.out.println("데이터를 삭제했습니다.");
	}
	
	private ScoreVO readHakbun(String hakbun) {
		ScoreVO vo = null;
		
		ScoreVO[] list = getList();
		// 총 인원 수 만큼 반복
		for (int i = 0; i < count; i++) {
			if (list[i].getHakbun().equals(hakbun)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	private int index(String hakbun) {
		int index = -1; // 학번이 없을 경우 리턴 초기값
		
		ScoreVO[] list = getList();
		for (int i = 0; i < count; i++) {
			if (list[i].getHakbun().equals(hakbun)) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
}
