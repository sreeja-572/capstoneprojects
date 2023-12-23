package medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	
	
	@FindBy(xpath = "//a[@class='nav-link text-success']")
	WebElement Cart;
	
	@FindBy(xpath = "//a[@id='place-order']")
	WebElement PlaceOrderbtn;
	
		public PlaceOrderPage(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}
		
		/*public void ViewProducts() {
			
			ViewProduct.click();
			
		}
		public void AddToCart() {
			
			AddtoCart.click();
			
		}*/
		
		public void Cart() {
			
			Cart.click();
			
		}
		
		public void PlaceOrders() {
			
			PlaceOrderbtn.click();
			
		}
		

}
