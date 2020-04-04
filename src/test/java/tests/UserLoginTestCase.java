package tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class UserLoginTestCase extends TestBase{

    HomePage Home;
    LoginPage loginpage;

    @Test
    public void UserCanloginSuccessfully()
    {

        Home = new HomePage(driver);
        Home.OpenLoginPage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginpage = new LoginPage(driver);
        loginpage.UserCanLogin("sam7@yahoo.com" , "123456");

        assertEquals("Log out", Home.LogOutlink.getText());

        Home.UserLogOut();
    }
}


