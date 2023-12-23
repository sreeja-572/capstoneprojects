package medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(linkText = "New User? Register Here")
	WebElement Registration;
	
	@FindBy(id = "name")
	WebElement name;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement Registerbutton;	
	
	public RegisterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void new_user_Register_here() {
		
	Registration.click();
	
	}
	
	public void RegisterUser(String name1, String email1, String password1) {
		
		// Actions

				
		
		
		name.clear();
		name.sendKeys(name1);
		
		email.clear();
		email.sendKeys(email1);
		
		password.clear();
		password.sendKeys(password1);
		
		Registerbutton.click();
	

}
}