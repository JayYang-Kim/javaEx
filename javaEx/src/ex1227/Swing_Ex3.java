package ex1227;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* 날짜 : 2018.12.27
 * 내용 : Swing
 * 기타 : 채팅 기본 폼
 * */

// ActionEvent : 버튼, 메뉴 아이템, TextField에서 엔터를 누를때 등의 이벤트 처리
public class Swing_Ex3 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField tf = new JTextField(); // text 한줄만 입력 가능
	private JTextArea ta = new JTextArea(); // text 한줄 이상 입력 가능
	
	public Swing_Ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우즈에서 X를 눌러 창을 닫을경우 프로그램을 종료 처리
		
		ta.setEditable(false); // 텍스트 수정 불가하게 처리
		
		JScrollPane pane = new JScrollPane(ta); // text가 윈도우 영역을 벗어나면 scroll이 생김
		add(pane, BorderLayout.CENTER); // 위치 : 가운데
		
		// Event 등록
		tf.addActionListener(this);
		
		add(tf, BorderLayout.SOUTH); // 위치 : 아래
		
		setTitle("채팅"); // 제목
		setSize(1024, 768); // 사이즈
		setVisible(true); // 윈도우 활성화 (ture : 보이기, false : 안보임)
	}
	
	public static void main(String[] args) {
		new Swing_Ex3();
	}
	
	// ActionListener interface 메소드 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf) {
			String s = tf.getText().trim();
			
			if (s.length() == 0) {
				return;
			}
			
			try {
				// 전송을 하는 소스가 필요
				ta.append("보냄] " + s + "\n");
				tf.setText("");
				tf.requestFocus();
			} catch (Exception e2) {
				System.out.println(e2.toString());
			}
		}
	}
}
