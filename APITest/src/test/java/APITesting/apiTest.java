package APITesting;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import org.junit.*;
import org.junit.runner.OrderWith;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class apiTest {
	
	@Test
	public void test_Get() {
		

		
		Map<String, String> requestbody1 = new LinkedHashMap();
		requestbody1.put("job", "leader");
		requestbody1.put("name", "morpheus");
		

		JsonPath response = given()
							.baseUri("https://reqres.in/")
							.when()
							.get("/api/users?page=2")
							.then()
							.statusCode(200)
							.extract().jsonPath();
							
		
		List<String> data = response.getList("data.id");
		
		int total = response.getInt("total");
				
		System.out.println(data);
		System.out.println(total);
		
		assertFalse(data.isEmpty());
		
		assertEquals(total, 12);
		assertEquals(data.size(), 6);
		
		//System.out.println(requestbody);
		System.out.println(requestbody1);
		
		

	}
	
	
	@Test
	public void test_Post() {
		
		String requestbody = "{\n"+
			    " \"job\": \"leader\",\n"+  
			    " \"name\": \"morpheus\"\n"+
			"}";
		
		JsonPath response2 = given()
				.baseUri("https://reqres.in/")
				.contentType(ContentType.JSON)
				.header("x-api-key", "reqres-free-v1")
				.body(requestbody)
				.when()
				.post("/api/users")
				.then()
				.statusCode(201)
				.extract().jsonPath();
				
		
		String name = response2.getString("name");
		//int code = response2.
		
		System.out.println(name);
		
		assertEquals(name, "morpheus");
		
	}
}
