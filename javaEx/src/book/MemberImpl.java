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
		System.out.println("\n>> ȸ�� ���� <<");
		
		try {
			MemberVO vo=new MemberVO();
			
			System.out.print("���̵�?");
			vo.setId(sc.nextLine());
			
			if(readMember(vo.getId())!=null) {
				System.out.println("��ϵ� ���̵� �Դϴ�.\n");
				return;
			}

			System.out.print("�н�����?");
			vo.setPwd(sc.nextLine());

			System.out.print("�̸�?");
			vo.setName(sc.nextLine());

			System.out.print("��ȭ��ȣ?");
			vo.setTel(sc.nextLine());

			listMember.add(vo);
			
			System.out.println("ȸ�� ������ ���� �߽��ϴ�...\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override
	public void updateMember(String id) {
		System.out.println("\n>> ȸ�� ���� ���� <<");
		
		try {
			String pwd;
			
			System.out.print("�н����� �ٽ� �Է�?");
			pwd=sc.nextLine();
			
			MemberVO vo=readMember(id);
			
			if(vo==null || ! vo.getPwd().equals(pwd)) {
				System.out.println("�н����尡 ��ġ ���� �ʽ��ϴ�.\n");
				return;
			}

			System.out.print("������ �н�����?");
			vo.setPwd(sc.nextLine());

			System.out.print("��ȭ��ȣ?");
			vo.setTel(sc.nextLine());

			System.out.println("ȸ�� ������ ���� �Ǿ����ϴ�...\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public boolean removeMember(String id) {
		List<RentalVO> list=rent.listRentalId(id);
		if(list.size()>0) {
			System.out.println("���� �뿩���� ������ �����մϴ�. ��� �ݳ��� Ż�� �����մϴ�.\n");
			return false;
		}
		
		MemberVO vo=readMember(id);
		rent.removeRentalId(id);
		listMember.remove(vo);
		
		System.out.println("ȸ��Ż�� ���������� ó�� �Ǿ����ϴ�.\n");
		
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
		System.out.println("\n>> �α��� <<");
		String id, pwd;
		MemberVO vo=null;
		
		try {
			System.out.print("���̵�?");
			id=sc.nextLine();

			System.out.print("�н�����?");
			pwd=sc.nextLine();
			
			if(id.equals("admin") && pwd.equals("admin")) {
				vo=new MemberVO();
				vo.setId("admin");
				vo.setName("������");
				return vo;
			}
			
			vo=readMember(id);
			if(vo==null || !vo.getPwd().equals(pwd)) {
				System.out.println("���̵� �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.\n");
				return null;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return vo;
	}
	
	@Override
	public void searchIdMember() {
		System.out.println("\n>> ���̵� �˻� <<");
		String id;
		MemberVO vo=null;
		
		try {
			System.out.print("�˻��� ���̵�?");
			id=sc.nextLine();

			vo=readMember(id);
			if(vo==null) {
				System.out.println("���̵� �������� �ʽ��ϴ�.\n");
				return;
			}
			
			System.out.println("���̵�\t�̸�\t��ȭ��ȣ");
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.println(vo.getTel());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void listMember() {
		System.out.println("\n>> ȸ�� ����Ʈ <<");
		System.out.println("���̵�\t�̸�\t��ȭ��ȣ");
		
		for(MemberVO vo:listMember) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.println(vo.getTel());
		}
		System.out.println();
		
	}

}
