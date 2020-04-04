package tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserRegisterationTestCase extends TestBase {

    HomePage home ;
    UserRegisterPage RegisterPage ;
    LoginPage loginpage;

    @Test
    public void UserCanRegisterSuccessfully() throws InterruptedException {
        home  = new HomePage(driver);
        home.OpenRegisterPage();
        RegisterPage = new UserRegisterPage(driver);
       RegisterPage.UserRegister
                ("sameh","khalil" , 5 , 6 , 20 ,
                        "sam1011545@yahoo.com" , "123456");
        Assert.assertEquals("Your registration completed" , RegisterPage.Result.getText());
        Thread.sleep(2000);
        home.UserLogOut();

    }


}
