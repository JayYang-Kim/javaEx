package member1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class MemberImpl implements Member {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	private List<MemberVO> list=new LinkedList<MemberVO>(); 
	private MemberVO loginMember; // �α��� ���� ����� ����
	
	// ������
	// MemberImpl Ŭ���� ��ü ���� �� ������ ���� ����
	public MemberImpl() {
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPwd("admin");
		vo.setName("������");
		vo.setBirth("2000-10-10");
		list.add(vo);
	}
	
	@Override // interface �޼ҵ� ������ (�ʼ�)
	public void insert() {
		System.out.println("\nȸ�� ����...");
		
		try {
			MemberVO vo=new MemberVO(); // MemberVO ��ü ����
			
			System.out.print("���̵� ? ");
			vo.setId(br.readLine());
			
			// ���̵� �ߺ� üũ
			if(readMember(vo.getId())!=null) {
				System.out.println("��ϵ� ���̵� �Դϴ�.\n");
				return;
			}

			System.out.print("�н����� ? ");
			vo.setPwd(br.readLine());

			System.out.print("�̸� ? ");
			vo.setName(br.readLine());

			System.out.print("������� ? ");
			vo.setBirth(br.readLine());
			
			list.add(vo);
			System.out.println("ȸ�� ������ �����մϴ�. �α��� �ϼ���\n");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override // interface �޼ҵ� ������ (�ʼ�)
	public void update() {
		// �α��� üũ
		if(loginMember==null) {
			System.out.println("\n�α����� �ʿ� �մϴ�.");
			return;
		}
		
		System.out.println("\nȸ�� ���� ����...");
		
		try {
			MemberVO vo=readMember(loginMember.getId()); // �α��ε� �ּҰ� ����
			
			System.out.print("�н����带 �ٽ� �Է� �ϼ��� ? ");
			String pwd = br.readLine();
			
			// �н����� üũ
			if(! vo.getPwd().equals(pwd)) {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.\n");
				return;
			}

			System.out.print("������ �н����� ? ");
			vo.setPwd(br.readLine());

			System.out.print("������ ������� ? ");
			vo.setBirth(br.readLine());
			
			System.out.println("ȸ�� ������ �����߽��ϴ�.\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override // interface �޼ҵ� ������ (�ʼ�)
	public void delete() {
		if(loginMember==null) {
			System.out.println("\n�α����� �ʿ� �մϴ�.");
			return;
		}
		
		if(loginMember.getId().equals("admin")) {
			System.out.println();
			return;
		}
		
		System.out.println("\nȸ�� Ż��...");
		
		try {
			MemberVO vo=readMember(loginMember.getId());
			
			System.out.print("�н����带 �ٽ� �Է� �ϼ��� ? ");
			String pwd = br.readLine();
			
			if(! vo.getPwd().equals(pwd)) {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.\n");
				return;
			}
			
			list.remove(vo);
			System.out.println("ȸ��Ż�� ó�� �Ǿ����ϴ�.\n");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		loginMember = null;
	}

	@Override // interface �޼ҵ� ������ (�ʼ�)
	public void list() {
		if(loginMember==null || !loginMember.getId().equals("admin")) {
			System.out.println("\n������ �޴��Դϴ�.");
			return;
		}
		
		System.out.println("\nȸ�� ����Ʈ...");
		System.out.println("ȸ���� : "+list.size());
		for(MemberVO vo : list) {
			System.out.print(vo.getId()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getBirth()+"\n");
		}
		System.out.println();
	}

	@Override // interface �޼ҵ� ������ (�ʼ�)
	public void login() {
		System.out.println("\nȸ�� �α���...");
		String id, pwd;
		
		try {
			System.out.print("���̵� ? ");
			id=br.readLine();
			
			System.out.print("�н����� ? ");
			pwd=br.readLine();
			
			MemberVO vo = readMember(id); // ���̵� ������ �ִ��� Ȯ��
			if(vo!=null) { // ���̵� ������ ���� ��� �н����� ��
				if(vo.getPwd().equals(pwd)) { 
					loginMember = vo; // �н����尡 ��ġ�� ��� �ּҰ��� ����
					return;
				}
			}
			
			System.out.println("���̵� �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.\n");
			
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override // interface �޼ҵ� ������ (�ʼ�)
	public void logout() {
		loginMember = null;
		
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.\n");
	}

	@Override // interface �޼ҵ� ������ (�ʼ�)
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
