package entaxy.website.framework.testcases;

import entaxy.website.framework.drivermanger.DriverManager;
import entaxy.website.framework.pages.DashboardPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dashboard {

    WebDriver driver = DriverManager.getDriver();
    @Test(enabled = true)

    public void addAnAccount() throws InterruptedException {
        DashboardPage page = new DashboardPage(driver);
        Thread.sleep(10000);
        page.clickOnaddAnAccount();
    }


}
