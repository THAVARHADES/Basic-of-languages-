import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class Day5Class1 extends JFrame {

	private JPanel contentPane;
	private JTextField ta1;
	private JTextField ta2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Day5Class1 frame = new Day5Class1();
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
	public Day5Class1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SORTING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel.setBounds(166, 11, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter No. for sorting");
		lblNewLabel_1.setBounds(30, 53, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("No. after Sorting");
		lblNewLabel_1_1.setBounds(30, 113, 99, 14);
		contentPane.add(lblNewLabel_1_1);
		
		ta1 = new JTextField();
		ta1.setBounds(166, 50, 189, 20);
		contentPane.add(ta1);
		ta1.setColumns(10);
		
		ta2 = new JTextField();
		ta2.setColumns(10);
		ta2.setBounds(166, 111, 189, 17);
		contentPane.add(ta2);
		
		JButton sort = new JButton("Bubble Sorting");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//enter the code
				String sentence=ta1.getText();
				String arr[]=sentence.split(" ");
				String help;
				for(int i=0;i<=arr.length-2;i++) {
					for(int j=0;j<=arr.length-2-i;j++) {
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1])) {
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				String result="";
				for(int i=0;i<=arr.length-1;i++) {
					result=result+arr[i]+" ";
				}
				ta2.setText(result);
			}
		});
		sort.setBounds(161, 187, 101, 23);
		contentPane.add(sort);
	}

}
