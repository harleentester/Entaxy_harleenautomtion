package entaxy.website.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountpage {

    WebDriver driver;

    @FindBy(xpath = "//input[@name='accountType']")
   private WebElement Accounttype;

    @FindBy(xpath="//input[@name='institution']")
    private WebElement Institution;

    public NewAccountpage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        public NewAccountpage clickonAccounttype()
        {
            this.Accounttype.click();
            return new NewAccountpage(driver);
        }
        public NewAccountpage clickonInstitution()
        {
            this.Institution.click();
            return new NewAccountpage(driver);
        }
    }

