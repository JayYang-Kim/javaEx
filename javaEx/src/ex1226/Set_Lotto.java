package ex1226;

import java.util.Set;
import java.util.TreeSet;

/* ��¥ : 2018.12.26
 * ���� : set interface
 * ��Ÿ : lotto
 * */

public class Set_Lotto {

	public static void main(String[] args) {
		//Set<Integer> lotto = new HashSet<>(); // ���� X
		Set<Integer> lotto = new TreeSet<>(); // ���� 
		
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
