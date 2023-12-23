package medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//WebDriver driver;

			// Create PageFactory
		
		
		@FindBy(id = "email")
		WebElement email;
		
		@FindBy(id = "password")
		WebElement password;
		
		@FindBy(xpath = "//button[@class=\"btn btn-success\"]")
		WebElement login;
		
		@FindBy(linkText = "Logout")
		WebElement logout;
		
		
		
		public LoginPage(WebDriver driver) {

			PageFactory.initElements(driver, this);
		}
		
		
			
		
		
	/*public void LoginUser(String email1, String password1)  {
			
			// Actions

			
			email.clear();
			email.sendKeys(email1);
			
				
			password.clear();
			password.sendKeys(password1);
			
			login.click();
		

	}*/
	
	public void LoginUser()
	{
		email.sendKeys("saikiran1234@gmail.com");
		password.sendKeys("123456");
		login.click();
	}

	public void Logout() {
		logout.click();
	}

}
