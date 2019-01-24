package yangStudy;

/* 날짜 : 2018.12.19
 * 내용 : 학번, 이름, 점수(국어, 영어, 수학), 총점 평균
 * 기타 :
 * 관련 class : Score, ScoreService, ScoreApp   
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
	
	// 총점
	public int total() {
		return kor + eng + mat;
	}
	
	// 평균
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
