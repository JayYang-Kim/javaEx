package ex1226;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

/* ��¥ : 2018.12.26
 * ���� : properties 
 * ��Ÿ : porperties�� string�� ���尡��
 *      ���� �о����
 * */

public class Properties_Ex {

	public static void main(String[] args) {
		// properties ���� �о����
		String pathName = "test.properties";
		Properties p = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(pathName);
			
			p.load(fis); // ������ ������ �о properties�� ����
			
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
