package steps;

import Pages.HomePage;
import Pages.UserRegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class UserRegisterion extends TestBase {

    HomePage home  = new HomePage(driver);
    UserRegisterPage registerobject =new UserRegisterPage(driver);

    @Given("the user in home page")
    public void the_user_in_home_page() {
        System.out.println(driver.getTitle());
    }

    @When("the user click on register link")
    public void the_user_click_on_register_link() {
        home.OpenRegisterPage();
    }
/*
    @When("the user fill the form by correct data")
    public void the_user_fill_the_form_by_correct_data() {
        registerobject.UserRegister
                ("sameh","khalil" , 5 , 6 , 20 ,
                        "sa54m1011545@yahoo.com" , "123456");
    }
*/

    @When("the user fill the {string} , {string} , {string} ,{string} ,{string} , {string} , {string}")
    public void the_user_fill_the(String Fname, String Lname, String day, String month, String year
            , String mail, String password) throws InterruptedException {
        registerobject.UserRegister
                (Fname , Lname , Integer.parseInt(day) , Integer.parseInt(month) , Integer.parseInt(year) , mail , password);

    }

    @Then("the register success message displayed successfully")
    public void the_register_success_message_displayed_successfully() throws InterruptedException {
        Assert.assertEquals("Your registration completed" , registerobject.Result.getText());
        Thread.sleep(2000);
        home.UserLogOut();
    }

}
