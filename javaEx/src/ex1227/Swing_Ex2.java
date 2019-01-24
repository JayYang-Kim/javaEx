package ex1227;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/* ��¥ : 2018.12.27
 * ���� : Swing
 * ��Ÿ : AWT => SWING => JavaFX
 * */

public class Swing_Ex2 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public Swing_Ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ��������� X�� ���� â�� ������� ���α׷��� ���� ó��
		
		btn1 = new JButton("��ư1");
		add(btn1, BorderLayout.CENTER);
		btn2 = new JButton("��ư2");
		add(btn2, BorderLayout.SOUTH);
		btn3 = new JButton("��ư3");
		add(btn3, BorderLayout.NORTH);
		btn4 = new JButton("��ư4");
		add(btn4, BorderLayout.WEST);
		btn5 = new JButton("��ư5");
		add(btn5, BorderLayout.EAST);
		
		setTitle("���� ����"); // ����
		setSize(1024, 768); // ������
		setVisible(true); // ������ Ȱ��ȭ (ture : ���̱�, false : �Ⱥ���)
	}
	
	public static void main(String[] args) {
		new Swing_Ex2();
	}
}
