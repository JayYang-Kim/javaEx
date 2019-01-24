
public class DateUtilApp {

	public static void main(String[] args) {
		DateUtil ob = new DateUtil();
		
		String s="2000.10.10";
		int age = ob.toAge(s);
		System.out.println(age);
	}

}
