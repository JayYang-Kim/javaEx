package ex1228;

public class UserVO {
	private String id; // 회원번호
	private String passWord; // 비밀번호
	private String name; // 이름
	private String birth; // 생년월일
	private String phoneNum; // 전화번호
	private BookVO[] bookList; // 빌린 책 목록
	private boolean blackList; // 블랙리스트
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public BookVO[] getBookList() {
		return bookList;
	}
	public void setBookList(BookVO[] bookList) {
		this.bookList = bookList;
	}
	public boolean isBlackList() {
		return blackList;
	}
	public void setBlackList(boolean blackList) {
		this.blackList = blackList;
	}	
}
