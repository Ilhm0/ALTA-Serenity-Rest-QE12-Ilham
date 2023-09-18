package starter.PostCreate;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.APIResponses;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.core.IsEqual.equalTo;

public class PostCreateSteps {
    @Steps
    PostCreateAPI postCreateAPI;

    @Given("Create user with invald json {string}")
    public void creatUserWithInvaldJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY + jsonFile);
        postCreateAPI.postCreateUser(json);

    }

    @When("Send request post create user")
    public void sendRequestPostCreateUser() {
        SerenityRest.when().post(PostCreateAPI.POST_CREATE);
    }

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }

    @And("Response body name should be null")
    public void responsePageBodyShouldBeNull() {
        SerenityRest.and().body(APIResponses.NAME, equalTo(null));
    }
}

