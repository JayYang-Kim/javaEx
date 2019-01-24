package book;

public interface Member {
	public void insertMember();
	public void updateMember(String id);
	public boolean removeMember(String id);
	public MemberVO readMember(String id);
	public MemberVO login();
	
	public void searchIdMember();
	public void listMember();
}
