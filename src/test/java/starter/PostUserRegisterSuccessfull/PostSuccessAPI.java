package starter.PostUserRegisterSuccessfull;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class PostSuccessAPI {
    public static String POST_REGISTER = Constants.BASE_URL + "api/register";
    @Step("Post Success Register")
    public void postSuccessAPI(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
