package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterPage;
import data.LoadPropertise;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserRegisterationTestCaseaAndPropiertiesFile extends TestBase {

    HomePage home ;
    UserRegisterPage RegisterPage ;

    String FN = LoadPropertise.user.getProperty("firstName");
    String Ln = LoadPropertise.user.getProperty("lastName");
    int Day = Integer.parseInt(LoadPropertise.user.getProperty("Day"));
    int month = Integer.parseInt(LoadPropertise.user.getProperty("month"));
    int year = Integer.parseInt(LoadPropertise.user.getProperty("year"));
    String email = LoadPropertise.user.getProperty("email");
    String password = LoadPropertise.user.getProperty("password");
    @Test
    public void UserCanRegisterSuccessfully()
    {

        home  = new HomePage(driver);
        home.OpenRegisterPage();
        RegisterPage = new UserRegisterPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // RegisterPage.UserRegister ( FN ,  Ln ,  Day ,  month , year ,  email ,  password );
        Assert.assertEquals("Your registration completed" , RegisterPage.Result.getText());

        home.UserLogOut();

    }


}
