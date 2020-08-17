package entaxy.website.framework.testcases;

import entaxy.website.framework.drivermanger.DriverManager;
import entaxy.website.framework.pages.DashboardPage;
import entaxy.website.framework.pages.NewAccountpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewAccount {

    WebDriver driver = DriverManager.getDriver();
    @Test(enabled = true)

    public void Accounttype() throws InterruptedException {
        NewAccountpage page = new NewAccountpage(driver);
        Thread.sleep(10000);
        page.clickonAccounttype();
    }


    public void Institutiontype() throws InterruptedException {
        NewAccountpage page = new NewAccountpage(driver);
        Thread.sleep(10000);
        page.clickonInstitution();
    }
}
