package ex1227;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* ��¥ : 2018.12.27
 * ���� : Swing
 * ��Ÿ : ä�� �⺻ ��
 * */

// ActionEvent : ��ư, �޴� ������, TextField���� ���͸� ������ ���� �̺�Ʈ ó��
public class Swing_Ex3 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField(); // text ���ٸ� �Է� ����
	private JTextArea ta = new JTextArea(); // text ���� �̻� �Է� ����
	
	public Swing_Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ��������� X�� ���� â�� ������� ���α׷��� ���� ó��
		
		ta.setEditable(false); // �ؽ�Ʈ ���� �Ұ��ϰ� ó��
		
		JScrollPane pane = new JScrollPane(ta); // text�� ������ ������ ����� scroll�� ����
		add(pane, BorderLayout.CENTER); // ��ġ : ���
		
		// Event ���
		tf.addActionListener(this);
		
		add(tf, BorderLayout.SOUTH); // ��ġ : �Ʒ�
		
		setTitle("ä��"); // ����
		setSize(1024, 768); // ������
		setVisible(true); // ������ Ȱ��ȭ (ture : ���̱�, false : �Ⱥ���)
	}
	
	public static void main(String[] args) {
		new Swing_Ex3();
	}
	
	// ActionListener interface �޼ҵ� ������
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf) {
			String s = tf.getText().trim();
			
			if (s.length() == 0) {
				return;
			}
			
			try {
				// ������ �ϴ� �ҽ��� �ʿ�
				ta.append("����] " + s + "\n");
				tf.setText("");
				tf.requestFocus();
			} catch (Exception e2) {
				System.out.println(e2.toString());
			}
		}
	}
}
