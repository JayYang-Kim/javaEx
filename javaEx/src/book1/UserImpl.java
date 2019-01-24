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
					
					System.out.print("\n회원 가입...");
					System.out.print("id ? :");
					id=br.readLine();
					if(confirmUser(id) == null)
						user.setId(id);
					else
						throw new Exception("id 중복이 있습니다.");	
													
					System.out.print("password ? :");
					user.setPassWord(br.readLine());
					
					System.out.print("name ? :");
					user.setName(br.readLine());
					
					System.out.print("birth ? :");
					birth = br.readLine();
					et.ESetBirth(birth); //오류 확인
					user.setBirth(et.EGetBirth()); //없으면 삽입
					
					System.out.print("phoneNum ? :");
					phoneNum = br.readLine();
					et.ESetPhoneNum(phoneNum);	//오류 확인
					user.setPhoneNum(et.EGetPhoneNum());	//없으면 삽입
					
					//user.setbookList() 는 null로 자동 초기화
					
					userList.add(user);
					System.out.println("!!!!!!회원가입 완료!!!!!!!");
					return;
			
			
			} catch(BookException e) {
				System.out.println(e.toString());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} catch(Exception e) {
				
			}
		}
	}

	//로그인 되어있다면 vo를 보낸다.
	@Override
	public void userDelete(UserVO vo) {
		try {
			String ch;
			System.out.println("\n 삭제 .... ");
			
			if(vo == null) {
				System.out.println("로그인 먼저 해주십시오.");
				return;
			}
			UserVO v = confirmUser(vo.getId());
			if(v == null) {
				System.out.println("해당되는 아이디가 존재하지 않습니다.");
				return;
			}
				
			System.out.print("삭제가 확실합니까 ?[Y/N] :");
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
	
	//id 중복 체크 메소드 (같은 사람이 존재하면 false , 같은 사람이 존재하지 않으면 true)
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
		
		System.out.println("\n회원 정보 수정...");
		
		try {	
			
			System.out.print("패스워드를 다시 입력 하세요 ? ");
			String pwd = br.readLine();
			
			if(! vo.getPassWord().equals(pwd)) {
				System.out.println("패스워드가 일치하지 않습니다.\n");
				return;
			}

			System.out.print("수정할 패스워드 ? ");
			vo.setPassWord(br.readLine());

			System.out.print("수정할 생년월일 ? ");
			vo.setBirth(br.readLine());
			
			System.out.println("회원 정보를 수정했습니다.\n");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
}