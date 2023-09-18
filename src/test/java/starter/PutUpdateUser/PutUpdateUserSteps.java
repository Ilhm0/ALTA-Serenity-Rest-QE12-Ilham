package starter.PutUpdateUser;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;

import java.io.File;

public class PutUpdateUserSteps {

    @Steps
    PutUpdateUserAPI putUpdateUserAPI;
    @Given("Update user with invalid json {string} and id {int}")
    public void updateUserWihInvalidJsonAndId(String jsonFile, int id){
        File json = new File(Constants.REQ_BODY + jsonFile);
        putUpdateUserAPI.putUpdateUser(json, id);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(PutUpdateUserAPI.PUT_UPDATE_USER);
    }

    @Then("Status code should be {int}")
    public void statusCodeShouldBeIntNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

}
