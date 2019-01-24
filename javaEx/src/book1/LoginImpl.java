package book1;
//임희석
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
		vo.setName("관리자");
		vo.setBirth("2000-01-01");
		l.getUserList().add(vo);
		
	}
	
	@Override
	public void logIn() {
		String id,pw;
		
		try {
			System.out.println("회원 로그인");	
			
			if (loginmember != null) {
				System.out.println("로그인이 되어있습니다.");
				return;												
			}
			System.out.print("아이디 입력: ");
				id = br.readLine();				
			
			System.out.print("\n비밀번호 입력:");
			pw = br.readLine();
			
			UserVO vo = readMember(id);
			if (vo != null) {
				if (vo.getPassWord().equals(pw)) {
					loginmember = vo;
					return;
				} else if (vo.getId().equals("admin") && vo.getPassWord().equals("admin")) {
					System.out.println("관리자 아이디로 로그인 되었습니다.");
					loginmember = vo;
					return;
				} else {
					System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("존재하는 아이디가 없습니다.");
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
			System.out.println("로그아웃 하시겠습니까?[y/n]");
			yn = br.readLine().charAt(0);
			if (yn == 'y' || yn == 'Y') {
				loginmember = null;
				System.out.println("로그아웃 되었습니다.");
			} else if (yn == 'n' || yn == 'N') {
				return;
			} else {
				System.out.println("잘못된 입력입니다");
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