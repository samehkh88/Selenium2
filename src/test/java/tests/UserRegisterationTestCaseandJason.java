package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterPage;
import data.JsonDataReader;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserRegisterationTestCaseandJason extends TestBase {

    HomePage home ;
    UserRegisterPage RegisterPage ;
    LoginPage loginpage;

    @Test
    public void UserCanRegisterSuccessfully() throws IOException, ParseException {
        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        home  = new HomePage(driver);
        home.OpenRegisterPage();
        RegisterPage = new UserRegisterPage(driver);
       RegisterPage.UserRegister2
               (jsonReader.firstname,jsonReader.lastname,jsonReader.day,jsonReader.day,jsonReader.day,jsonReader.email,jsonReader.password);
        Assert.assertEquals("Your registration completed" , RegisterPage.Result.getText());

        home.UserLogOut();

    }


}
