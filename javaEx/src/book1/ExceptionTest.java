package book1;

public class ExceptionTest {
	private String birth;
	private String phoneNum;
	
	public void ESetBirth(String birth)throws BookException{
		this.birth = birth.replaceAll("\\-|\\.|/", "");
		if(this.birth.length() != 8)
			throw new BookException("����, ��, �� ������ �Է��� �ֽʽÿ�.");
		try {
			int a = Integer.parseInt(this.birth);
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է����ֽʽÿ�");
		}
	}
	
	public void ESetPhoneNum(String phoneNum) throws BookException {
		this.phoneNum = phoneNum.replace("\\-|\\.|/", "");
		if(this.phoneNum.length() != 11)
			throw new BookException("�� ��ȣ�� �� �� �Է��ϼ̽��ϴ�.");
	}
	
	
	public String EGetBirth() {
		return birth;
	}
	public String EGetPhoneNum() {
		return phoneNum;
	}
}
