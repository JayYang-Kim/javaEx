package ex1226;

import java.io.FileOutputStream;
import java.util.Properties;

/* ��¥ : 2018.12.26
 * ���� : properties 
 * ��Ÿ : porperties�� string�� ���尡��
 *      ���� ����
 * */

public class Properties_Ex2 {

	public static void main(String[] args) {
		String pathName = "ex.properties";
		
		try (FileOutputStream fos = new FileOutputStream(pathName) ) {
			Properties p = new Properties();
			
			// properties ����
			p.setProperty("�ڹ�", "30");
			p.setProperty("������", "60");
			p.setProperty("�˰���", "50");
			p.setProperty("��", "70");
			p.setProperty("�����ͺ��̽�", "30");
			
			// ���Ͽ� ����
			p.store(fos, "test");
			
			System.out.println("���� ���� �Ϸ�");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
