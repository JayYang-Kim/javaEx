package member1;

public interface Member {
	public void insert();
	public void update();
	public void delete();
	public void list();
	
	public void login();
	public void logout();
	public MemberVO loginMember();
}
