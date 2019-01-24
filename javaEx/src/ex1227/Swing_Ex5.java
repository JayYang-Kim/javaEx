package ex1227;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/* ��¥ : 2018.12.27
 * ���� : Swing
 * ��Ÿ : ���̺� ����
 * */

public class Swing_Ex5 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Swing_Ex5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String title[] = {"�̸�", "����", "����"};
		Object data[][] = {{"���ڹ�", "������", 20}, {"���ڹ�", "������2", 30}, {"���ڹ�", "������3", 25}, {"���ڹ�", "������4", 35}, {"���ڹ�", "������5", 40}};
		
		JTable t = new JTable(data, title); // html : (td, tr)
		JScrollPane pane = new JScrollPane(t);
		add(pane, BorderLayout.CENTER);
		
		setTitle("���̺� ����");
		setSize(1024, 768);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Swing_Ex5();
	}
}
