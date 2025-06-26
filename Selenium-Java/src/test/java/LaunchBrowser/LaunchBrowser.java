package LaunchBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("Title: " + driver.getTitle());
        
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/fieldset/label[1]/input[1]")).click();
        
        //Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@value = 'radio3']")).click();
        
        driver.findElement(By.xpath("//input[@id= 'name']")).sendKeys("hello anandh");
        
        //driver.quit();
	}
	

}
