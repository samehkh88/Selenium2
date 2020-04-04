package tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTestCase extends TestBase {

    HomePage home ;
    ContactUsPage contactPage ;
    Faker fakerdata = new Faker();
    String Fname = fakerdata.name().fullName();
    String email = fakerdata.internet().emailAddress();
    String message = fakerdata.lorem().characters();


    @Test
    public void UserCanContactUs()
    {
        home = new HomePage(driver);
        contactPage = new ContactUsPage(driver);
        home.OpenContactpage();
        contactPage.SubmitContact(Fname , email , message);
        Assert.assertTrue(contactPage.SuccesMessage.getText().equalsIgnoreCase("Your enquiry has been successfully sent to the store owner."));

    }
}
