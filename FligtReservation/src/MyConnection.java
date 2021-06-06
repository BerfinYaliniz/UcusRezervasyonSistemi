import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection extends javax.swing.JFrame {
	public static Connection baglan;

	public static void baglantiAc() // Bu kýsým benim baðlantý açmak için kullandýðým metot kýsmý
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String bag = "jdbc:mysql://localhost:3306/member_db";
			String kullaniciadi = "root";
			String sifre = "1234";
			baglan = DriverManager.getConnection(bag, kullaniciadi, sifre);
			System.out.println("Veritabanýna Baðlantý Baþarýlý Bir Þekilde Gerçekleþti.");
		} catch (Exception e) {
			System.out.println("Veri tabanýna baðlanýlamadý");
		}
	}

	public static void baglantiKapat()
//Bu kýsým benim baðlantýyý kesmek için kullandýðým metot kýsmý
	{
		try {
			baglan.close();
			System.out.println("Veritabanýna Baðlantý Baþarýlý Bir Þekilde Kapatýldý, Sonlandýrýldý.");
		} catch (SQLException e) {
			System.out.println("Veritabaný Baðlantýsý Koparýlýrken Bir Hata Meydana Geldi" + e);
		}
	}
}