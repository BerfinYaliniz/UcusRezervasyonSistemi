package Ucak_rezervasyon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Anadolu_jt_sefer extends JFrame {
	
	public void sefergetir() {
         
		

    	 
	}
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MyConnection mc=new MyConnection();
		mc.baglantiAc();
		System.out.println("baslangic:"+mc.sefer_baslangic_getir(0));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pegasus_sefer frame = new Pegasus_sefer();
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
	public Pegasus_sefer() {
		 MyConnection mc=new MyConnection();
		mc.baglantiAc();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("SEFERLER");
		label.setBounds(5, 5, 716, 28);
		label.setBackground(Color.ORANGE);
		label.setForeground(Color.RED);
		label.setFont(new Font("Dialog", Font.PLAIN, 17));
		label.setAlignment(Label.CENTER);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("GER\u0130");
		btnNewButton.setBounds(0, 639, 84, 34);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Yonetici geri=new Yonetici();
				geri.setVisible(true);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton sefer_ekle_btn = new JButton("Sefer Ekle");
		sefer_ekle_btn.setBounds(620, 39, 101, 34);
		sefer_ekle_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pegasus_sefer_ekle pg_sf_ekle=new Pegasus_sefer_ekle();
				pg_sf_ekle.setVisible(true);
			}
		});
		sefer_ekle_btn.setFont(new Font("Tahoma", Font.BOLD, 11));
		sefer_ekle_btn.setForeground(Color.BLUE);
		contentPane.add(sefer_ekle_btn);
		
		
	
		
		JButton[] bt;
		bt=new JButton[mc.tablo_uzunluk()];
		
		 for(int i=1;i<mc.tablo_uzunluk();i++) {
			
			 bt[i] =(JButton) new JButton(mc.sefer_baslangic_getir(mc.sefer_id(i))+"---"+mc.sefer_bitis_getir(mc.sefer_id(i)));
			bt[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
				}
			});
			bt[i].setFont(new Font("Tahoma", Font.BOLD, 17));
			bt[i].setForeground(Color.RED);
			if(i!=1) {
			bt[i].setBounds(23, i*50, 386, 34);
			}
			else {
				bt[i].setBounds(23, 50, 386, 34);
			}
			contentPane.add(bt[i]);
		 }
			mc.baglantiKapat();
		 
	}
}