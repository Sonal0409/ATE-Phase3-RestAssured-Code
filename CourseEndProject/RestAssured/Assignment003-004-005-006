package courseEndProject;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Assignment003Demo {
	
	@Test(priority='1')
	public void assignment003User()
	{
		RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/user/Uname001")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all()
		.body("username", Matchers.equalTo("Uname001"))
		.body("email", Matchers.equalTo("Positive@Attitude.com"))
		.body("userStatus", Matchers.equalTo(1))
		;
	
		
		
	}
	
	
	@Test(priority='2')
	public void assignment004login()
	{
		RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/user/login")
		.auth().preemptive().basic("Uname001", "@tt!tude")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all()
		.body("message", Matchers.anything());
	
		
		
	}

}








package courseEndProject;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Assignment005Demo {
	

	@Test(priority='1')
	public void assignment005FindByStatus()
	{
		RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/pet/findByStatus")
		//.queryParam("status", "available")
		//.queryParam("status", "pending")
		.queryParam("status", "sold")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all()
	
		;
	
		
		
	}
	
	

	@Test(priority='2')
	public void assignment006Logout()
	{
		RestAssured.given()
		.baseUri("https://petstore.swagger.io/v2/user/logout")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all()
		.body("code", Matchers.equalTo(200))
		.body("type", Matchers.equalTo("unknown"))
		.body("message", Matchers.equalTo("ok"))
		;
	
		
		
	}
	

}
