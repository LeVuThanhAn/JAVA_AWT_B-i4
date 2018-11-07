package bai4trang77;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Maytinh extends JFrame {
JLabel lblTH1;
JLabel lblTH2;
JLabel lblKQ;
JTextField tfKQ;
JTextField tfTH1;
JTextField tfTH2;
JButton btnCong;
JButton btnTru;
JButton btnNhan;
JButton btnChia;
public Maytinh()
{
	lblTH1 = new JLabel("num 1");
	lblTH2 = new JLabel("num 2");
	lblKQ = new JLabel("KQ");
	tfTH1 = new JTextField(10);
	tfTH2 = new JTextField(10);
	tfKQ = new JTextField(10);
	btnCong = new JButton("+");
	btnCong.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String TH1 = tfTH1.getText();
			String TH2 = tfTH2.getText();
			double n1 = Double.parseDouble(TH1);
			double n2 = Double.parseDouble(TH2);
			double tong = n1+n2;
			tfKQ.setText(String.valueOf(tong));
			
		}
	});
	btnTru = new JButton("-");
	btnTru.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String TH1 = tfTH1.getText();
			String TH2 = tfTH2.getText();
			double n1 = Double.parseDouble(TH1);
			double n2 = Double.parseDouble(TH2);
			double hieu = n1-n2;
			tfKQ.setText(String.valueOf(hieu));
			
		}
	});
	btnNhan = new JButton("*");
	btnNhan.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String TH1 = tfTH1.getText();
			String TH2 = tfTH2.getText();
			double n1 = Double.parseDouble(TH1);
			double n2 = Double.parseDouble(TH2);
			double tich = n1*n2;
			tfKQ.setText(String.valueOf(tich));
		}
	});
	btnChia = new JButton("/");
	btnChia.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String TH1 = tfTH1.getText();
			String TH2 = tfTH2.getText();
			double n1 = Double.parseDouble(TH1);
			double n2 = Double.parseDouble(TH2);
			double thuong = n1/n2;
			tfKQ.setText(String.valueOf(thuong));
		}
	});
//	Container cont = new Container();
	//Panel cont = new Panel();
	setSize(500,500);
	setLayout(new FlowLayout());
	this.add(lblTH1);
	this.add(tfTH1);
	this.add(lblTH2);
	this.add(tfTH2);
	this.add(lblKQ);
	this.add(tfKQ);
	this.add(btnCong);
	this.add(btnTru);
	this.add(btnNhan);
	this.add(btnChia);
	setVisible(true);
}
public static void main(String [] args)
{
	new Maytinh();
}

}
