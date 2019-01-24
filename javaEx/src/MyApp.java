import com.util.MyUtil;
import com.util.test.Test;

// 상속
class Ex extends Test {
	public void set(String name, int score, int age) {
		this.name = name;
		this.score = score; // sub class는 protected 접근 가능 
		//this.age = age; // [컴파일 에러]
	}
}

public class MyApp {
	
	public static void main(String[] args) {
		MyUtil util = new MyUtil();
		
		System.out.println(util.max(5, 10));
		
		Test t = new Test("자바", 50, 20);
		System.out.println(t.name);
		//System.out.println(t.score); // [컴파일 오류] protected score이기 때문에 패키지가 다르면 호출 불가  
		
	}

}
