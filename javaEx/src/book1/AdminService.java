package book1;

import java.io.IOException;

/*
 * �ۼ��� : 
 */

public interface AdminService {
	public void bookAdd(); // å �߰�
	public void bookDelete(); // å ����
	public void bookPrint(); // å ����Ʈ
	public void serachPrint(); // ��ü ����
	public BookVO searchBook() throws IOException; //å �˻�
}
