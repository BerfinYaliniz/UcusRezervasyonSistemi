import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class LoginFormTest {
	//Her methoda s�n�f �rne�ini olu�turmamak i�in field tan�mland�.
	private LoginForm loginForm;
	
	 // Her test methoduna girmeden �nce setUp methoduna girecek ve s�n�f�n �rne�ini olu�turacak.
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
//Test methodu �al��mas�n� bitirdikten sonra tearDown methoduna girecek ve ilgili s�n�f� null olarak set edecek.
	@After
	public void tearDown() throws Exception {
		loginForm=null;
	}
}
