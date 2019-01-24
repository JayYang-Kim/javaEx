package tscore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ScoreFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JButton btn1, btn2, btn3, btn4, btn5;
	private JTable table;
	
	public ScoreFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p=new JPanel(); // 요소를 그룹화 시켜즘
		p.setLayout(new GridLayout(5, 1)); // GridLayout(행, 열)
		
		btn1=new JButton("추가");
		btn1.setBackground(Color.WHITE);
		btn1.setOpaque(true); // 배경색을 주기위해(불투명모드)
		btn1.addActionListener(this);
		p.add(btn1);
		
		btn2=new JButton("수정");
		btn2.setBackground(Color.WHITE);
		btn2.setOpaque(true);
		btn2.addActionListener(this);
		p.add(btn2);

		btn3=new JButton("삭제");
		btn3.setBackground(Color.WHITE);
		btn3.setOpaque(true);
		btn3.addActionListener(this);
		p.add(btn3);
		
		btn4=new JButton("전체삭제");
		btn4.setBackground(Color.WHITE);
		btn4.setOpaque(true);
		btn4.addActionListener(this);
		p.add(btn4);
		
		btn5=new JButton("종료");
		btn5.setBackground(Color.WHITE);
		btn5.setOpaque(true);
		btn5.addActionListener(this);
		p.add(btn5);
		
		add(p, BorderLayout.EAST);
		
		// 테이블 추가
		addTable();
		
		setTitle("성적처리"); // 윈도우 타이틀
		setSize(670, 500); // 윈도우 사이즈
		setResizable(false); // 윈도우 사이즈 변경 불가
		setVisible(true); // 윈도우 활성화
	}
	
	private void addTable() {
		String[] title={"학번", "이름", "생년월일",
				"국어", "영어", "수학", "총점", "평균"};
		
		MyTableModel model=new MyTableModel(title);
		table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);
		add(sp, BorderLayout.CENTER);
		
		// 자동 크기 변경 OFF
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		// 컬럼폭 변경
		for(int i=0; i<title.length; i++) {
			TableColumn col=
					table.getColumnModel().getColumn(i);
			if(i==1)
				col.setPreferredWidth(100);
			else if(i==2)
				col.setPreferredWidth(80);
			else
				col.setPreferredWidth(60);
		}
		
		// 컬럼 정렬 방식 변경
		MyTableCellRenderer render = new MyTableCellRenderer();
		table.setDefaultRenderer(table.getColumnClass(0), render);
	}
	
	public void tableInsertRow(String[] items) {
		// 테이블에 자료 추가
		((MyTableModel)table.getModel()).addRow(items);
	}
	
	public void tableUpdateRow(String[] items, int row) {
		// 해당 행의 데이터 수정
		for(int i=0; i<items.length; i++) {
			((MyTableModel)table.getModel()).setValueAt(items[i], row, i);
		}
	}
	
	public void tableRemoveRow(int row) {
		// 테이블의 특정 행 지우기
		((MyTableModel)table.getModel()).removeRow(row);
	}
	
	public void tableRemoveAll() {
		// 테이블의 모든 행 지우기
		int size=table.getRowCount();
		for(int i=0; i<size; i++)
			((MyTableModel)table.getModel()).removeRow(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			// 추가
			new ScoreInsert(this);
			
		} else if(e.getSource()==btn2) {
			// 수정
			int idx=table.getSelectedRow();
			if(idx==-1) {
				JOptionPane.showMessageDialog(this,
						"수정할 자료를 먼저 선택하세요.");
				return;
			}
			
			int cnt=((MyTableModel)table.getModel()).getColumnCount();
			String[] items=new String[cnt];
			for(int i=0; i<cnt; i++)
				items[i]=table.getValueAt(idx, i).toString();
			
			new ScoreUpdate(this, items, idx);
			
		} else if(e.getSource()==btn3) {
			// 삭제
			int idx=table.getSelectedRow();
			if(idx==-1) {
				JOptionPane.showMessageDialog(this,
						"삭제할 자료를 먼저 선택하세요.");
				return;
			}
			
			int result;
			result=JOptionPane.showConfirmDialog(this,
					"선택한 자료를 삭제하시겠습니까 ?",
					"확인",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(result==JOptionPane.YES_OPTION)
				tableRemoveRow(idx);
			
		} else if(e.getSource()==btn4) {
			// 전체 삭제
			int result;
			result=JOptionPane.showConfirmDialog(this,
					"모든자료를 삭제하시겠습니까 ?",
					"확인",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(result==JOptionPane.YES_OPTION) {
				tableRemoveAll();
			}
		} else if(e.getSource()==btn5) {
			// 종료
			int result = JOptionPane.showConfirmDialog(this,
					"종료하시겠습니까 ?", "확인",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}			
		}
	}
}
