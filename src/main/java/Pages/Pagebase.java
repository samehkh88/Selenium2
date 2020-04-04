package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagebase {

    protected WebDriver driver ;
    protected JavascriptExecutor js ;

    public Pagebase(WebDriver driver)
    {
        PageFactory.initElements(driver ,this);
    }

    protected void SendValue(WebElement field , String Value)
    {
        field.sendKeys(Value);
    }

    protected void ClickButtons(WebElement button)
    {
        button.click();
    }

    protected void select( WebElement field, int selValue)
    {
        Select sel = new Select(field);
        sel.selectByIndex(selValue);
    }

    protected void Clear(WebElement field)
    {
        field.clear();
    }

    protected void Scroll() {
        js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1500)");
    }

}
