package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterPage extends Pagebase {

    public UserRegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "gender-male")
    private WebElement MaLeGender ;

    @FindBy(id = "FirstName")
    private WebElement FirstName;

    @FindBy(id = "LastName")
    private WebElement LastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    private WebElement DayofBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    private WebElement MonthofBirth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    private WebElement YearOfBirth;

    @FindBy(id = "Email")
    private WebElement Email;

    @FindBy(id = "Password")
    private WebElement Password;

    @FindBy(id = "ConfirmPassword")
    private WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    private WebElement RegisterButton;

    @FindBy(className="result")
    public WebElement Result;


    public void UserRegister2(String fname , String Lname , String day , String month , String year , String email , String pass ) {
        ClickButtons(MaLeGender);
        SendValue(FirstName , fname);
        SendValue(LastName , Lname);
        select(DayofBirth, ((int) Double.parseDouble(day)));
        select(MonthofBirth, ((int) Double.parseDouble(month)));
        select(YearOfBirth, ((int) Double.parseDouble(year)));
        SendValue(Email , email);
        SendValue(Password , pass);
        SendValue(ConfirmPassword , pass);
        ClickButtons(RegisterButton);

    }

    public void UserRegister(String fname , String Lname , int day , int month , int year , String email , String pass ) {
        ClickButtons(MaLeGender);
        SendValue(FirstName , fname);
        SendValue(LastName , Lname);
        select(DayofBirth,  day);
        select(MonthofBirth,  month);
        select(YearOfBirth,  year);
        SendValue(Email , email);
        SendValue(Password , pass);
        SendValue(ConfirmPassword , pass);
        ClickButtons(RegisterButton);

    }
}

