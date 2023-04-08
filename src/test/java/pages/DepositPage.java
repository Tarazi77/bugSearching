package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepositPage {
    WebDriver driver;

    @FindBy(name = "accountno")
    WebElement accountFld;

    @FindBy(name = "ammount")
    WebElement amountFld;

    @FindBy(name = "desc")
    WebElement descFld;

    @FindBy(name = "AccSubmit")
    WebElement submit;

    public DepositPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAccoutNo(String account){
        accountFld.sendKeys(account);
    }

    public void setamount(String amount){
        amountFld.sendKeys(amount);
    }

    public void setDeskFld(String desk){
        descFld.sendKeys(desk);
    }

    public void submitbtn() {
           submit.click();
    }
}

