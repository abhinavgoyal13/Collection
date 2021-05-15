package cucumberRestAssuredFramework.stepDefinitions;

import cucumberRestAssuredFramework.resources.TestDataBuild;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import pojo.AddPlace;
import pojo.Location;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class AddPlaceStepDefinitions {

    RequestSpecification reqNew;
    ResponseSpecification respSpec;
    Response resp;
    public AddPlace ap;

    @Given("add Place payload")
    public void add_place_payload() {
        TestDataBuild tp = new TestDataBuild();
        ap=tp.AddPlacePayLoad();

       RequestSpecification reqSpec= new RequestSpecBuilder()
               .setBaseUri("https://rahulshettyacademy.com")
               .addQueryParam("key","qaclick123")
               .setContentType(ContentType.JSON).build();
        //variable decalred at global level
         respSpec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
//varoable declared at global level
         reqNew= given().spec(reqSpec).body(ap);


    }
    @When("user calls {string} with post http request")
    public void user_calls_with_post_http_request(String string) {
       resp=reqNew.when().post("/maps/api/place/add/json").then().spec(respSpec).extract().response();
    }
    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code(int int1) {
        assertEquals(resp.getStatusCode(),int1);

    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String value) {
        //resp.asString();
       String respStr= resp.asString();
        System.out.println(respStr);
       // JsonPath js= new JsonPath(respStr);
        //assertEquals(js.get(key).toString(),value);
    }


}
