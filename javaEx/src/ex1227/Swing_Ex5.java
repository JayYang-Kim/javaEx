package ex1227;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/* 날짜 : 2018.12.27
 * 내용 : Swing
 * 기타 : 테이블 예제
 * */

public class Swing_Ex5 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Swing_Ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String title[] = {"이름", "직업", "나이"};
		Object data[][] = {{"김자바", "개발자", 20}, {"이자바", "개발자2", 30}, {"너자바", "개발자3", 25}, {"다자바", "개발자4", 35}, {"사자바", "개발자5", 40}};
		
		JTable t = new JTable(data, title); // html : (td, tr)
		JScrollPane pane = new JScrollPane(t);
		add(pane, BorderLayout.CENTER);
		
		setTitle("테이블 예제");
		setSize(1024, 768);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing_Ex5();
	}
}
