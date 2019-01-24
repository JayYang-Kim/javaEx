package ex1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ��¥ : 2018.12.20
 * ���� : ����(Exception) ó��
 * ��Ÿ : 
 * */

public class Exception_Ex5 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // (System.in) Ű���带 ���� 1����Ʈ�� �Է��� ����
		int a, b, c;
		
		try {
			String s;
			
			System.out.println("ù��° ���� �Է����ּ���.");
			
			s = br.readLine(); 
			a = Integer.parseInt(s);
			
			System.out.println("�ι�° ���� �Է����ּ���.");
			b = Integer.parseInt(br.readLine());
			
			c = a + b;
			
			System.out.println("��� : " + c);
		} catch(IOException e) { // checked ���� (�ݵ�� ����ó���� �ؾ���)
			e.printStackTrace();
		} catch (NumberFormatException e) { // unckecked ���� (�ݵ�� ����ó���� ���� �ʾƵ���)
			System.out.println(e.getMessage());
		} catch (Exception e) { // Exception : ��� ���ܸ� catch�� �� �ִ�.
			                    // ��� ������ �ֻ����̹Ƿ� ���� ���ܸ� catch�� ��� ���� �Ʒ��� ��ġ
			System.out.println(e.toString());
		}
		
		
		System.out.println("����");
	}

}
