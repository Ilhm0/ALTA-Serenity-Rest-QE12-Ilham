package starter.GetSingleUser;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.APIResponses;


import static org.hamcrest.Matchers.equalTo;

public class GetSingleUserSteps {

    @Steps
    GetSingleUserAPI getSingleUserAPI;

    @Given("Get single user with exceed parameter {int}")
    public void getSingleUserWithExceedParameter(int page) {

        getSingleUserAPI.getSingleUser(page);
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when().get(GetSingleUserAPI.GET_SINGLE_USER);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int none) {
        SerenityRest.then().statusCode(none);
    }

    @And("Response body should be null")
    public void responseBodyShouldBe() {
        SerenityRest.then().body(APIResponses.PAGE, equalTo(null));
    }

    @Given("Get single user with special character parameter page {string}")
    public void getSingleUserWithSpecialCharacterParameterPage(String page) {
        getSingleUserAPI.getSingleUser(page);
    }

    @Given("Get single user with empty parameter page {string}")
    public void getSingleUserWithEmptyParameterPage(String empty) {
        getSingleUserAPI.getSingleUser(empty);
    }
}



