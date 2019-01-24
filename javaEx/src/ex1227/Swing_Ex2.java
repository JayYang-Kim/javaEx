package ex1227;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/* 날짜 : 2018.12.27
 * 내용 : Swing
 * 기타 : AWT => SWING => JavaFX
 * */

public class Swing_Ex2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public Swing_Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우즈에서 X를 눌러 창을 닫을경우 프로그램을 종료 처리
		
		btn1 = new JButton("버튼1");
		add(btn1, BorderLayout.CENTER);
		btn2 = new JButton("버튼2");
		add(btn2, BorderLayout.SOUTH);
		btn3 = new JButton("버튼3");
		add(btn3, BorderLayout.NORTH);
		btn4 = new JButton("버튼4");
		add(btn4, BorderLayout.WEST);
		btn5 = new JButton("버튼5");
		add(btn5, BorderLayout.EAST);
		
		setTitle("스윙 예제"); // 제목
		setSize(1024, 768); // 사이즈
		setVisible(true); // 윈도우 활성화 (ture : 보이기, false : 안보임)
	}
	
	public static void main(String[] args) {
		new Swing_Ex2();
	}
}
