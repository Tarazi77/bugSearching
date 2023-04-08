package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(xpath = "//a[text()='New Customer']")
    WebElement newCustomerbtn;

    @FindBy(xpath = "//a[text()='New Account']")
    WebElement newAccountbtn;

    @FindBy(xpath = "//a[text()='Deposit']")
    WebElement depositbtn;

    public void believAdds() {
        try {
            driver.findElement(By.id("dismiss-button")).click();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickNewCustomerbtn(){
        newCustomerbtn.click();
    }

    public void clickNewAccountbtn(){
        newAccountbtn.click();
    }

    public void clickDepositPage(){
        depositbtn.click();
    }

}
