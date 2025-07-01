package AlertAndWindows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAndWindows {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
     	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        
        //******************* Handling Browser Alert or Pop *****************************
        
        //driver.findElement(By.id("alertbtn")).click();
        
        driver.findElement(By.xpath("//input[@placeholder = 'Enter Your Name']")).sendKeys("Anandh");
        
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
        
        System.out.println(message + " is contains in Anandh ");
        
        
        
        //alert.dismiss();
        
      //******************* Handling Multiple windows *****************************
        
//       System.out.println(driver.getTitle());
//       driver.findElement(By.xpath("//a[contains(@href, 'qacl')]")).click();  // New tab
//       
//       String current_windows = driver.getWindowHandle();
//       Set<String> all_windows = driver.getWindowHandles();
//       
//       
//       for(String window : all_windows) {
//    	   if(!window.equals(current_windows) ) {
//    		   driver.switchTo().window(window);
//    	   }  
//       }
//       
//       System.out.println(driver.getTitle());
//       
//       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//       driver.findElement(By.xpath("//ul[@class = 'navbar-nav ml-auto']/li/a[text() = 'Courses']")).click();
        
        driver.quit();

	}

}
