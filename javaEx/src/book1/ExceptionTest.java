package book1;

public class ExceptionTest {
	private String birth;
	private String phoneNum;
	
	public void ESetBirth(String birth)throws BookException{
		this.birth = birth.replaceAll("\\-|\\.|/", "");
		if(this.birth.length() != 8)
			throw new BookException("연도, 월, 일 순으로 입력해 주십시오.");
		try {
			int a = Integer.parseInt(this.birth);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주십시오");
		}
	}
	
	public void ESetPhoneNum(String phoneNum) throws BookException {
		this.phoneNum = phoneNum.replace("\\-|\\.|/", "");
		if(this.phoneNum.length() != 11)
			throw new BookException("폰 번호를 잘 못 입력하셨습니다.");
	}
	
	
	public String EGetBirth() {
		return birth;
	}
	public String EGetPhoneNum() {
		return phoneNum;
	}
}
