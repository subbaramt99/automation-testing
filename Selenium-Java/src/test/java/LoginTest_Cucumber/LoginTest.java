package LoginTest_Cucumber;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	
	@Before
	public void hooks() {
		WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
	}
	
	@Given("launch the browser with url")                // Step definitions
	public void launch_broser() {
		
		//WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
		
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        System.out.println("Title: " + driver.getTitle());
        
        
	}
	
	@When("user enter username and password {string} {string}")
	public void entering_credentials(String username, String password) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		
	}
	
	@When("select the admin user as student")
	public void selecting_usertype_std() {
		driver.findElement(By.xpath("//span[text() = 'Admin']")).click();	    
	}

	@Then("click on login buttom")
	public void click_on_login_button() {
		driver.findElement(By.id("signInBtn")).click();
	}
	
	@When("select the admin user as teacher")
	public void selecting_usertype_tec() {
		driver.findElement(By.xpath("//span[text() = 'Admin']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class = 'form-control']"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Teacher");
	}
	
	@And("select the admin user as consultant")
	public void selecting_usertype_cons() {
		driver.findElement(By.xpath("//span[text() = 'Admin']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class = 'form-control']"));
		
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Consultant");
	}
	
	@And("closing the browser")
	public void cls_brws() {
		driver.quit();
	}
	
	@And("add the product in cart {string}")
	public void adding_prd_in_cart(String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class = 'card h-100']")));

		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class = 'card h-100']"));
		
		//String xpath = String.format("//div/h4/a[contains(text(), '%s')]", name);
		
		
	    for (WebElement product : products) {
	    	
	        String productName = product.findElement(By.xpath(".//h4/a")).getText();
	        
	        if(productName.contains(name)) {
	        	
	        	System.out.println("Going to add the " + productName);

	        	WebElement addButton = product.findElement(By.xpath(".//button[@class = 'btn btn-info']"));
	            
	        	wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
	        }

	    }
		
		
	}

}
