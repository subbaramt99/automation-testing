package Test_with_Junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.Result;

import MyApplication.MyApp;

public class Test_MyApp {
	
	MyApp myapp;

	
	@Before
	public void setupAll() {
		System.out.println("Global setups");
		myapp = new MyApp();
	}
	
	@Test
	public void test() {
		System.out.println("My app test is running addittion");
		System.out.println(myapp.add(5, 10));
		
		Assert.assertEquals(myapp.add(5, 10), 15);
	}
	
	@Test
	public void test1() {
		System.out.println("My app test is running subraction");
		System.out.println(myapp.sub(5, 10));
		
		Assert.assertEquals(myapp.sub(5, 10), -5);
	}
	
	@Test
	public void test2() {
		System.out.println("My app test is running String check");
		System.out.println(myapp.Greet("Anandh"));
		
		Assert.assertTrue(myapp.Greet("Anandh").contains("Good Morning"));
		Assert.assertFalse(myapp.Greet("Anandh").contains("Bad Morning"));
		
	
	}
	
	@After
	public void tearDown() {
		System.out.println("Global teardown");
	}

}
