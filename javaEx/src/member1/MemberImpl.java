package member1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class MemberImpl implements Member {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private List<MemberVO> list=new LinkedList<MemberVO>(); 
	private MemberVO loginMember; // 로그인 계정 저장용 변수
	
	// 생성자
	// MemberImpl 클래스 객체 생성 시 관리자 계정 생성
	public MemberImpl() {
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPwd("admin");
		vo.setName("관리자");
		vo.setBirth("2000-10-10");
		list.add(vo);
	}
	
	@Override // interface 메소드 재정의 (필수)
	public void insert() {
		System.out.println("\n회원 가입...");
		
		try {
			MemberVO vo=new MemberVO(); // MemberVO 객체 생성
			
			System.out.print("아이디 ? ");
			vo.setId(br.readLine());
			
			// 아이디 중복 체크
			if(readMember(vo.getId())!=null) {
				System.out.println("등록된 아이디 입니다.\n");
				return;
			}

			System.out.print("패스워드 ? ");
			vo.setPwd(br.readLine());

			System.out.print("이름 ? ");
			vo.setName(br.readLine());

			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());
			
			list.add(vo);
			System.out.println("회원 가입을 축하합니다. 로그인 하세요\n");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override // interface 메소드 재정의 (필수)
	public void update() {
		// 로그인 체크
		if(loginMember==null) {
			System.out.println("\n로그인이 필요 합니다.");
			return;
		}
		
		System.out.println("\n회원 정보 수정...");
		
		try {
			MemberVO vo=readMember(loginMember.getId()); // 로그인된 주소갑 전달
			
			System.out.print("패스워드를 다시 입력 하세요 ? ");
			String pwd = br.readLine();
			
			// 패스워드 체크
			if(! vo.getPwd().equals(pwd)) {
				System.out.println("패스워드가 일치하지 않습니다.\n");
				return;
			}

			System.out.print("수정할 패스워드 ? ");
			vo.setPwd(br.readLine());

			System.out.print("수정할 생년월일 ? ");
			vo.setBirth(br.readLine());
			
			System.out.println("회원 정보를 수정했습니다.\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override // interface 메소드 재정의 (필수)
	public void delete() {
		if(loginMember==null) {
			System.out.println("\n로그인이 필요 합니다.");
			return;
		}
		
		if(loginMember.getId().equals("admin")) {
			System.out.println();
			return;
		}
		
		System.out.println("\n회원 탈퇴...");
		
		try {
			MemberVO vo=readMember(loginMember.getId());
			
			System.out.print("패스워드를 다시 입력 하세요 ? ");
			String pwd = br.readLine();
			
			if(! vo.getPwd().equals(pwd)) {
				System.out.println("패스워드가 일치하지 않습니다.\n");
				return;
			}
			
			list.remove(vo);
			System.out.println("회원탈퇴가 처리 되었습니다.\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		loginMember = null;
	}

	@Override // interface 메소드 재정의 (필수)
	public void list() {
		if(loginMember==null || !loginMember.getId().equals("admin")) {
			System.out.println("\n관리자 메뉴입니다.");
			return;
		}
		
		System.out.println("\n회원 리스트...");
		System.out.println("회원수 : "+list.size());
		for(MemberVO vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getBirth()+"\n");
		}
		System.out.println();
	}

	@Override // interface 메소드 재정의 (필수)
	public void login() {
		System.out.println("\n회원 로그인...");
		String id, pwd;
		
		try {
			System.out.print("아이디 ? ");
			id=br.readLine();
			
			System.out.print("패스워드 ? ");
			pwd=br.readLine();
			
			MemberVO vo = readMember(id); // 아이디 정보가 있는지 확인
			if(vo!=null) { // 아이디 정보가 있을 경우 패스워드 비교
				if(vo.getPwd().equals(pwd)) { 
					loginMember = vo; // 패스워드가 일치할 경우 주소값을 전달
					return;
				}
			}
			
			System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override // interface 메소드 재정의 (필수)
	public void logout() {
		loginMember = null;
		
		System.out.println("로그아웃 되었습니다.\n");
	}

	@Override // interface 메소드 재정의 (필수)
	public MemberVO loginMember() {
		return loginMember;
	}
	
	private MemberVO readMember(String id) {
		MemberVO vo=null;
		
		for(MemberVO data : list) {
			if(data.getId().equals(id)) {
				vo=data;
				break;
			}
		}
		
		return vo;
	}

}
