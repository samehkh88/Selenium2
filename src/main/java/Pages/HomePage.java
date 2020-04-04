package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Pagebase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Register")
    WebElement Registerlink;

    @FindBy(linkText = "Log in")
    WebElement Loginlink;

    @FindBy(linkText = "Log out")
    public WebElement LogOutlink;

    @FindBy(linkText = "Contact us")
    public WebElement ContactUsPage ;

    public void OpenRegisterPage()
    {
        Registerlink.click();
    }
    public void OpenLoginPage()
    {
        Loginlink.click();
    }
    public void UserLogOut()
    {
        LogOutlink.click();
    }
    public void OpenContactpage()
    {
        Scroll();
        ClickButtons(ContactUsPage);
    }
}
