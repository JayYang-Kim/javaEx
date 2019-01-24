package ex1227;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;

/* ��¥ : 2018.12.27
 * ���� : Swing
 * ��Ÿ : Layout ����
 * */

// ActionEvent : ��ư, �޴� ������, TextField���� ���͸� ������ ���� �̺�Ʈ ó��
public class Swing_Ex4 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField[] tf = new JTextField[6]; // Text �ʵ� 6�� ����
	private JTextPane tp = new JTextPane();
	
	private JButton btn1, btn2;
	
	public Swing_Ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null); // ������Ʈ�� �������� ��ġ
		String[] title = {"�й� : ", "�̸� : ", "������� : ", "���� : ", "���� : ", "���� : "};
		
		for (int i = 0; i < tf.length; i++) {
			JLabel lbl = new JLabel(title[i], JLabel.RIGHT);
			lbl.setBounds(10, (i + 1) * 30, 70, 20); // (x��ǥ, y��ǥ, width, height)
			
			add(lbl);
			
			tf[i] = new JTextField();
			tf[i].addKeyListener(new keyHandler());
			tf[i].setBounds(90, (i + 1) * 30, 100, 20); // (x��ǥ, y��ǥ, width, height)
			
			add(tf[i]);
		}
		
		btn1 = new JButton("Ȯ��");
		btn1.setBounds(30, 210, 60, 20);
		btn1.addActionListener(this); // �̺�Ʈ ���
		btn1.addKeyListener(new keyHandler());
		
		add(btn1);
		
		btn2 = new JButton("����");
		btn2.setBounds(100, 210, 60, 20);
		btn2.addActionListener(this); // �̺�Ʈ ���
		
		add(btn2);
		
		tp.setBorder(new LineBorder(Color.black, 1));
		tp.setEditable(false);
		tp.setBounds(200, 30, 200, 170);
		
		add(tp);
		
		// ������ �⺻ Ʋ ����
		setTitle("���� ���α׷�"); // ����
		setSize(1024, 768); // ������
		setVisible(true); // ������ Ȱ��ȭ
	}
	
	public static void main(String[] args) {
		new Swing_Ex4();
	}
	
	// ActionsListener interface �޼ҵ� ������
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { // getSource() : �̺�Ʈ�� �߻���Ų ��ü
			result();
		} else if (e.getSource() == btn2) {
			int n = JOptionPane.showConfirmDialog(this, 
					"�����Ͻðڽ��ϱ�?", 
					"Ȯ��",
					JOptionPane.YES_NO_OPTION, // ��, �ƴϿ� (�ɼ�)
					JOptionPane.QUESTION_MESSAGE); // ������ ��� (�ɼ�)
			
			if (n == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
			}
		}
	}
	
	private void result() {
		String s = "";
		
		try {
			int kor = Integer.parseInt(tf[3].getText());
			int eng = Integer.parseInt(tf[4].getText());
			int mat = Integer.parseInt(tf[5].getText());
			int tot = kor + eng + mat;
			
			s = "�й� : " + tf[0].getText() + "\n�̸� : " + tf[1].getText();
			s += "\n������� : " + tf[2].getText();
			s += "\n���� : " + tot;
			
			tp.setText(s);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "���ڸ�  �Է����ּ���", "ERROR", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	// keyAdapter : KeyListnener �������̽� ���� Ŭ����
	class keyHandler extends KeyAdapter { 
		@Override
		public void keyReleased(KeyEvent e) {
			Component comp = (Component)e.getSource(); // [�ٿ�ĳ����]
			
			int keyCode = e.getKeyCode(); // Ű����� ���� Ű �� ��������
			
			if (keyCode == KeyEvent.VK_ENTER) { // KeyEvent.VK_ENTER : ����Ű�� ������? 
				
				// instanceof : � ��ü���� üũ
				if (comp instanceof JTextField) { // comp => JTextField���� üũ 
					for (int i = 0; i < tf.length; i++) {
						if (comp == tf[tf.length - 1]) { // tf ���������� EnterŰ�� ������?
							btn1.requestFocus(); // requestFocus() ��ĭ ������ 
							break;
						} else if (comp == tf[i]) {
							tf[i + 1].requestFocus();
						}
					}
				} else if (comp instanceof JButton) { // comp => Jbutton���� üũ
					if (comp == btn1) {
						result();
					}
				}
				
			}
		} 		
	}
}
