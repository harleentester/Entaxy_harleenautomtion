package entaxy.website.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;

    //@FindBy(xpath="//*[contains(text(),'Add an account')]']")
    @FindBy(xpath="//a[contains(@href,'/accounts/new')]")
    private WebElement addAnAccount;

    public DashboardPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public DashboardPage clickOnaddAnAccount(){
        Actions action=new Actions(driver);
        action.moveToElement(addAnAccount).click().build().perform();
        return new DashboardPage(driver) ;

       // this.addAnAccount.click();
        // return new DashboardPage(driver) ;
    }
}
