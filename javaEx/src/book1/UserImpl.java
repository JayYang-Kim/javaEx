package book1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class UserImpl implements UserService{
	private BufferedReader br;
	private List<UserVO> userList;
	
	public UserImpl(ListVO list) {
		br = new BufferedReader(new InputStreamReader(System.in));
		userList = list.getUserList();
		
	}
	
	
	@Override
	public void join() {
		ExceptionTest et = new ExceptionTest();
		while(true) {
			try {
				
					UserVO user = new UserVO();
					String id,birth,phoneNum;
					
					System.out.print("\nȸ�� ����...");
					System.out.print("id ? :");
					id=br.readLine();
					if(confirmUser(id) == null)
						user.setId(id);
					else
						throw new Exception("id �ߺ��� �ֽ��ϴ�.");	
													
					System.out.print("password ? :");
					user.setPassWord(br.readLine());
					
					System.out.print("name ? :");
					user.setName(br.readLine());
					
					System.out.print("birth ? :");
					birth = br.readLine();
					et.ESetBirth(birth); //���� Ȯ��
					user.setBirth(et.EGetBirth()); //������ ����
					
					System.out.print("phoneNum ? :");
					phoneNum = br.readLine();
					et.ESetPhoneNum(phoneNum);	//���� Ȯ��
					user.setPhoneNum(et.EGetPhoneNum());	//������ ����
					
					//user.setbookList() �� null�� �ڵ� �ʱ�ȭ
					
					userList.add(user);
					System.out.println("!!!!!!ȸ������ �Ϸ�!!!!!!!");
					return;
			
			
			} catch(BookException e) {
				System.out.println(e.toString());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch(Exception e) {
				
			}
		}
	}

	//�α��� �Ǿ��ִٸ� vo�� ������.
	@Override
	public void userDelete(UserVO vo) {
		try {
			String ch;
			System.out.println("\n ���� .... ");
			
			if(vo == null) {
				System.out.println("�α��� ���� ���ֽʽÿ�.");
				return;
			}
			UserVO v = confirmUser(vo.getId());
			if(v == null) {
				System.out.println("�ش�Ǵ� ���̵� �������� �ʽ��ϴ�.");
				return;
			}
				
			System.out.print("������ Ȯ���մϱ� ?[Y/N] :");
			ch = br.readLine();
			if(ch.equals("Y") ||ch.equals("y")) {
				userList.remove(v);
				vo = null;
				
			}
			else {
				return;
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	//id �ߺ� üũ �޼ҵ� (���� ����� �����ϸ� false , ���� ����� �������� ������ true)
	public UserVO confirmUser(String id) {
		UserVO vo = null;
		
		for(UserVO uv : userList) {
			if(id.equals(uv.getId())) {
				vo = uv;
				break;
			}
					
		}
		return vo;
	}
	
	@Override
	public void update(UserVO vo) {		
		
		System.out.println("\nȸ�� ���� ����...");
		
		try {	
			
			System.out.print("�н����带 �ٽ� �Է� �ϼ��� ? ");
			String pwd = br.readLine();
			
			if(! vo.getPassWord().equals(pwd)) {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.\n");
				return;
			}

			System.out.print("������ �н����� ? ");
			vo.setPassWord(br.readLine());

			System.out.print("������ ������� ? ");
			vo.setBirth(br.readLine());
			
			System.out.println("ȸ�� ������ �����߽��ϴ�.\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}