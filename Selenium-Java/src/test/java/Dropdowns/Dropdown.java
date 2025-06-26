package Dropdowns;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import LaunchBrowser.LaunchBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("Title: " + driver.getTitle());
        
        driver.manage().window().maximize();
        
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));   
        
        //System.out.println(driver.findElement(By.id("dropdown-class-example")));

		Select static_dropdown = new Select(dropdown);
		
		static_dropdown.selectByIndex(1);
		static_dropdown.selectByValue("option3");
		static_dropdown.selectByVisibleText("Option2");
		static_dropdown.deselectAll();
		
		//List<WebElement> options = static_dropdown.getOptions();

	}
	
	public String dummy(int a) {
		System.out.println(a);
		
		return "nisha";
	}

}
