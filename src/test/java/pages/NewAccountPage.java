package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    WebDriver driver;

    @FindBy(name = "cusid")
    WebElement cusIdFld;

    @FindBy(xpath = "//select[value = 'Savings']")
    WebElement savingsbtn;

    @FindBy(name = "inideposit")
    WebElement iniDeposit;

    @FindBy(name = "button2")
    WebElement submitbtn;

    public void believAdds() {
        try {
            driver.findElement(By.id("dismiss-button")).click();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public NewAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillCustomerId(String cusid){
        cusIdFld.sendKeys(cusid);
    }

    public void savingsbtn(){
        savingsbtn.click();
    }

    public void initDeposit(String initDeposit){
        iniDeposit.sendKeys(initDeposit);
    }

    public void submitbtn(){
        submitbtn.click();
    }
}
