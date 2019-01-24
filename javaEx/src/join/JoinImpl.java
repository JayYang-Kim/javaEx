package join;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JoinImpl implements Join {
	private List<JoinVO> list = new ArrayList<>(); // ������ ����
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	private boolean loginChk;
	private JoinVO data;
	
	@Override
	public void join() {
		System.out.println("ȸ������");
		
		JoinVO vo = new JoinVO();
		
		try {
			System.out.println("���̵� �Է����ּ���.");
			vo.setId(br.readLine());
			
			for (int i = 0; i < list.size(); i++) {
				if (vo.getId().equals(list.get(i).getId())) {
					System.out.println(vo.getId() + "�� �ߺ��� ���̵� �Դϴ�.");
					join();
				}
			}
			
			System.out.println("�н����带 �Է����ּ���.");
			vo.setPassword(br.readLine());
			
			System.out.println("�̸��� �Է����ּ���.");
			vo.setName(br.readLine());
			
			System.out.println("��������� �Է����ּ���.");
			vo.setBirth(br.readLine());
			
			list.add(vo);
			
			System.out.println("�����մϴ�~!! ȸ������ �Ǽ̽��ϴ�.");
			
			System.out.println("���̵� : " + vo.getId());
			System.out.println("��й�ȣ : " + vo.getPassword());
			System.out.println("�̸� : " + vo.getName());
			System.out.println("������� : " + vo.getBirth());	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void logIn() {
		System.out.println("�α���");
		
		String id;
		String pw;
		
		if (this.loginChk == true) {
			System.out.println("�α��εǾ� �ִ� �����Դϴ�.");
			return;
		}
		
		try {
			System.out.println("���̵� �Է����ּ���.");
			id = br.readLine();
			System.out.println("��й�ȣ�� �Է����ּ���.");
			pw = br.readLine();
			
			for (JoinVO v : list) {
				if (v.getId().equals(id) && v.getPassword().equals(pw)) {
					System.out.println("�α��� �����߽��ϴ�.");
					this.data = v;
					
					System.out.println("�̸� : " + data.getName());
					System.out.println("������� : " + data.getBirth());	
					
					this.loginChk = true;
					
					break;
				} else {
					System.out.println("�α��� �����߽��ϴ�.");
					break;
				}
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void logOut() {
		System.out.println("�α׾ƿ�");
		
		if (this.loginChk == false) {
			System.out.println("�α����� ���ּ���.");
		} else if (this.loginChk == true) {
			this.loginChk = false;
			
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	}

	@Override
	public void update() {
		System.out.println("ȸ������ ����");
		
		if (this.loginChk == true) {
			try {
				System.out.println("��й�ȣ�� �Է����ּ���.");
				data.setPassword(br.readLine());
				System.out.println("�̸��� �Է����ּ���.");
				data.setName(br.readLine());
				System.out.println("��������� �Է����ּ���.");
				data.setBirth(br.readLine());
				
				System.out.println("ȸ�������� �����߽��ϴ�.");
				
				System.out.println("���̵� : " + data.getId());
				System.out.println("��й�ȣ : " + data.getPassword());
				System.out.println("�̸� : " + data.getName());
				System.out.println("������� : " + data.getBirth());	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("�α����� ���ּ���.");
	}

	@Override
	public void delete() {
		System.out.println("ȸ��Ż��");
		
		if (this.loginChk == true) {
			list.remove(data);
			System.out.println("ȸ��Ż�� ó���Ǿ����ϴ�.");
			
			System.out.println(list.size());
		}
		
		System.out.println("�α����� ���ּ���.");
	}

	@Override
	public void allList() {
		System.out.println("��ü ȸ�� ����Ʈ");
	}
	
	// ���̵� üũ�� �޼ҵ�
	private JoinVO checkId(String id) {
		JoinVO vo = null;
		
		Iterator<JoinVO> it = list.iterator();
		
		while (it.hasNext()) {
			JoinVO data = it.next(); // �ּҰ��� ���� ���� �������� �ѱ�
			
			if (data.getId().equals(id)) {
				vo = data;
				
				break;
			}
		}
		
		return vo;
	}
	
	// ��й�ȣ üũ�� �޼ҵ�
	private JoinVO checkPassWord(String passWord) {
		JoinVO vo = null;
		
		Iterator<JoinVO> it = list.iterator();
		
		while (it.hasNext()) {
			JoinVO data = it.next(); // �ּҰ��� ���� ���� �������� �ѱ�
			
			if (data.getPassword().equals(passWord)) {
				vo = data;
				
				break;
			}
		}
		
		return vo;
	}
}
