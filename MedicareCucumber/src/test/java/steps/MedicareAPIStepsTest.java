package steps;

import java.util.HashMap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class MedicareAPIStepsTest {
	
	@Given("User Enters Medicare base URL and Authorization")
	public void user_enters_medicare_base_url_and_authorization() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then().statusCode(200)
		.log().all();
	 
	}

	@When("User executes HTTP get method")
	public void user_executes_http_get_method() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then().statusCode(200)
		.log().all();
	    
	}

	@Then("Validate the response status code")
	public void validate_the_response_status_code() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then().statusCode(200)
		.log().all();
	  
	}

	@When("User executes HTTP post method")
	public void user_executes_http_post_method() {
HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("id", "999");
		map.put("image", ".png");
		map.put("name", "Disprin");
		map.put("category", "medicine");
		map.put("brand", "BZ Medico");
		map.put("status", "1");
		map.put("price", "100");
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-product")
		.contentType("application/json")
		.body(map)
		.when().post()
		.then().statusCode(200).log().all();
	  
	}

	@When("User executes HTTP put method")
	public void user_executes_http_put_method() {
		
HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("id", "999");
		map.put("image", "2.png");
		map.put("name", "Disprin+");
		map.put("category", "medicine");
		map.put("brand", "BZ Medico");
		map.put("status", "1");
		map.put("price", "120");
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product")
		.contentType("application/json")
		.body(map)
		.when().put()
		.then().statusCode(200).log().all();
	
	
	}

	@When("User executes HTTP Delete method")
	public void user_executes_http_delete_method() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-product")
		.queryParam("id", "101")
		.when().delete()
		.then().statusCode(200)
		.log().all();
	
	}

}
