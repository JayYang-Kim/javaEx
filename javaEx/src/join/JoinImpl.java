package join;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JoinImpl implements Join {
	private List<JoinVO> list = new ArrayList<>(); // 데이터 저장
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private boolean loginChk;
	private JoinVO data;
	
	@Override
	public void join() {
		System.out.println("회원가입");
		
		JoinVO vo = new JoinVO();
		
		try {
			System.out.println("아이디를 입력해주세요.");
			vo.setId(br.readLine());
			
			for (int i = 0; i < list.size(); i++) {
				if (vo.getId().equals(list.get(i).getId())) {
					System.out.println(vo.getId() + "는 중복된 아이디 입니다.");
					join();
				}
			}
			
			System.out.println("패스워드를 입력해주세요.");
			vo.setPassword(br.readLine());
			
			System.out.println("이름을 입력해주세요.");
			vo.setName(br.readLine());
			
			System.out.println("생년월일을 입력해주세요.");
			vo.setBirth(br.readLine());
			
			list.add(vo);
			
			System.out.println("축하합니다~!! 회원가입 되셨습니다.");
			
			System.out.println("아이디 : " + vo.getId());
			System.out.println("비밀번호 : " + vo.getPassword());
			System.out.println("이름 : " + vo.getName());
			System.out.println("생년월일 : " + vo.getBirth());	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void logIn() {
		System.out.println("로그인");
		
		String id;
		String pw;
		
		if (this.loginChk == true) {
			System.out.println("로그인되어 있는 상태입니다.");
			return;
		}
		
		try {
			System.out.println("아이디를 입력해주세요.");
			id = br.readLine();
			System.out.println("비밀번호를 입력해주세요.");
			pw = br.readLine();
			
			for (JoinVO v : list) {
				if (v.getId().equals(id) && v.getPassword().equals(pw)) {
					System.out.println("로그인 성공했습니다.");
					this.data = v;
					
					System.out.println("이름 : " + data.getName());
					System.out.println("생년월일 : " + data.getBirth());	
					
					this.loginChk = true;
					
					break;
				} else {
					System.out.println("로그인 실패했습니다.");
					break;
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logOut() {
		System.out.println("로그아웃");
		
		if (this.loginChk == false) {
			System.out.println("로그인을 해주세요.");
		} else if (this.loginChk == true) {
			this.loginChk = false;
			
			System.out.println("로그아웃 되었습니다.");
		}
	}

	@Override
	public void update() {
		System.out.println("회원정보 수정");
		
		if (this.loginChk == true) {
			try {
				System.out.println("비밀번호를 입력해주세요.");
				data.setPassword(br.readLine());
				System.out.println("이름을 입력해주세요.");
				data.setName(br.readLine());
				System.out.println("생년월일을 입력해주세요.");
				data.setBirth(br.readLine());
				
				System.out.println("회원정보를 수정했습니다.");
				
				System.out.println("아이디 : " + data.getId());
				System.out.println("비밀번호 : " + data.getPassword());
				System.out.println("이름 : " + data.getName());
				System.out.println("생년월일 : " + data.getBirth());	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("로그인을 해주세요.");
	}

	@Override
	public void delete() {
		System.out.println("회원탈퇴");
		
		if (this.loginChk == true) {
			list.remove(data);
			System.out.println("회원탈퇴 처리되었습니다.");
			
			System.out.println(list.size());
		}
		
		System.out.println("로그인을 해주세요.");
	}

	@Override
	public void allList() {
		System.out.println("전체 회원 리스트");
	}
	
	// 아이디 체크용 메소드
	private JoinVO checkId(String id) {
		JoinVO vo = null;
		
		Iterator<JoinVO> it = list.iterator();
		
		while (it.hasNext()) {
			JoinVO data = it.next(); // 주소값을 받은 다음 다음으로 넘김
			
			if (data.getId().equals(id)) {
				vo = data;
				
				break;
			}
		}
		
		return vo;
	}
	
	// 비밀번호 체크용 메소드
	private JoinVO checkPassWord(String passWord) {
		JoinVO vo = null;
		
		Iterator<JoinVO> it = list.iterator();
		
		while (it.hasNext()) {
			JoinVO data = it.next(); // 주소값을 받은 다음 다음으로 넘김
			
			if (data.getPassword().equals(passWord)) {
				vo = data;
				
				break;
			}
		}
		
		return vo;
	}
}
