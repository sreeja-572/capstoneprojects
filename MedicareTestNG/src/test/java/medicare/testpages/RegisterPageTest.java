package medicare.testpages;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.Xls_DataProvider;
import medicare.base.Base;

//import medicare.pages.HomePage;
import medicare.pages.RegisterPage;

public class RegisterPageTest extends Base {

	//	HomePage hp;
		RegisterPage rp;
		
		
		@BeforeMethod
		public void openApplication() throws InterruptedException {

			openBrowser("Chrome");

			//hp = new HomePage(driver);
			
			Thread.sleep(2000);
			
			rp = new RegisterPage(driver);
		}
		
		
		@Test(priority = '1', dataProvider = "testdata")
		public void RegisterUser(String name1, String email1, String password1) {

			rp.new_user_Register_here();
			
			rp.RegisterUser(name1,email1,password1);

		}
		
		@DataProvider(name = "testdata")
		public Object[][] datasupplier() throws IOException {

			Object[][] input = Xls_DataProvider.getTestData("Sheet1");
			return input;
		}

}
