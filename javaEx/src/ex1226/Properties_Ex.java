package ex1226;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

/* 날짜 : 2018.12.26
 * 내용 : properties 
 * 기타 : porperties는 string만 저장가능
 *      파일 읽어오기
 * */

public class Properties_Ex {

	public static void main(String[] args) {
		// properties 파일 읽어오기
		String pathName = "test.properties";
		Properties p = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(pathName);
			
			p.load(fis); // 파일의 내용일 읽어서 properties에 저장
			
			System.out.println(p);
			
			Iterator<Object> it = p.keySet().iterator();
			
			while (it.hasNext()) {
				String key = (String)it.next();
				String value = p.getProperty(key);
				
				System.out.println(key + " : " + value);
			}
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
