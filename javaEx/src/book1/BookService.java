package book1;

/*
 * �ۼ��� : 
 */

public interface BookService {
	public void bookRent(UserVO loginMember); // �뿩
	public void bookRetrun(UserVO loginMember); // �ݳ�
	public void bookList(UserVO loginMember);
}
