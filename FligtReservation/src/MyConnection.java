import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection extends javax.swing.JFrame {
	public static Connection baglan;

	public static void baglantiAc() // Bu k�s�m benim ba�lant� a�mak i�in kulland���m metot k�sm�
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String bag = "jdbc:mysql://localhost:3306/member_db";
			String kullaniciadi = "root";
			String sifre = "1234";
			baglan = DriverManager.getConnection(bag, kullaniciadi, sifre);
			System.out.println("Veritaban�na Ba�lant� Ba�ar�l� Bir �ekilde Ger�ekle�ti.");
		} catch (Exception e) {
			System.out.println("Veri taban�na ba�lan�lamad�");
		}
	}

	public static void baglantiKapat()
//Bu k�s�m benim ba�lant�y� kesmek i�in kulland���m metot k�sm�
	{
		try {
			baglan.close();
			System.out.println("Veritaban�na Ba�lant� Ba�ar�l� Bir �ekilde Kapat�ld�, Sonland�r�ld�.");
		} catch (SQLException e) {
			System.out.println("Veritaban� Ba�lant�s� Kopar�l�rken Bir Hata Meydana Geldi" + e);
		}
	}
}