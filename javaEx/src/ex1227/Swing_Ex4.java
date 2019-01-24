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

/* 날짜 : 2018.12.27
 * 내용 : Swing
 * 기타 : Layout 수동
 * */

// ActionEvent : 버튼, 메뉴 아이템, TextField에서 엔터를 누를때 등의 이벤트 처리
public class Swing_Ex4 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField[] tf = new JTextField[6]; // Text 필드 6개 생성
	private JTextPane tp = new JTextPane();
	
	private JButton btn1, btn2;
	
	public Swing_Ex4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null); // 컴포넌트를 수동으로 배치
		String[] title = {"학번 : ", "이름 : ", "생년월일 : ", "국어 : ", "영어 : ", "수학 : "};
		
		for (int i = 0; i < tf.length; i++) {
			JLabel lbl = new JLabel(title[i], JLabel.RIGHT);
			lbl.setBounds(10, (i + 1) * 30, 70, 20); // (x좌표, y좌표, width, height)
			
			add(lbl);
			
			tf[i] = new JTextField();
			tf[i].addKeyListener(new keyHandler());
			tf[i].setBounds(90, (i + 1) * 30, 100, 20); // (x좌표, y좌표, width, height)
			
			add(tf[i]);
		}
		
		btn1 = new JButton("확인");
		btn1.setBounds(30, 210, 60, 20);
		btn1.addActionListener(this); // 이벤트 등록
		btn1.addKeyListener(new keyHandler());
		
		add(btn1);
		
		btn2 = new JButton("종료");
		btn2.setBounds(100, 210, 60, 20);
		btn2.addActionListener(this); // 이벤트 등록
		
		add(btn2);
		
		tp.setBorder(new LineBorder(Color.black, 1));
		tp.setEditable(false);
		tp.setBounds(200, 30, 200, 170);
		
		add(tp);
		
		// 윈도우 기본 틀 설정
		setTitle("성적 프로그램"); // 제목
		setSize(1024, 768); // 사이즈
		setVisible(true); // 윈도우 활성화
	}
	
	public static void main(String[] args) {
		new Swing_Ex4();
	}
	
	// ActionsListener interface 메소드 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) { // getSource() : 이벤트를 발생시킨 객체
			result();
		} else if (e.getSource() == btn2) {
			int n = JOptionPane.showConfirmDialog(this, 
					"종료하시겠습니까?", 
					"확인",
					JOptionPane.YES_NO_OPTION, // 예, 아니오 (옵션)
					JOptionPane.QUESTION_MESSAGE); // 아이콘 모양 (옵션)
			
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
			
			s = "학번 : " + tf[0].getText() + "\n이름 : " + tf[1].getText();
			s += "\n생년월일 : " + tf[2].getText();
			s += "\n총점 : " + tot;
			
			tp.setText(s);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "숫자만  입력해주세요", "ERROR", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	// keyAdapter : KeyListnener 인터페이스 구현 클래스
	class keyHandler extends KeyAdapter { 
		@Override
		public void keyReleased(KeyEvent e) {
			Component comp = (Component)e.getSource(); // [다운캐스팅]
			
			int keyCode = e.getKeyCode(); // 키보드로 누른 키 값 가져오기
			
			if (keyCode == KeyEvent.VK_ENTER) { // KeyEvent.VK_ENTER : 엔터키를 눌렀니? 
				
				// instanceof : 어떤 객체인지 체크
				if (comp instanceof JTextField) { // comp => JTextField인지 체크 
					for (int i = 0; i < tf.length; i++) {
						if (comp == tf[tf.length - 1]) { // tf 마지막에서 Enter키를 눌렀니?
							btn1.requestFocus(); // requestFocus() 한칸 내리기 
							break;
						} else if (comp == tf[i]) {
							tf[i + 1].requestFocus();
						}
					}
				} else if (comp instanceof JButton) { // comp => Jbutton인지 체크
					if (comp == btn1) {
						result();
					}
				}
				
			}
		} 		
	}
}
