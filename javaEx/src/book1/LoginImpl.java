package book1;
//����
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginImpl implements LoginService{
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private UserVO loginmember;
	private ListVO l;
	
	
	public LoginImpl(ListVO list) {
		l = list;
		
		UserVO vo = new UserVO();
		vo.setId("admin");
		vo.setPassWord("admin");
		vo.setName("������");
		vo.setBirth("2000-01-01");
		l.getUserList().add(vo);
		
	}
	
	@Override
	public void logIn() {
		String id,pw;
		
		try {
			System.out.println("ȸ�� �α���");	
			
			if (loginmember != null) {
				System.out.println("�α����� �Ǿ��ֽ��ϴ�.");
				return;												
			}
			System.out.print("���̵� �Է�: ");
				id = br.readLine();				
			
			System.out.print("\n��й�ȣ �Է�:");
			pw = br.readLine();
			
			UserVO vo = readMember(id);
			if (vo != null) {
				if (vo.getPassWord().equals(pw)) {
					loginmember = vo;
					return;
				} else if (vo.getId().equals("admin") && vo.getPassWord().equals("admin")) {
					System.out.println("������ ���̵�� �α��� �Ǿ����ϴ�.");
					loginmember = vo;
					return;
				} else {
					System.out.println("���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�����ϴ� ���̵� �����ϴ�.");
				return;
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void logOut() {
		char yn;

		try {
			System.out.println("�α׾ƿ� �Ͻðڽ��ϱ�?[y/n]");
			yn = br.readLine().charAt(0);
			if (yn == 'y' || yn == 'Y') {
				loginmember = null;
				System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			} else if (yn == 'n' || yn == 'N') {
				return;
			} else {
				System.out.println("�߸��� �Է��Դϴ�");
			}

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

	public UserVO loginMember() {
		return loginmember;	
	}	
			
	public UserVO readMember(String id) {		
		UserVO vo = null;				
		for(UserVO data : l.getUserList() ) {
			if(data.getId().equals(id)) {
				vo=data;
				break;
			}
		}		
		return vo;	
	}
@Override
public void loginMemberNull() {
	loginmember=null;
	}

}