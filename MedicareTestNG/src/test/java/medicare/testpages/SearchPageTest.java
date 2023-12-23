package medicare.testpages;
//import java.io.IOException;

import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import Utilities.Xls_DataProvider2;
import medicare.base.Base;
import medicare.pages.LoginPage;
import medicare.pages.SearchPage;
public class SearchPageTest extends Base {
	
	LoginPage lp;
	SearchPage sp;
	
	
	@BeforeMethod
	public void start_browser() throws InterruptedException {
		openBrowser("Chrome");
		
		//rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
		
		//Thread.sleep(2000);
		
		sp = new SearchPage(driver);
		
		
	}
	@Test(priority='1')
	public void test_login() throws InterruptedException
	{
		lp.LoginUser();
		Thread.sleep(2000);
		sp.Search();
	}
	/*@Test(priority='2')
	public void Search() throws InterruptedException
	{
		sp.Search();
	}*/
	
	
}
