import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;


public class firstTestCase {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //1
        driver.get("https://demoqa.com/alerts");

//        WebElement clickMe = driver.findElement(By.id("alertButton"));
//        clickMe.click();

//        WebElement clickMe2 = driver.findElement(By.id("confirmButton"));
//        clickMe2.click();
//        driver.switchTo().alert().accept();
//        clickMe2.click();
//        driver.switchTo().alert().dismiss();


    }
}



