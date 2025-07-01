package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("Title: " + driver.getTitle());
        
        driver.manage().window().maximize();
        
        //Take screenshot
        TakesScreenshot ss = (TakesScreenshot)driver;
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        
        //specify the path
        File desitination = new File("C:/Users/Trainers/Desktop/Java Selenium/Screenshots/SecondScreenshot.png");
        
        // copy file
        FileUtils.copyFile(screenshot, desitination);
        
        

	}

}
