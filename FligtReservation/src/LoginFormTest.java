import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class LoginFormTest {
	//Her methoda sýnýf örneðini oluþturmamak için field tanýmlandý.
	private LoginForm loginForm;
	
	 // Her test methoduna girmeden önce setUp methoduna girecek ve sýnýfýn örneðini oluþturacak.
	@Before
	public void setUp() throws Exception {
		loginForm =new LoginForm();
	}

	@Test
	public void testGirisDurumu() {
		
	}

	@Test
	public void testMain() {
	
	}
	
	@Test
	public void testLoginForm() {
		fail("Not yet implemented");
	}
//Test methodu çalýþmasýný bitirdikten sonra tearDown methoduna girecek ve ilgili sýnýfý null olarak set edecek.
	@After
	public void tearDown() throws Exception {
		loginForm=null;
	}
}
