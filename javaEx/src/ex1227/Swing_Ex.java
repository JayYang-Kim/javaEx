package ex1227;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/* ��¥ : 2018.12.27
 * ���� : Swing
 * ��Ÿ : AWT => SWING => JavaFX
 * */

public class Swing_Ex extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;

	public Swing_Ex() {
		addWindowListener(this); // Event ���
		
		setTitle("������ ����"); // ����
		setSize(1024, 768); // ������ ũ��
		setVisible(true); // ������ Ȱ��ȭ (ture : ���̱�, false : �Ⱥ���) 
	 }
	
	public static void main(String[] args) {
		new Swing_Ex();
	}
	
	// WindowListener interface ���� (�޼ҵ� ������)
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
