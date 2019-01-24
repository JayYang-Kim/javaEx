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
		
		JPanel p=new JPanel(); // ��Ҹ� �׷�ȭ ������
		p.setLayout(new GridLayout(5, 1)); // GridLayout(��, ��)
		
		btn1=new JButton("�߰�");
		btn1.setBackground(Color.WHITE);
		btn1.setOpaque(true); // ������ �ֱ�����(��������)
		btn1.addActionListener(this);
		p.add(btn1);
		
		btn2=new JButton("����");
		btn2.setBackground(Color.WHITE);
		btn2.setOpaque(true);
		btn2.addActionListener(this);
		p.add(btn2);

		btn3=new JButton("����");
		btn3.setBackground(Color.WHITE);
		btn3.setOpaque(true);
		btn3.addActionListener(this);
		p.add(btn3);
		
		btn4=new JButton("��ü����");
		btn4.setBackground(Color.WHITE);
		btn4.setOpaque(true);
		btn4.addActionListener(this);
		p.add(btn4);
		
		btn5=new JButton("����");
		btn5.setBackground(Color.WHITE);
		btn5.setOpaque(true);
		btn5.addActionListener(this);
		p.add(btn5);
		
		add(p, BorderLayout.EAST);
		
		// ���̺� �߰�
		addTable();
		
		setTitle("����ó��"); // ������ Ÿ��Ʋ
		setSize(670, 500); // ������ ������
		setResizable(false); // ������ ������ ���� �Ұ�
		setVisible(true); // ������ Ȱ��ȭ
	}
	
	private void addTable() {
		String[] title={"�й�", "�̸�", "�������",
				"����", "����", "����", "����", "���"};
		
		MyTableModel model=new MyTableModel(title);
		table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);
		add(sp, BorderLayout.CENTER);
		
		// �ڵ� ũ�� ���� OFF
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		// �÷��� ����
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
		
		// �÷� ���� ��� ����
		MyTableCellRenderer render = new MyTableCellRenderer();
		table.setDefaultRenderer(table.getColumnClass(0), render);
	}
	
	public void tableInsertRow(String[] items) {
		// ���̺� �ڷ� �߰�
		((MyTableModel)table.getModel()).addRow(items);
	}
	
	public void tableUpdateRow(String[] items, int row) {
		// �ش� ���� ������ ����
		for(int i=0; i<items.length; i++) {
			((MyTableModel)table.getModel()).setValueAt(items[i], row, i);
		}
	}
	
	public void tableRemoveRow(int row) {
		// ���̺��� Ư�� �� �����
		((MyTableModel)table.getModel()).removeRow(row);
	}
	
	public void tableRemoveAll() {
		// ���̺��� ��� �� �����
		int size=table.getRowCount();
		for(int i=0; i<size; i++)
			((MyTableModel)table.getModel()).removeRow(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			// �߰�
			new ScoreInsert(this);
			
		} else if(e.getSource()==btn2) {
			// ����
			int idx=table.getSelectedRow();
			if(idx==-1) {
				JOptionPane.showMessageDialog(this,
						"������ �ڷḦ ���� �����ϼ���.");
				return;
			}
			
			int cnt=((MyTableModel)table.getModel()).getColumnCount();
			String[] items=new String[cnt];
			for(int i=0; i<cnt; i++)
				items[i]=table.getValueAt(idx, i).toString();
			
			new ScoreUpdate(this, items, idx);
			
		} else if(e.getSource()==btn3) {
			// ����
			int idx=table.getSelectedRow();
			if(idx==-1) {
				JOptionPane.showMessageDialog(this,
						"������ �ڷḦ ���� �����ϼ���.");
				return;
			}
			
			int result;
			result=JOptionPane.showConfirmDialog(this,
					"������ �ڷḦ �����Ͻðڽ��ϱ� ?",
					"Ȯ��",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(result==JOptionPane.YES_OPTION)
				tableRemoveRow(idx);
			
		} else if(e.getSource()==btn4) {
			// ��ü ����
			int result;
			result=JOptionPane.showConfirmDialog(this,
					"����ڷḦ �����Ͻðڽ��ϱ� ?",
					"Ȯ��",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if(result==JOptionPane.YES_OPTION) {
				tableRemoveAll();
			}
		} else if(e.getSource()==btn5) {
			// ����
			int result = JOptionPane.showConfirmDialog(this,
					"�����Ͻðڽ��ϱ� ?", "Ȯ��",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (result == JOptionPane.YES_OPTION) {
				System.exit(0);
			}			
		}
	}
}
