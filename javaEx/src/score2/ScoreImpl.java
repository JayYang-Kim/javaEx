package score2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* 날짜 : 2018.12.24
 * 내용 : Score Interface 구현 
 * 기타 : 인터페이스 구현 시 메소드 재정의 필수
 * */

public class ScoreImpl implements Score {
	private List<ScoreVO> list = new ArrayList<>(); // 데이터 저장
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력

	@Override
	public void input() {
		try {
			ScoreVO vo = new ScoreVO();
			
			System.out.println("학번을 입력해주세요");
			vo.setHak(br.readLine());
			
			System.out.println("이름을 입력해주세요");
			vo.setName(br.readLine());
			
			vo.setKor(inputScroe("국어"));
			vo.setEng(inputScroe("영어"));
			vo.setMat(inputScroe("수학"));
			
			list.add(vo);
			
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
		// 이름순 정렬 (오름차순)
		System.out.println("전체 인원 수 : " + list.size());
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		
		Comparator<ScoreVO> c = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}; 
		
		Collections.sort(list, c);
		
		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
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
		System.out.println("이름 검색");
		
		String name;
		
		try {
			System.out.println("검색할 이름을 입력해주세요.");
			name = br.readLine();
			
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			
			for (ScoreVO vo : list) {
				if (vo.getName().startsWith(name)) {
					System.out.print(vo.getHak() + "\t");
					System.out.print(vo.getName() + "\t");
					System.out.print(vo.getKor() + "\t");
					System.out.print(vo.getEng() + "\t");
					System.out.print(vo.getMat() + "\t");
					System.out.print(vo.total() + "\t");
					System.out.print(vo.ave() + "\n");
				}
			}
			
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void searchHak() {
		String hak;
		
		try {
			System.out.println("검색할 학번을 입력해주세요.");
			hak = br.readLine(); // readLine (checked exception)
			
			ScoreVO vo = readScore(hak);
			
			if (vo == null) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}
			
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}

	@Override
	public void update() {
		System.out.println("수정");
		
		String hak;
		
		try {
			System.out.println("수정할 학번을 입력해주세요.");
			hak = br.readLine(); // readLine (checked exception)
			
			ScoreVO vo = readScore(hak);
			
			if (vo == null) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}
			
			System.out.println("이름을 입력해주세요.");
			vo.setName(br.readLine());
			
			vo.setKor(inputScroe("국어"));
			vo.setEng(inputScroe("영어"));
			vo.setMat(inputScroe("수학"));
			
			System.out.println("데이터를 수정했습니다.");
		} catch (IOException e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
	}

	@Override
	public void delete() {
		String hak;
		
		try {
			System.out.println("삭제할 학번을 입력해주세요.");
			hak = br.readLine(); // readLine (checked exception)
			
			ScoreVO vo = readScore(hak);
			
			if (vo == null) {
				System.out.println("등록된 정보가 없습니다.");
				return;
			}
			
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
			
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
			
			System.out.println("삭제하시겠습니까? [Y/N]");
			
			char c = br.readLine().charAt(0);
			
			if (c == 'N' || c != 'Y') {
				return;
			}
			
			list.remove(vo);
			
			System.out.println("데이터를 삭제했습니다.");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
		System.out.println();
	}
	
	// 점수 확인용 메소드
	private int inputScroe(String title) throws Exception {
		int n = 0;
		
		try {
			System.out.print(title + " 점수는? ");
			n = Integer.parseInt(br.readLine()); // String => int형으로 변환
			
			// 점수가 0 ~ 100사이가 아닐 경우 예외 발생 처리
			if (n < 0 || n > 100) {
				throw new Exception("점수는 0 ~ 100사이만 입력 가능합니다.");
			}
		} catch (NumberFormatException e) { // 점수가 숫자가 아닐 경우 예외 발생
			throw new Exception("점수는 숫자만 가능합니다.");
		} catch (Exception e) {
			throw e;
		}
		
		return n;
	}
	
	// 학번 확인용 메소드
	private ScoreVO readScore(String hak) {
		ScoreVO vo = null;
				
		Iterator<ScoreVO> it = list.iterator();
		
		while (it.hasNext()) {
			ScoreVO data = it.next();
			
			if (data.getHak().equals(hak)) {
				vo = data;
				
				break;
			}
		}
		
		return vo;
	}

	@Override
	public void sortTot() {
		// 총점 정렬 (내림차순)
		System.out.println("전체 인원 수 : " + list.size());

		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");

		Comparator<ScoreVO> c = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return -(o1.total() - o2.total());
			}

		};

		Collections.sort(list, c);

		for (ScoreVO vo : list) {
			System.out.print(vo.getHak() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(vo.total() + "\t");
			System.out.print(vo.ave() + "\n");
		}

		System.out.println();
	}
}
