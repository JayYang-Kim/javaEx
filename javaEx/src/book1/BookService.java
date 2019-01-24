package book1;

/*
 * 작성자 : 
 */

public interface BookService {
	public void bookRent(UserVO loginMember); // 대여
	public void bookRetrun(UserVO loginMember); // 반납
	public void bookList(UserVO loginMember);
}
