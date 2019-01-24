package book1;

import java.util.ArrayList;
import java.util.List;

public class UserVO {
	private String id; // 회원번호
	private String passWord; // 비밀번호
	private String name; // 이름
	private String birth; // 생년월일
	private String phoneNum; // 전화번호
	private List<BookVO> bookList= new ArrayList<>(); // 빌린 책 목록 (최대 5개)
	private boolean blackList;
	
	public String getId() {
		return id;
	}
	public boolean isBlackList() {
		return blackList;
	}
	public void setBlackList(boolean blackList) {
		this.blackList = blackList;
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
	public List<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
}
