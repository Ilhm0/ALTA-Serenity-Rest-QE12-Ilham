package starter.GetSingleUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;


public class GetSingleUserAPI {
    public static String GET_SINGLE_USER = Constants.BASE_URL + "/api/users/{page}";

    @Step("Get single user")
    public void getSingleUser(int page){
        SerenityRest.given()
                .pathParam("page",page);
    }

    @Step("Get single user")
    public void getSingleUser(String page){
        SerenityRest.given()
                .pathParam("page",page);
    }



}
