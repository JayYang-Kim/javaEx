package score1;

import java.util.Scanner;

/* 날짜 : 2018.12.18
 * 내용 : 
 * 기타 :  
 * */

public class ScoreService extends Score {
	private Scanner sc = new Scanner(System.in);
	private int count;
	
	public void input() {
		System.out.println("데이터 입력");
		
		if (count >= getSize()) { // 배열의 크기가 꽉찬 경우 사이즈를 10개씩 늘린다.
			allocation(getSize() + 10);
		}
		
		ScoreVO vo = new ScoreVO();
		
		// 데이터 입력
		System.out.println("학번을 입력해주세요.");
		vo.setHak(sc.next());
		
		System.out.println("이름을 입력해주세요.");
		vo.setName(sc.next());
		
		System.out.println("국어 점수를 입력해주세요.");
		vo.setKor(sc.nextInt());
		
		System.out.println("영어 점수를 입력해주세요.");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학 점수를 입력해주세요.");
		vo.setMat(sc.nextInt());
		
		ScoreVO[] list = getList(); // Score객체에 생성된 list변수의 주소를 대입
		list[count++] = vo;
		
		System.out.println("데이터를 추가했습니다.");
	}
	
	public void print() {
		System.out.println("데이터 출력");
		
		ScoreVO[] list = getList();
		System.out.println("전체 인원수 : " + count);
		
		// 인원 수 만큼 반복 처리
		for (int i = 0; i < count; i++) {
			System.out.println(list[i]);
		}
		
		System.out.println();
	}
	
	public void searchHak() {
		System.out.println("\n학번 검색");
		
		String hak;
		System.out.println("검색할 학번을 입력해주세요.");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if (vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		
		System.out.println(vo + "\n");
	}
	
	public void searchName() {
		System.out.println("이름 검색");
		
		String name;
		
		System.out.println("검색할 이름을 입력해주세요.");
		
		name = sc.next();
		
		ScoreVO[] list = getList();
		
		for (int i = 0; i < count; i++) {
			/*if(list[i].getName().indexOf(name) >= 0) {
				
			}*/
			if (list[i].getName().startsWith(name)) { // (String) startsWith : 앞자리가 같은걸 찾기
				System.out.println(list[i]);
			}
		}
		
		System.out.println();
	}
	
	public void update() {
		System.out.println("데이터 수정");
		
		String hak;
		System.out.println("수정할 학번을 입력해주세요.");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak); // 일치한 학번의 주소값을 vo에 대입
		
		if (vo == null) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}

		// 주소값을 vo에 대입하여 받아서 해당 되는 주소의 값을 재입력
		System.out.println("이름을 입력해주세요.");
		vo.setName(sc.next());

		System.out.println("국어 점수를 입력해주세요.");
		vo.setKor(sc.nextInt());

		System.out.println("영어 점수를 입력해주세요.");
		vo.setEng(sc.nextInt());

		System.out.println("수학 점수를 입력해주세요.");
		vo.setMat(sc.nextInt());
		
		System.out.println("데이터를 수정했습니다.");
	}
	
	public void delete() {
		System.out.println("데이터 삭제");
		
		String hak;
		char ch;
		
		System.out.println("삭제할 학번을 입력해주세요.");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		if (vo == null) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}
		
		// 삭제전 데이터 출력
		System.out.println(vo);
		
		System.out.println("삭제하시겠습니까? [Y/N]");
		ch = sc.next().charAt(0);
		
		if (ch != 'Y' && ch != 'N') {
			return;
		}
		
		int idx = index(hak);
		if (idx == -1) {
			return;
		}
		
		ScoreVO[] list = getList();
		for (int i = idx; i < count-1; i++) {
			list[i] = list[i+1];
		}
		
		count--;
		list[count] = null;
		
		System.out.println("데이터를 삭제했습니다.");
	}
	
	// 동일한 학번의 주소값 찾기
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		ScoreVO[] list = getList();
		for (int i = 0; i < count; i++) {
			if (list[i].getHak().equals(hak)) { // String이기 때문에 equals로 비교하면 값 비교
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	// 동일한 학번의 위치 찾기
	private int index(String hak) {
		int idx = -1; // 동일한 학점이 없을 경우
		
		ScoreVO[] list = getList();
		for (int i = 0; i < count; i++) {
			if (list[i].getHak().equals(hak)) {
				idx = i;
				break;
			}
		}
		
		return idx;
	}

}