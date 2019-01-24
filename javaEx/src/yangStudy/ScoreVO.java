package yangStudy;

/* ��¥ : 2018.12.19
 * ���� : �й�, �̸�, ����(����, ����, ����), ���� ���
 * ��Ÿ :
 * ���� class : Score, ScoreService, ScoreApp   
 * */

public class ScoreVO {
	private String hakbun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
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
	
	// ����
	public int total() {
		return kor + eng + mat;
	}
	
	// ���
	public int average() {
		return (kor + eng + mat) / 3;
	}
	
	/*@Override
	public String toString() {
		if(hakbun == null || name == null) {
			return null;
		}
		
		String s = String.format("%s\t%s\t%d\t%d\t%d\t%d\t%d", hakbun,name,kor,eng,mat,total(),average());
		
		return s;
	}*/
}
