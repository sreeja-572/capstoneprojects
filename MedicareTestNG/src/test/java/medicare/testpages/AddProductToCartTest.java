package medicare.testpages;

//import java.io.IOException;

//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import Utilities.Xls_DataProvider2;
import medicare.base.Base;
import medicare.pages.AddProductToCartPage;
import medicare.pages.LoginPage;
//import medicare.pages.RegisterPage;

public class AddProductToCartTest extends Base {
	
	LoginPage lp;
	//RegisterPage rp;
	AddProductToCartPage apc;
	
	@BeforeTest
	public void openApplication() throws InterruptedException {

		openBrowser("Chrome");

		lp = new LoginPage(driver);
		
		
		
		apc = new AddProductToCartPage(driver);
		
		
	}
	
	/*@Test(priority=1)
	
	public void ViewProduct() {
		apc.ViewProducts();
	}*/
	
	/* @Test(priority = '1', dataProvider = "testdata")
	public void LoginUser(String email1, String password1) throws InterruptedException {

		
		
		lp.LoginUser(email1,password1);
		Thread.sleep(2000);
		apc.ViewProducts();
		Thread.sleep(2000);
		apc.AddToCart();
		Thread.sleep(2000);
		apc.Cart();
		

	}
	
	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = Xls_DataProvider2.getTestData("Sheet1");
		return input;
	}
	
	/*
	@Test(priority='2')
	
	public void AddToCart() {
		apc.AddtoCart;
	}*/
	
	@Test(priority='1')
	public void test_login()
	{
		lp.LoginUser();
	}
	
	@Test(priority='2')
	public void ViewProducts() throws InterruptedException
	{
		apc.ViewProducts();
	}
	@Test(priority='3')
	public void test_add_product_to_cart() throws InterruptedException
	{
		apc.AddToCart();
	}
	@Test(priority='4')
	public void cart() throws InterruptedException
	{
		apc.Cart();
	}

}
