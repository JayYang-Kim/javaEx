package book1;

import java.util.ArrayList;
import java.util.List;

public class UserVO {
	private String id; // ȸ����ȣ
	private String passWord; // ��й�ȣ
	private String name; // �̸�
	private String birth; // �������
	private String phoneNum; // ��ȭ��ȣ
	private List<BookVO> bookList= new ArrayList<>(); // ���� å ��� (�ִ� 5��)
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
