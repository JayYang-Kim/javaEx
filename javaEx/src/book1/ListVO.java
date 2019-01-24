package book1;

import java.util.ArrayList;
import java.util.List;

public class ListVO {
	private List<UserVO> userList = new ArrayList<>();
	private List<BookVO> bookList = new ArrayList<>();
	
	public List<UserVO> getUserList() {
		return userList;
	}
	public void setUserList(List<UserVO> userList) {
		this.userList = userList;
	}
	public List<BookVO> getBookList() {
		return bookList;
	}
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
}
