package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	@Test
	public void method1() {
		System.out.println("my test is running");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
