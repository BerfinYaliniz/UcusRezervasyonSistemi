
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection{
	public static Connection baglan;
    public Statement st=null;
    
	public static void baglantiAc(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String bag = "jdbc:mysql://localhost:3306/member_db";
			String kullaniciadi = "root";
			String sifre = "1234";
			baglan = DriverManager.getConnection(bag, kullaniciadi, sifre);
			System.out.println("Veritabanýna Baðlantý Baþarýlý Bir Þekilde Gerçekleþti.");
		} catch (Exception e) {
			System.out.println("Veri tabanýna baðlanýlamadý");
		}
	}

	public static void baglantiKapat(){
		try {
			baglan.close();
			System.out.println("Veritabanýna Baðlantý Baþarýlý Bir Þekilde Kapatýldý, Sonlandýrýldý.");
		} catch (SQLException e) {
			System.out.println("Veritabaný Baðlantýsý Koparýlýrken Bir Hata Meydana Geldi" + e);
		}
	}
	
public void sefer_ekle(int no,String sefer_b,String sefer_s,int kt) {
		
		try {
		st=baglan.createStatement();
		String sorgu="INSERT INTO atlas(sefer_no,sefer_baslangic,sefer_bitis,koltuk_no) VALUES ('"+no+"','"+sefer_b+"','"+sefer_s+"','"+kt+"')";
		st.executeUpdate(sorgu);
		System.out.println("Baþarýlý  eklenildi...");
		}
		catch(SQLException ex) {
			System.out.println("Baþarýsýz...");
			ex.printStackTrace();
		}
	}
	
	public int tablo_uzunluk() {
		int sow = 0;
		try {
		String sorgu="Select * From atlas";
		st=baglan.createStatement();
		ResultSet rs=st.executeQuery(sorgu);
	     while(rs.next()) {
	       sow=rs.getInt("sefer_id");
	     }
		}
		catch(SQLException ex) {
			System.out.println("Sorun var!!!");
			return 0;
		}
		return sow;
	}
	
	public String sefer_baslangic_getir(int i) {
		String sorgu="Select * From atlas where sefer_id="+String.valueOf(i);
		String bas;
		try {
			st=baglan.createStatement();
			ResultSet rs=st.executeQuery(sorgu);	
			rs.next();
			bas=rs.getString("sefer_baslangic");
			 return bas;
		}
		catch(SQLException ex){
			System.out.println("Hata");
			return null;
		}
		
	}
	
	public String sefer_bitis_getir(int i) {
		String sorgu="Select * From atlas where sefer_id="+String.valueOf(i);
		String son=null;
		try {
			st=baglan.createStatement();
			ResultSet rs=st.executeQuery(sorgu);
			     rs.next();
				 son=rs.getString("sefer_bitis");
				 return son;
		}
		catch(SQLException ex){
			System.out.println("Hata");
			return null;
		}	
	}
	
	public int sefer_no(int i) {
		
		String sorgu="Select * From atlas";
		int tut;
		try {
			st=baglan.createStatement();
			ResultSet rs=st.executeQuery(sorgu);
			
			     while(rs.next()) {
			       tut=rs.getInt("sefer_id");
			       if(tut==i) {
			    	   return tut;
			       }
			     }
		}
		catch(SQLException ex){
			System.out.println("Hata");
		}
		return 0;
	}
	
	public int sefer_id(int i) {
		
		String sorgu="Select * From atlas";
		int tut;
	
		try {
			st=baglan.createStatement();
			ResultSet rs=st.executeQuery(sorgu);
			
			     while(rs.next()) {
			       tut=rs.getInt("sefer_id");
			       if(tut==i) {
			    	   return tut;
			       }
			     }
		}
		catch(SQLException ex){
			System.out.println("Hata");
		}
		return 0;
	}
   
	public static void main(String[] args) {
		MyConnection mc=new MyConnection();
		mc.baglantiAc();
		mc.sefer_ekle(2,"sehir","city",6);
		
	}
}