package score1;

/* 날짜 : 2018.12.18
 * 내용 : 
 * 기타 :  
 * */

// VO (Value Object) 
public class ScoreVO {
	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	// 총점 구하기
	public int getTot() {
		return kor + eng + mat;
	}
	
	// 평균 구하기
	public int getAve() {
		return getTot() / 3;
	}
	
	@Override
	public String toString() {
		if (hak == null || name == null) { // 학번이나 이름이 없는 경우 체크
			return null;
		}
		
		// format = printf 동일
		String s = String.format("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\t%3d", hak, name, kor, eng, mat, getTot(), getAve());
		
		return s;
	}
}
