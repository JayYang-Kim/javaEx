package tscore;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ScoreInsert extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField[] tf=new JTextField[6];
	private JButton btn1, btn2;
	private ScoreFrame frame;
	
	public ScoreInsert(JFrame frame) {
		super(frame, true);
		
		this.frame=(ScoreFrame)frame;
		
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setLayout(null);
		String title[]={"학번 :", "이름 :", "생년월일 :",
				"국어 :", "영어 :", "수학 :"};
		for(int i=0; i<title.length; i++) {
			JLabel lbl=new JLabel(title[i]);
			lbl.setBounds(20, (i+1)*30, 80, 22);
			add(lbl);
			
			tf[i]=new JTextField();
			tf[i].addKeyListener(new KeyHandler());
			tf[i].setBounds(100, (i+1)*30, 110, 22);
			add(tf[i]);
		}
		
		btn1=new JButton("추가");
		btn1.addKeyListener(new KeyHandler());
		btn1.addActionListener(this);
		btn1.setBounds(30, 220, 80, 22);
		add(btn1);
		
		btn2=new JButton("종료");
		btn2.addActionListener(this);
		btn2.setBounds(115, 220, 80, 22);
		add(btn2);
		
		setTitle("자료 입력");
		setSize(250, 300);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			insert();
		} else if(e.getSource()==btn2) {
			dispose();
		}
	}
	
	private void insert() {
		String[] items=new String[8];
		String s;
		
		try {
			for(int i=0; i<tf.length; i++) {
				s=tf[i].getText().trim();
				if(s.length()==0) {
					tf[i].requestFocus();
					return;
				}
				
				items[i]=s;
			}
			
			int tot=Integer.parseInt(items[3])+
					Integer.parseInt(items[4])+
					Integer.parseInt(items[5]);
			items[6]=Integer.toString(tot);
			items[7]=String.format("%.1f",
					(double)tot/3);
			
			frame.tableInsertRow(items);
			
			for(int i=0; i<tf.length; i++)
				tf[i].setText("");
			tf[0].requestFocus();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "데이터 추가가 실패 했습니다.");
		}
	}
	
	class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			Component comp=(Component)e.getSource();
			int code=e.getKeyCode();
			
			if(code==KeyEvent.VK_ENTER) {
				if(comp instanceof JTextField) {
					for(int i=0; i<tf.length; i++) {
						if(i==5&&tf[5]==comp) {
							btn1.requestFocus();
							return;
						} else if(comp==tf[i]){
							tf[i+1].requestFocus();
							return;
						}
					}
				} else if(comp==btn1) {
					insert();
				}
			}
		}
	}
}
