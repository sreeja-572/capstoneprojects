package medicare.testpages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import medicare.pages.AddProductToCartPage;
import medicare.pages.LoginPage;
import medicare.pages.PlaceOrderPage;
import medicare.base.Base;

public class PlaceOrderPageTest extends Base {
	
	
	LoginPage lp;
	
	AddProductToCartPage apc;
	
	PlaceOrderPage po;
	
	@BeforeTest
	public void openApplication() throws InterruptedException {

		openBrowser("Chrome");

		lp = new LoginPage(driver);
		
		apc = new AddProductToCartPage(driver);
		po = new PlaceOrderPage(driver);
		
		
	}
	
	@Test(priority='1')
	public void test_login()
	{
		lp.LoginUser();
	}
	
	@Test(priority='2')
	public void cart() throws InterruptedException
	{
		apc.Cart();
	}
	@Test(priority='3')
	public void PlaceOrder() throws InterruptedException
	{
		po.PlaceOrders();
	}

}
