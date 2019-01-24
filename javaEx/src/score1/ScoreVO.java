package score1;

/* ��¥ : 2018.12.18
 * ���� : 
 * ��Ÿ :  
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
	
	// ���� ���ϱ�
	public int getTot() {
		return kor + eng + mat;
	}
	
	// ��� ���ϱ�
	public int getAve() {
		return getTot() / 3;
	}
	
	@Override
	public String toString() {
		if (hak == null || name == null) { // �й��̳� �̸��� ���� ��� üũ
			return null;
		}
		
		// format = printf ����
		String s = String.format("%10s\t%10s\t%3d\t%3d\t%3d\t%3d\t%3d", hak, name, kor, eng, mat, getTot(), getAve());
		
		return s;
	}
}
