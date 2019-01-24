package score2.map;

/* ��¥ : 2018.12.26
 * ���� : ScoreVO 
 * ��Ÿ : 
 * */

public class ScoreVO {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
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
	
	// ����
	public int total() {
		return kor + eng + mat;
	}
	
	// ���
	public int ave() {
		return (kor + eng + mat) / 3;
	}
}
