package ex1226;

import java.util.Set;
import java.util.TreeSet;

/* 날짜 : 2018.12.26
 * 내용 : set interface
 * 기타 : lotto
 * */

public class Set_Lotto {

	public static void main(String[] args) {
		//Set<Integer> lotto = new HashSet<>(); // 순서 X
		Set<Integer> lotto = new TreeSet<>(); // 정렬 
		
		while (lotto.size() < 6) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
		}
		
		//System.out.println(lotto);
		
		for (int n : lotto) {
			System.out.print(n + " ");
		}
		
		System.out.println();
	}

}
