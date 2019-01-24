package score2.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 날짜 : 2018.12.26
 * 내용 : Score Interface 구현 
 * 기타 : 인터페이스 구현 시 메소드 재정의 필수
 * */

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map = new HashMap<>(); // 데이터 저장
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

	@Override
	public void input() {
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("학번을 입력해주세요");
			String hak = br.readLine();
			
			// 학번 중복 체크
			if (map.containsKey(hak)) {
				System.out.println("이미 생성된 학번입니다.");
				return;
			}
			
			System.out.println("이름을 입력해주세요");
			vo.setName(br.readLine());
			
			System.out.print("국어 점수? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 점수? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 점수? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			map.put(hak, vo);
			
			System.out.println("데이터를 저장했습니다.");
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
	}

	@Override
	public void print() {
		System.out.println("전체 인원 수 : " + map.size());
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		
		for (String s : map.keySet()) {
			ScoreVO vo = map.get(s);
			
			System.out.print(s + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
		}
		
		System.out.println();
	}

	@Override
	public void searchName() {
		try {
			System.out.println("찾으실 이름을 입력해주세요.");
			String name = br.readLine();
			
			for (String s : map.keySet()) {
				ScoreVO vo = map.get(s);
				
				if (vo.getName().startsWith(name)) {
					System.out.print(s + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getKor() + "\t");
					System.out.print(vo.getEng() + "\t");
					System.out.print(vo.getMat() + "\t");
					System.out.print(vo.total() + "\t");
					System.out.print(vo.ave() + "\n");
				} else {
					System.out.println("찾으시는 이름이 없습니다.");
				}
				
				System.out.println();
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void searchHak() {
		try {
			System.out.println("찾으실 학번을 입력해주세요.");
			String hak = br.readLine();
			
			if (!map.containsKey(hak)) {
				System.out.println("학번을 찾을 수 없습니다.");
				return;
			}
			
			ScoreVO vo = map.get(hak);
			
			System.out.print(hak + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void update() {
		try {
			System.out.println("수정할 학번을 입력해주세요.");
			String hak = br.readLine();
			
			ScoreVO vo = map.get(hak);
			
			if (vo == null) {
				System.out.println("존재하지 않은 학번입니다.");
			}
			
			System.out.print("이름을 입력해주세요.");
			vo.setName(br.readLine());
			
			System.out.print("국어 점수를 입력해주세요.");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 점수를 입력해주세요.");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 점수를 입력해주세요.");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("데이터 수정완료");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void delete() {
		try {
			System.out.println("삭제할 학번을 입력해 주세요.");
			
			String hak = br.readLine();
			
			if (!map.containsKey(hak)) {
				System.out.println("학번이 없습니다.");
				return;
			}
			
			map.remove(hak);
			
			System.out.println("데이터를 삭제했습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
