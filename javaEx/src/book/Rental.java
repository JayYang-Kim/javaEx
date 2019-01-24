package book;

import java.util.List;

public interface Rental {
	public void bookRental(String id); // �뿩
	public void bookReturn(String id); // �ݳ�
	public RentalVO readRental(String code); // ���� �ڵ忡 ���� �뿩 ����
	
	public List<RentalVO> listAllRentalId(String id); // id�� ��ü �뿩 ���� ����Ʈ
	public List<RentalVO> listRentalId(String id); // id�� ���� �뿩���� ���� ����Ʈ
	public void removeRentalId(String id); // id�� �뿩 ��� �����
	
	public void searchCodeRental();   // ���� �ڵ忡 ���� �뿩 ���� �˻�
	public void writeRentalAllList(); // ��ü �뿩 ����Ʈ ���
	public void writeRentalList();    // ���� �뿩���� ���� ����Ʈ ���
	public void writeRentalListAllId(String id); // id�� ��ü �뿩 ���� ����Ʈ ��� 
	public void writeRentalListId(String id); // id�� ���� �뿩���� ���� ����Ʈ ��� 
}
