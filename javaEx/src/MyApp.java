import com.util.MyUtil;
import com.util.test.Test;

// ���
class Ex extends Test {
	public void set(String name, int score, int age) {
		this.name = name;
		this.score = score; // sub class�� protected ���� ���� 
		//this.age = age; // [������ ����]
	}
}

public class MyApp {
	
	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		
		System.out.println(util.max(5, 10));
		
		Test t = new Test("�ڹ�", 50, 20);
		System.out.println(t.name);
		//System.out.println(t.score); // [������ ����] protected score�̱� ������ ��Ű���� �ٸ��� ȣ�� �Ұ�  
		
	}

}
