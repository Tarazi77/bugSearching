package tests;

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

public class LoginTest {
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    @Test
    public void loginTest(){
        driver.get("https://demo.guru99.com/v4");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillUserID("mngr486048");
        loginPage.fillPassword("etYbade");
        loginPage.clickLoginBtn();
    }

    @Test
    public void newCustomerPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        HomePage homePage = new HomePage(driver);
        homePage.clickNewCustomerbtn();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        NewCustomerPage newCusomer = new NewCustomerPage(driver);
        newCusomer.fillName("Tarazi");


        newCusomer.setDateOfBirth("21.09.2002");
        newCusomer.fillAddress("Asyl Arman 2dom  19kv");
        newCusomer.fillCity("Almaty");
        newCusomer.fillState("Kazakhstan");
        newCusomer.fillPin("200103456");
        newCusomer.fillMobileTelephone("87477094196");
        newCusomer.fillEmail("200g123te@stu.sdu.edu.kz");
        newCusomer.fillPassword("tarazi77");
        newCusomer.submitbtn();
        WebElement clickMe = driver.findElement(By.xpath("//p[@class='heading3']"));
        Assert.assertEquals(clickMe.getText(), "Customer Registered Successfully!!!");
        HomePage newAccount = new HomePage(driver);
        newAccount.clickNewAccountbtn();
        WebElement id = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]"));



        NewAccountPage newaccount = new NewAccountPage(driver);
        newaccount.fillCustomerId(id.getText());

        newaccount.initDeposit("5000000");
        newaccount.submitbtn();

        WebElement clickMe2 = driver.findElement(By.xpath("//p[@class='heading3']"));
        Assert.assertEquals(clickMe2.getText(), "Account Generated Successfully!!!");


        HomePage deposit = new HomePage(driver);
        deposit.clickDepositPage();

        WebElement id2 = driver.findElement(By.xpath("//*[@id=\"account\"]/tbody/tr[4]/td[2]"));
        DepositPage newDeposit = new DepositPage(driver);
        newDeposit.setAccoutNo(id2.getText());
        newDeposit.setamount("200000");
        newDeposit.setDeskFld("its all my mony");
        newDeposit.submitbtn();

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
