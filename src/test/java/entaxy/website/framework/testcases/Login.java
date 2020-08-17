package entaxy.website.framework.testcases;

import entaxy.website.framework.config.Config;
import entaxy.website.framework.drivermanger.DriverManager;
import entaxy.website.framework.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

    @BeforeSuite(enabled =true)
    public void setUp(){
        driver = DriverManager.getDriver();
        driver.get(Config.getProperty("url"));
    }

    @Test(enabled = true)

public void GuestUser() throws InterruptedException {
            LoginPage page = new LoginPage(driver);
            Thread.sleep(8000);
            page.clickonGuestUser();
        }



    @AfterSuite(enabled = true)
    public void tearDown() throws InterruptedException {
        //Thread.sleep(8000);
       WebDriverWait driverWait = new WebDriverWait(driver, 2000);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.quit();
    }
}
