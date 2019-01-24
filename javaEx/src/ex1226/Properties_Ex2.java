package ex1226;

import java.io.FileOutputStream;
import java.util.Properties;

/* 날짜 : 2018.12.26
 * 내용 : properties 
 * 기타 : porperties는 string만 저장가능
 *      파일 생성
 * */

public class Properties_Ex2 {

	public static void main(String[] args) {
		String pathName = "ex.properties";
		
		try (FileOutputStream fos = new FileOutputStream(pathName) ) {
			Properties p = new Properties();
			
			// properties 저장
			p.setProperty("자바", "30");
			p.setProperty("빅데이터", "60");
			p.setProperty("알고리즘", "50");
			p.setProperty("웹", "70");
			p.setProperty("데이터베이스", "30");
			
			// 파일에 저장
			p.store(fos, "test");
			
			System.out.println("파일 저장 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
