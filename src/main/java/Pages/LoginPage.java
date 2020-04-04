package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Pagebase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id ="Password")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement LoginButton;

    public void UserCanLogin(String mail , String Password)
    {
        SendValue(email, mail);
        SendValue(password, Password);
        ClickButtons(LoginButton);
    }
}
