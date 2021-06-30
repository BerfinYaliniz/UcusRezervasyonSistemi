package Ucak_rezervasyon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atlas_sefer_ekle extends JFrame {
	MyConnection m=new MyConnection();
	private JPanel contentPane;
	private JTextField Nereden;
	private JTextField Nereye;
	public Statement stt=null;
	private JTextField sefer_num;
	private JTextField koltuk_num;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atlas_sefer_ekle frame = new Atlas_sefer_ekle();
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
	public Atlas_sefer_ekle() {
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label_sefer_ekle = new Label("Sefer Ekle");
		label_sefer_ekle.setBounds(5, 5, 584, 33);
		label_sefer_ekle.setBackground(Color.PINK);
		label_sefer_ekle.setAlignment(Label.CENTER);
		label_sefer_ekle.setFont(new Font("Dialog", Font.PLAIN, 21));
		label_sefer_ekle.setForeground(Color.BLACK);
		contentPane.add(label_sefer_ekle);
		
		Nereden = new JTextField();
		Nereden.setBounds(5, 72, 160, 33);
		contentPane.add(Nereden);
		Nereden.setColumns(10);
		
		Nereye = new JTextField();
		Nereye.setColumns(10);
		Nereye.setBounds(5, 139, 160, 33);
		contentPane.add(Nereye);
		
		Label label = new Label("Nereden");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBackground(Color.WHITE);
		label.setForeground(Color.BLACK);
		label.setBounds(5, 44, 69, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Nereye");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(5, 111, 58, 22);
		contentPane.add(label_1);
		
		JButton sefer_ekle_button = new JButton("Sefer_ekle");
		sefer_ekle_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 m.baglantiAc();
				 int num=Integer.valueOf(sefer_num.getText());
				 String basl=Nereden.getText();
				 String son=Nereye.getText();
				 int kt=Integer.valueOf(koltuk_num.getText());
					m.sefer_ekle(num,basl,son,kt);
					Pegasus_sefer p=new Pegasus_sefer();
					p.setVisible(true);
				}
		});
		sefer_ekle_button.setFont(new Font("Tahoma", Font.BOLD, 16));
		sefer_ekle_button.setForeground(Color.GREEN);
		sefer_ekle_button.setBounds(434, 330, 137, 44);
		contentPane.add(sefer_ekle_button);
		
		JButton Geri_button = new JButton("GER\u0130");
		Geri_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                Pegasus_sefer pg=new Pegasus_sefer();
				
				pg.setVisible(true);
			}
		});
		Geri_button.setFont(new Font("Tahoma", Font.BOLD, 11));
		Geri_button.setForeground(Color.RED);
		Geri_button.setBounds(10, 334, 69, 44);
		contentPane.add(Geri_button);
		
		Label label_1_1 = new Label("Sefer numara:");
		label_1_1.setForeground(Color.BLACK);
		label_1_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1_1.setBackground(Color.WHITE);
		label_1_1.setBounds(5, 178, 113, 22);
		contentPane.add(label_1_1);
		
		sefer_num = new JTextField();
		sefer_num.setColumns(10);
		sefer_num.setBounds(5, 206, 160, 33);
		contentPane.add(sefer_num);
		
		Label label_1_2 = new Label("Koltuk say\u0131s\u0131:");
		label_1_2.setForeground(Color.BLACK);
		label_1_2.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1_2.setBackground(Color.WHITE);
		label_1_2.setBounds(10, 245, 98, 22);
		contentPane.add(label_1_2);
		
		koltuk_num = new JTextField();
		koltuk_num.setColumns(10);
		koltuk_num.setBounds(5, 273, 160, 33);
		contentPane.add(koltuk_num);
	}
}