package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRegisterationTestCaseAndDataProvider extends TestBase {

    HomePage home ;
    UserRegisterPage RegisterPage ;
    LoginPage loginpage;

    // here we create method array obkect and give it name
    @DataProvider(name = "registerdata")
    public static Object[][] userdata ()
    {

        return new Object[][]
                { {"sameh","khalil",6,7,20,"xxx2@yahoo.com","12345678"}
                        ,
                        {"meena","kamal",6,2,20,"xxx4@yahoo.com","12345678"}
                        ,
                        {"ramy","gamel",5,7,20,"xxx5@yahoo.com","12345678"}
                };
    }

    @Test(alwaysRun = true , priority = 1 , dataProvider = "registerdata")
    public void UserCanRegisterSuccessfully(String fname , String Lname , int day , int month , int year , String email , String pass ) throws InterruptedException {
        home  = new HomePage(driver);
        home.OpenRegisterPage();
        RegisterPage = new UserRegisterPage(driver);
        RegisterPage.UserRegister
                (fname , Lname , day , month , year , email , pass);
        Assert.assertEquals("Your registration completed" , RegisterPage.Result.getText());
        Thread.sleep(2000);
        home.UserLogOut();
    }


}
