package tests;

import Pages.HomePage;
import Pages.UserRegisterPage;
import data.Exlreader;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserRegisterationTestCaseAndXLXXReader extends TestBase {

    HomePage home ;
    UserRegisterPage RegisterPage ;

    @DataProvider(name="registerdata")
    public static Object[][] UserData() throws IOException
    {
        //read data from exl
        Exlreader reader = new Exlreader();
        return reader.GetExlData(0 , 7);

    }

    @Test(dataProvider = "registerdata")
    public void UserCanRegisterSuccessfully(String Fname , String Lname , String day , String month , String year , String Mail , String pass )
    {
        home  = new HomePage(driver);
        home.OpenRegisterPage();
        RegisterPage = new UserRegisterPage(driver);
        RegisterPage.UserRegister2(Fname ,Lname , day, month ,year ,Mail , pass);
        Assert.assertEquals("Your registration completed" , RegisterPage.Result.getText());

        home.UserLogOut();

    }
/*
    @Test(dataProvider = "registerdata")
    public void UserCanRegisterSuccessfully(String Fname , String Lname , double day , double month , double year , String Mail , String pass )
    {
        home  = new HomePage(driver);
        home.OpenRegisterPage();
        RegisterPage = new UserRegisterPage(driver);
        RegisterPage.UserRegister(Fname ,Lname , day , month ,year ,Mail , pass);
        Assert.assertEquals("Your registration completed" , RegisterPage.Result.getText());

        home.UserLogOut();

    }
*/

}
