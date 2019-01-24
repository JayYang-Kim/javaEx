package ex1212;

/* 날짜 : 2018.12.12
 * 내용 : 명령행 인수 (Command Line Argument)
 * 기타 : 명령행 인수 받기 / 마우스 우클릭 > run as > run configurations (tab : Arguments)
 * */

// Java Arg_Ex A B C
public class ArrayCopy_Ex {

	public static void main(String[] args) {
		System.out.println("명령행 인수 개수 : " + args.length);
		
		// 출력 방법1)
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// 출력 방법2)
		for (String n : args) {
			System.out.println(n);
		}
	}

}
