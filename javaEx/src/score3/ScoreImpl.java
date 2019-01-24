package score3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ScoreImpl implements Score {
	private Map<String, ScoreVO> map = new HashMap<>();
	// private Scanner sc=new Scanner(System.in);
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void input() {
		System.out.println("\n데이터 입력...");
		
		try {
			String hak;
			
			System.out.println("학번을 입력해주세요.");
			hak = br.readLine();
			
			if (map.containsKey(hak)) { // 학번 정보 데이터가 존재하면 true
				System.out.println("이미 생성된 학번입니다.");
				return;
			}
			
			ScoreVO vo = new ScoreVO();
			
			System.out.print("이름을 입력해주세요.");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			map.put(hak, vo);
			
			System.out.println("회원가입 완료");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	@Override
	public void print() {
		System.out.println("\n전체 리스트...");
		System.out.println("전체인원수 : " + map.size());
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			
			System.out.println(hak);
			System.out.println(vo.getName());
			System.out.println(vo.getKor());
			System.out.println(vo.getEng());
			System.out.println(vo.getMat());
			System.out.println(vo.getTot());
		}
		
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("\n이름 검색...");
		
		try {
			String name;
			
			System.out.println("이름을 입력해주세요.");
			name = br.readLine();
			
			Iterator<String> it = map.keySet().iterator();
			
			while (it.hasNext()) {
				String hak = it.next();
				ScoreVO vo = map.get(hak);
				
				if (vo.getName().startsWith(name)) {
					System.out.println(hak);
					System.out.println(vo.getName());
					System.out.println(vo.getKor());
					System.out.println(vo.getEng());
					System.out.println(vo.getMat());
					System.out.println(vo.getTot());
				}
				
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void searchHak() {
		System.out.println("\n학번 검색...");
		
		try {
			String hak;
			
			System.out.println("학번을 입력해주세요.");
			hak = br.readLine();
			
			if (!map.containsKey(hak)) { // 학번 정보 데이터가 존재하면 true
				System.out.println("존재하지 않는 학번입니다.");
				return;
			}
			
			ScoreVO vo = map.get(hak); // null을 리턴하면 존재하지 않는다.
			
			System.out.println(hak);
			System.out.println(vo.getName());
			System.out.println(vo.getKor());
			System.out.println(vo.getEng());
			System.out.println(vo.getMat());
			System.out.println(vo.getTot());
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void update() {
		System.out.println("\n데이터 수정...");
		
		try {
			String hak;
			
			System.out.println("학번을 입력해주세요.");
			hak = br.readLine();
			
			ScoreVO vo = map.get(hak); // null을 리턴하면 존재하지 않는다.
			
			if (vo == null) {
				System.out.println("존재하지 않는 학번입니다.");
				return;
			}
			
			System.out.print("이름을 입력해주세요.");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("데이터 수정완료");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		try {
			String hak;
			
			System.out.println("학번을 입력해주세요.");
			hak = br.readLine();
			
			if (!map.containsKey(hak)) {
				System.out.println("존재하지 않는 학번입니다.");
				return;
			}
			
			map.remove(hak);
			
			System.out.println("데이터 삭제완료");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
