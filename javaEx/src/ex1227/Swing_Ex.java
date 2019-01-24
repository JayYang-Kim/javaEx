package ex1227;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/* 날짜 : 2018.12.27
 * 내용 : Swing
 * 기타 : AWT => SWING => JavaFX
 * */

public class Swing_Ex extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;

	public Swing_Ex() {
		addWindowListener(this); // Event 등록
		
		setTitle("윈도우 에제"); // 제목
		setSize(1024, 768); // 윈도우 크기
		setVisible(true); // 윈도우 활성화 (ture : 보이기, false : 안보임) 
	 }
	
	public static void main(String[] args) {
		new Swing_Ex();
	}
	
	// WindowListener interface 구현 (메소드 재정의)
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
