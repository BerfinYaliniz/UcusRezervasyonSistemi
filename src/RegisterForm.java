import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JPasswordField passwordField;

	@SuppressWarnings("deprecation")
	public static void ekle() // Kayýt eklemek için kullandýðým metod
	{

		String adres, dogum, email, ad, sifre;

		adres = textField.getText();
		dogum = textField_1.getText();
		email = textField_4.getText();
		ad = textField_5.getText();
		sifre = passwordField.getText();

		String eklesorgusu = "INSERT INTO yolcu_db (member_name,member_email,member_password,member_birth,member_address) values ('"
				+ ad + "','" + email + "','" + sifre + "','" + dogum + "','" + adres + "')";
		try {
			Statement sta = MyConnection.baglan.createStatement();
			sta.execute(eklesorgusu);
			System.out.println("Veritabanýna Kayýt Baþarý Ýle Eklendi...");
			JOptionPane.showMessageDialog(null, "Kayýt Baþarýlý"); //Kayýt baþarýlý olduðunda verilecek mesaj kutusu
		} catch (SQLException e) { //Veritabanýna kayýt eklenmediði zaman hata mesajý
			System.out.println(e.toString());
			System.out.println("Veritabanýna Kayýt Eklenemedi...");
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterForm frame = new RegisterForm();
					frame.setVisible(true);//kayýt formunu ekrana getirir.
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegisterForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Ad Soyad");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(103, 82, 89, 34);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(113, 134, 67, 17);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("\u015Eifre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(115, 187, 65, 17);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Do\u011Fum Tarihi");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(76, 229, 106, 31);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Adres");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(110, 271, 54, 31);
		contentPane.add(lblNewLabel_4);

		textField = new JTextField();
		textField.setBounds(196, 267, 190, 66);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 236, 190, 20);
		contentPane.add(textField_1);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(196, 134, 190, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(196, 91, 190, 20);
		contentPane.add(textField_5);

		passwordField = new JPasswordField();
		passwordField.setBounds(196, 187, 190, 20);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("KAYDOL");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {//Kaydol butonunun fonksiyonu
				
				MyConnection.baglantiAc();
				String adres, dogum, email, ad, sifre;
				adres = textField.getText();
				dogum = textField_1.getText();
				email = textField_4.getText();
				ad = textField_5.getText();
				sifre = passwordField.getText();
				  if(ad.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Lütfen adýnýzý yazýn!");
			        }
			        
			        else if(sifre.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Þifre alanýný boþ býrakmayýn!");
			        }
			         else if(email.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "EMail alanýný boþ býrakmayýn!");
			        } 
			         else if(dogum.equals(""))
			        {
			            JOptionPane.showMessageDialog(null, "Doðum tarihi alanýný boþ býrakmayýn!");
			        }
			      
			        else {
				ekle();
				MyConnection.baglantiKapat();
				LoginForm logform = new LoginForm();
				logform.show();
				
			}}

		});
		btnNewButton.setBounds(297, 344, 89, 34);
		contentPane.add(btnNewButton);

		JButton btnIptalEt = new JButton("\u0130PTAL ET");
		btnIptalEt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIptalEt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// iptal et butonu fonksiyonu
				LoginForm logform = new LoginForm();
				logform.show();

			}
		});
		btnIptalEt.setBounds(185, 344, 89, 34);
		contentPane.add(btnIptalEt);

		JLabel lblNewLabel_5 = new JLabel("KAYIT OL");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(231, 11, 97, 57);
		contentPane.add(lblNewLabel_5);
	}
}
