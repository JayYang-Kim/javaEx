package ex1228;

/*
 * 작성자 : 김진양
 */

public interface BookService {
	public void bookRent(UserVO loginMember); // 대여
	public void bookRetrun(UserVO loginMember); // 반납
}
