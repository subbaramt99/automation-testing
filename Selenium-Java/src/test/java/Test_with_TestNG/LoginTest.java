package Test_with_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@DataProvider (name="address")
	private Object[][] data(){
		return new Object[][] {{"chennai","1234"},{"vellore","3241"},{"thirunalvelli","578855"}};
	}
	
	@DataProvider (name="credentials")
	private Object[][] Test_data(){
		return new Object[][] {{"anadh","1234"},{"nisha","3241"},{"ram","578855"}};
	}

	@Test
	@Parameters({"url", "username", "password"})
	public void testValidLogin(String url, String username, String password) {
		
		LoginPage loginpage = new LoginPage(driver);
	
		loginpage.goToLoginPage(url);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickLogin();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		System.out.println(loginpage.geturl() + " you redirect to correct url");
		
		SoftAssert softassert = new SoftAssert();
		
		//Assert.assertEquals(loginpage.geturl(), "https://rahulshettyacademy.com/loginpagePracti/");
		
		softassert.assertEquals(loginpage.geturl(), "https://rahulshettyacademy.com/loginpagePracti/");
		
		System.out.println(loginpage.geturl() + " you redirect to correct url");
		
	}
	
	
	@Test(groups = {"Regression"})
	public void test() {
		System.out.println("Regression group is running");
		
	}
	
	@Test(dataProvider = "address", groups = {"Smoke"})
	public void test2(String city, String pincode) {
		
		System.out.println("Smoke group is running" + " " + city + " " + pincode);
		
	}
	
	@Test(dataProvider = "credentials", groups = {"Smoke", "Regression"})
	public void test3(String username, String password) {
		System.out.println("Regression or Smoke group is running" + " " + username + " " + password);
		
	}

}
