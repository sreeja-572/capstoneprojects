package medicare.testpages;

//import java.io.IOException;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import Utilities.Xls_DataProvider2;

import medicare.pages.LoginPage;
import medicare.base.Base;


public class LoginPageTest extends Base {
	
	LoginPage lp;
	
	@BeforeClass
	public void OpenApp() throws InterruptedException {

		openBrowser("Chrome");
		Thread.sleep(2000);
		lp = new LoginPage(driver);
	
		} 
		
		/*@Test(priority = '1', dataProvider = "testdata")
		public void LoginUser(String email1, String password1) throws InterruptedException {

			
			
			lp.LoginUser(email1,password1);
			lp.Logout();

		}
		
		@DataProvider(name = "testdata")
		public Object[][] datasupplier() throws IOException {

			Object[][] input = Xls_DataProvider2.getTestData("Sheet1");
			return input;
		}*/
	
	@Test(priority='1')
	public void test_login()
	{
		lp.LoginUser();
	}

}
