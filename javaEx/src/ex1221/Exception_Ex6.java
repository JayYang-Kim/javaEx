package ex1221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* ��¥ : 2018.12.21
 * ���� : ���� (Exception) ó��
 * ��Ÿ : �޼ҵ��� throws�� ���� ���
 *      throws�� ����ó�� �� ���α׷��� �߸��Ǹ� ����ȴ�.
 * */

class Ex6 {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String inputString(String title) throws IOException { // inputString �޼ҵ带 ȣ���Ѱ����� ����ó���� ���ѱ��.
		String s = null;
		
		System.out.println(title + " ?");
		s = br.readLine(); // readLine()�� checked ���ܸ� ������ �ִ�.
		
		return s;
	}
	
	public int inputNum(String title) throws IOException { // inputNum �޼ҵ带 ȣ���Ѱ����� ����ó���� ���ѱ��.
		int n = 0;
		
		System.out.println(title + " ?");
		n = Integer.parseInt(br.readLine()); // readLine()�� checked ���ܸ� ������ �ִ�.		
		
		return n;
	}
}

public class Exception_Ex6 {

	public static void main(String[] args) throws IOException {
		Ex6 e = new Ex6();
		
		String s;
		
		s = e.inputString("�̸�");
		
		System.out.println(s);
	}

}
