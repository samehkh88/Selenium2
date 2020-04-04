package steps;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.TestBase;

public class UserLogin extends TestBase {

    HomePage home  = new HomePage(driver);
    LoginPage LoginObject = new LoginPage(driver);

    @Given("the user in home page")
    public void the_user_in_home_page() {
        System.out.println(driver.getTitle());
    }

    @When("the user click on login link")
    public void the_user_click_on_login_link() {
        home.OpenLoginPage();
    }

    @When("the user enter {string} , {string}")
    public void the_user_enter(String Email, String Password) {
        LoginObject.UserCanLogin(Email,Password);
    }

    @Then("The User will be login and can now click logout")
    public void the_User_will_be_login_and_can_now_click_logout() throws InterruptedException {
        Thread.sleep(2000);
        home.UserLogOut();

    }
}
