package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        
        Actions action = new Actions(driver);
        
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        
        //driver.findElement(By.xpath("//button[contains(text(), 'Mouse')]"));
        
       
        
        
        
//        WebElement hover = driver.findElement(By.xpath("//button[contains(text(), 'Mouse')]"));
//        
//        action.moveToElement(hover).perform();
//        js.executeScript("window.scrollTo(0, 1000)");
//        
//        action.moveToElement(hover).perform();
//        
//        driver.findElement(By.xpath("(//div[@class = 'mouse-hover-content']/a)[1]")).click();
//        
//        
//        WebElement rightClick = driver.findElement(By.xpath("//button[contains(text(), 'Mouse')]"));
//        action.moveToElement(hover).contextClick().perform();
        
       driver.switchTo().frame(3);
        
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
       WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id = 'gallery']//li[1]//img")));
        
        
        WebElement target = driver.findElement(By.id("trash"));
        
        
        action.dragAndDrop(source, target).perform();
        
        
	
	}

}
