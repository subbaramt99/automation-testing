package Test_with_TestNG;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_Commerce {
	
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.out.println("Running befor method");
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	
	@Parameters({"url"})
	@BeforeMethod
	public void url(String url) {
		driver.get(url);
	}
	
	@Test(priority = 3)
	public void Test_WebTable() {
		System.out.println("my test is running");
		
		String course = driver.findElement(By.xpath("//table[@id = 'product']/tbody/tr[10]/td[2]")).getText();
		System.out.println(course);
	}
	
	@Test(priority = 2)
	public void Test_Alert() {
		
		String alert_btn = "//input[@placeholder = 'Enter Your Name']";
		
//		FluentWait<WebDriver> wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(20))
//				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);   /// Fluentwait
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(alert_btn)));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath(alert_btn)).sendKeys("Anandh");
        
        driver.findElement(By.id("confirmbtn")).click();
        Alert alert = driver.switchTo().alert();
        
        String message = alert.getText();
        
        if(message.contains("Anandh")) {
        	alert.accept();
        	System.out.println("Pop is accepeted");
        }else {
        	alert.dismiss();
        	System.out.println("Pop is dismissed");
        	}
	}
	
	@Test(priority = 1)
	public void Test_Dropdown() {
		
		String dropdown_id = "dropdown-class-example";
		
//		WebDriverWait wait = WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(dropdown_id)));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropdown = driver.findElement(By.id(dropdown_id));

		Select static_dropdown = new Select(dropdown);
		
		static_dropdown.selectByIndex(1);
	}


	@AfterClass
	public void teardown() {
		
		driver.quit();
	}

}
