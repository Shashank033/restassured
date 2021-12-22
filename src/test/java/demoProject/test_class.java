package demoProject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test_class {

	@Test
     void test_01()
{ 
Response response = RestAssured.get("https://reqres.in/api/users?page=2");
System.out.println(response.getBody());
System.out.println(response.asString());

System.out.println(response.getStatusCode());
System.out.println(response.getHeader("content-type"));
System.out.println(response.getTime());

} 
 

}
