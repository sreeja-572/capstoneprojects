package medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProductToCartPage {
	
	// Find the locator with the help of PageFactory

		/*@FindBy(id = "search-product")
		WebElement search;
		
		@FindBy(id = "cart101")
		WebElement AddtoCart;
		
		@FindBy(id = "search-product-button")
		WebElement submit;*/
	@FindBy(xpath="//a[@id='product103']")
	//@FindBy(id = "product103")
	//@FindBy(linkText = "View Product")
	//@FindBy(xpath = "//a[@href='view-product?id=106']")
	WebElement ViewProductbtn;
	
	
	@FindBy(xpath = "//a[@class='btn btn-success']")
	//@FindBy(id = "cart103")
	//@FindBy(xpath = "//a[@id='cart110']")
	//@FindBy(linkText = "Add to Cart")
	WebElement AddtoCartbtn;
	
	
	
	//WebElement AddtoCart;
	
	@FindBy(xpath = "//a[@class='nav-link text-success']")
	WebElement Cartbtn;
		
		public AddProductToCartPage(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}
		
		// Actions

		/*public void SearchProduct(String productname1) {

			search.clear();
			search.sendKeys(productname1);

		}*/
		
		public void ViewProducts() {
			
			ViewProductbtn.click();
			
		}
		
		public void AddToCart() {
			
			AddtoCartbtn.click();
			
		}
		
		public void Cart() {
			
			Cartbtn.click();
			
		}
		
}
