package entaxy.website.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(xpath="//div/button[@data-testid='signinAsGuestButton']")
private WebElement Guestuser;

    public LoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public LoginPage clickonGuestUser()
    {
        this.Guestuser.click();
        return new LoginPage(driver);
    }

}
