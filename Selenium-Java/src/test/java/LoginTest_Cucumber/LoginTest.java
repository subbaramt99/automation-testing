package LoginTest_Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("launch the browser with url")                // Step definitions
	public void launch_broser() {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        System.out.println("Title: " + driver.getTitle());
        
        driver.manage().window().maximize();
	}
	
	@When("user enter username and password")
	public void entering_credentials() {
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
	}

}
