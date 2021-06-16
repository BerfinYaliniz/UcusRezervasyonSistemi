import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	public void giris() throws SQLException // Kayýt eklemek için kullandýðým metod
	{

		String  email, sifre;
		email = textField.getText();
		sifre = passwordField.getText();

		String girissorgusu = "SELECT * from yolcu_db where member_email='" + email + "' && member_password='" + sifre + "'"; //veritabanýndan giriþ ekraný bilgilerini çekmek için
		
			Statement sta = MyConnection.baglan.createStatement();
			ResultSet rs=sta.executeQuery(girissorgusu);
			if(rs.next()) { // giriþ bilgileri boþ deðilse anasayfaya yönlendirir.
				HomePage hpage=new HomePage();
				hpage.show();
			}
			else {
				JOptionPane.showMessageDialog(this, "email ya da sifre yanlýþ"); //giriþ bilgileri yanlýþ girildiðinde dönecek mesaj kutusu
				textField.setText("");
				passwordField.setText("");
			}
			
}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(57, 137, 87, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblifre = new JLabel("\u015Eifre");
		lblifre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblifre.setBounds(57, 211, 87, 27);
		contentPane.add(lblifre);
		
		textField = new JTextField();
		textField.setBounds(138, 132, 219, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 209, 219, 34);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Giri\u015F Ekran\u0131");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(177, 43, 163, 60);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Giri\u015F");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					MyConnection.baglantiAc();
				try {
					giris();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				MyConnection.baglantiKapat();
			}
		});
		btnNewButton.setBounds(253, 298, 131, 54);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kaydol");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //kaydol butonu fonksiyonu
				RegisterForm regform=new RegisterForm();
				regform.show();
		
			}
		});
		btnNewButton_1.setBounds(101, 298, 116, 54);
		contentPane.add(btnNewButton_1);
	}

}
