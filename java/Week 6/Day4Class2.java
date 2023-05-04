import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Day4Class2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Day4Class2 frame = new Day4Class2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Day4Class2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Heading = new JLabel("CALCULATOR\r\n");
		Heading.setHorizontalAlignment(SwingConstants.CENTER);
		Heading.setFont(new Font("Times New Roman", Font.BOLD, 16));
		Heading.setBounds(126, 25, 109, 20);
		contentPane.add(Heading);
		
		JLabel LabelA = new JLabel("A");
		LabelA.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		LabelA.setBounds(78, 72, 8, 15);
		contentPane.add(LabelA);
		
		tfa = new JTextField();
		tfa.setBounds(126, 69, 217, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel LabelB = new JLabel("B");
		LabelB.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		LabelB.setBounds(78, 115, 8, 15);
		contentPane.add(LabelB);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(126, 112, 217, 20);
		contentPane.add(tfb);
		
		JLabel LabelResult = new JLabel("Result");
		LabelResult.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		LabelResult.setBounds(78, 161, 31, 15);
		contentPane.add(LabelResult);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(126, 158, 217, 20);
		contentPane.add(tfr);
		
		JButton ADD = new JButton("ADD");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to add
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1+var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		ADD.setBackground(new Color(240, 240, 240));
		ADD.setForeground(new Color(0, 0, 0));
		ADD.setBounds(22, 206, 53, 23);
		contentPane.add(ADD);
		
		JButton btnSub = new JButton("SUB");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for sub
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1-var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		btnSub.setForeground(Color.BLACK);
		btnSub.setBackground(SystemColor.menu);
		btnSub.setBounds(99, 206, 53, 23);
		contentPane.add(btnSub);
		
		JButton btnMul = new JButton("MUL");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mul
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1*var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		btnMul.setForeground(Color.BLACK);
		btnMul.setBackground(SystemColor.menu);
		btnMul.setBounds(182, 206, 53, 23);
		contentPane.add(btnMul);
		
		JButton btnDiv = new JButton("DIV");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DIV
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1/var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setBackground(SystemColor.menu);
		btnDiv.setBounds(259, 206, 53, 23);
		contentPane.add(btnDiv);
		
		JButton btnRem = new JButton("REM");
		btnRem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//REM
				String data1=tfa.getText();
				String data2=tfb.getText();
				int var1=Integer.valueOf(data1);
				int var2=Integer.valueOf(data2);
				int res=var1%var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		btnRem.setForeground(Color.BLACK);
		btnRem.setBackground(SystemColor.menu);
		btnRem.setBounds(337, 206, 53, 23);
		contentPane.add(btnRem);
	}
}
