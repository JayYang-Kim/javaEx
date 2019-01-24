package ex1220;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ��¥ : 2018.12.20
 * ���� : ����(Exception) ó��
 * ��Ÿ : InputStream : System.in -> 1����Ʈ�� �Է��� ���� (byte ��Ʈ�� / �Է��� �⺻)
 *      InputStreamReader : byte ��Ʈ���� ���� ��Ʈ������ ��ȯ
 *      BufferedReader : ���� ��Ʈ�� (���ڿ��� �Է� ���� �� �ִ� Ŭ����)
 * */

public class Exception_Ex4 {

	public static void main(String[] args) {
		// ����Ʈ > ���� > ���ڿ��� ��ȯ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // (System.in) Ű���带 ���� 1����Ʈ�� �Է��� ����
		int a, b, c;
		
		//String s = br.readLine(); // [������ ����] readLine ������ �����ϰ� �ִ�.
		                            // checked ���ܰ� �߻��ϹǷ� �ݵ�� ����ó���� �������
		
		try {
			String s;
			
			System.out.println("ù��° ���� �Է����ּ���.");
			
			s = br.readLine(); // checked ���� (IOException ����)
			                   // �ݵ�� ����ó�� ������Ѵ�.
			a = Integer.parseInt(s);
			
			System.out.println("�ι�° ���� �Է����ּ���.");
			b = Integer.parseInt(br.readLine());
			
			c = a + b;
			
			System.out.println("��� : " + c);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("����");
	}

}
