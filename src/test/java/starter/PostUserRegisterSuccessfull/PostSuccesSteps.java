package starter.PostUserRegisterSuccessfull;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import starter.Utils.Constants;

import java.io.File;

public class PostSuccesSteps {

    PostSuccessAPI postSuccessAPI;

    @Given("Register new account with invalid json {string}")
    public void createUserAccountWithInvalidJson(String jsonFile){
        File json = new File(Constants.REQ_BODY + jsonFile);
        postSuccessAPI.postSuccessAPI(json);
    }

    @When("Send request post register account user")
    public void sendRequestPostRegisterAccountUser() {
        SerenityRest.when().post(PostSuccessAPI.POST_REGISTER);
    }

    @Then("Status code should be shown {int}")
    public void statusCodeShouldBeShown(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }
}
