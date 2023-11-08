package restassureScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001SetupCheck {
	
	@Test
	public void setupCheck()
	{
		// this is httpd get method
		
	Response res =	RestAssured.get("https://reqres.in/api/users/2"); // you will send a request
		
	System.out.println(res.asString()); // convert the response into the string
	
	System.out.println(res.getStatusCode());
	
	
		
		
		
	}
	

}
