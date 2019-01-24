package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberImpl implements Member {
	private Scanner sc=new Scanner(System.in);
	private List<MemberVO> listMember=new ArrayList<>();
	private Rental rent;
	
	public MemberImpl(Rental rent) {
		this.rent = rent;
	}
	
	@Override
	public void insertMember() {
		System.out.println("\n>> 회원 가입 <<");
		
		try {
			MemberVO vo=new MemberVO();
			
			System.out.print("아이디?");
			vo.setId(sc.nextLine());
			
			if(readMember(vo.getId())!=null) {
				System.out.println("등록된 아이디 입니다.\n");
				return;
			}

			System.out.print("패스워드?");
			vo.setPwd(sc.nextLine());

			System.out.print("이름?");
			vo.setName(sc.nextLine());

			System.out.print("전화번호?");
			vo.setTel(sc.nextLine());

			listMember.add(vo);
			
			System.out.println("회원 가입이 성공 했습니다...\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override
	public void updateMember(String id) {
		System.out.println("\n>> 회원 정보 수정 <<");
		
		try {
			String pwd;
			
			System.out.print("패스워드 다시 입력?");
			pwd=sc.nextLine();
			
			MemberVO vo=readMember(id);
			
			if(vo==null || ! vo.getPwd().equals(pwd)) {
				System.out.println("패스워드가 일치 하지 않습니다.\n");
				return;
			}

			System.out.print("수정할 패스워드?");
			vo.setPwd(sc.nextLine());

			System.out.print("전화번호?");
			vo.setTel(sc.nextLine());

			System.out.println("회원 정보가 변경 되었습니다...\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public boolean removeMember(String id) {
		List<RentalVO> list=rent.listRentalId(id);
		if(list.size()>0) {
			System.out.println("현재 대여중인 도서가 존재합니다. 모두 반납후 탈퇴가 가능합니다.\n");
			return false;
		}
		
		MemberVO vo=readMember(id);
		rent.removeRentalId(id);
		listMember.remove(vo);
		
		System.out.println("회원탈퇴가 정상적으로 처리 되었습니다.\n");
		
		return true;
	}

	@Override
	public MemberVO readMember(String id) {
		MemberVO vo=null;
		for(MemberVO v:listMember) {
			if(v.getId().equals(id)) {
				vo=v;
				break;
			}
		}
		return vo;
	}

	@Override
	public MemberVO login() {
		System.out.println("\n>> 로그인 <<");
		String id, pwd;
		MemberVO vo=null;
		
		try {
			System.out.print("아이디?");
			id=sc.nextLine();

			System.out.print("패스워드?");
			pwd=sc.nextLine();
			
			if(id.equals("admin") && pwd.equals("admin")) {
				vo=new MemberVO();
				vo.setId("admin");
				vo.setName("관리자");
				return vo;
			}
			
			vo=readMember(id);
			if(vo==null || !vo.getPwd().equals(pwd)) {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
				return null;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return vo;
	}
	
	@Override
	public void searchIdMember() {
		System.out.println("\n>> 아이디 검색 <<");
		String id;
		MemberVO vo=null;
		
		try {
			System.out.print("검색할 아이디?");
			id=sc.nextLine();

			vo=readMember(id);
			if(vo==null) {
				System.out.println("아이디가 존재하지 않습니다.\n");
				return;
			}
			
			System.out.println("아이디\t이름\t전화번호");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.println(vo.getTel());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void listMember() {
		System.out.println("\n>> 회원 리스트 <<");
		System.out.println("아이디\t이름\t전화번호");
		
		for(MemberVO vo:listMember) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.println(vo.getTel());
		}
		System.out.println();
		
	}

}
