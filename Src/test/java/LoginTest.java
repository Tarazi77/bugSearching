import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public  class LoginTest{
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    @Test
    public void loginTest(){
        driver.get("https://demo.guru99.com/v4");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillUserID("mngr48wer");
        loginPage.fillPassword("etYbadeer");
        loginPage.clickLoginBtn();
    }

    

    @Test
    public void createNewAccount(){

    }

    @Test
    public void deposit(){

    }

    @AfterSuite()
    public void close(){

    }
}
