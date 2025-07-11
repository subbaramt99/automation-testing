package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
//		driver.findElement(By.linkText("Forgotten password?")).click();
		
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
//		driver.findElement(By.className("inputtext")).sendKeys("Mathan");
		
//		driver.findElement(By.cssSelector("#email")).sendKeys("Mathan");
		driver.findElement(By.cssSelector("input#email")).sendKeys("Kumar");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
