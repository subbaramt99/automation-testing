package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;

public class LoginPage {
	
	protected WebDriver driver;
	
	//Locators
	By usernameInput = By.cssSelector("#username");
	By passwordInput = By.cssSelector("#password");
	By login_btnInput = By.cssSelector("#signInBtn");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void goToLoginPage(String url) {
		driver.get(url);
	}
	
	@Parameters({"username"})
	public void enterUsername(String username) {
		driver.findElement(usernameInput).sendKeys(username);
	}
	
	@Parameters({"password"})
	public void enterPassword(String password) {
		driver.findElement(passwordInput).sendKeys(password);
	}
	

	public void clickLogin() {
		driver.findElement(login_btnInput).click();
	}
	
	public String geturl() {
		return driver.getCurrentUrl();
	}
	
	

}
