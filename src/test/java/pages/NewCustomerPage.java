package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
    WebDriver driver;

    @FindBy(xpath = "//p[class='heading3']")
    WebElement registredElement;

    @FindBy(name = "name")
    WebElement userNameFld;

    @FindBy(xpath = "//input[value='m']")
    WebElement malebtn;

    @FindBy(xpath = "//input[value='f']")
    WebElement femalebtn;

    @FindBy(name = "dob")
    WebElement inputDate;

    @FindBy(name = "addr")
    WebElement addressInput;

    @FindBy(name = "city")
    WebElement cityInput;

    @FindBy(name = "state")
    WebElement stateInput;

    @FindBy(name = "pinno")
    WebElement pinnoInput;

    @FindBy(name = "telephoneno")
    WebElement mobileTelephoneInput;

    @FindBy(name = "emailid")
    WebElement emailInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(name = "sub")
    WebElement submitbtn;

    @FindBy(name = "res")
    WebElement  resetbtn;

    @FindBy(xpath = "//a[text()='Home']")
    WebElement homebtn;



    public NewCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillName(String name){
        userNameFld.sendKeys(name);
    }

    public void setMalebtn(){
        malebtn.click();
    }

    public void setFemalebtn(){
        femalebtn.click();
    }

    public void setDateOfBirth(String dateOfBirth){
        inputDate.sendKeys(dateOfBirth);
    }

    public void fillAddress(String address){
        addressInput.sendKeys(address);
    }

    public void fillCity(String city){
        cityInput.sendKeys(city);
    }

    public void fillState(String state){
        stateInput.sendKeys(state);
    }

    public void fillPin(String pin){
        pinnoInput.sendKeys(pin);
    }

    public void fillMobileTelephone(String mobileTelephone){
        mobileTelephoneInput.sendKeys(mobileTelephone);
    }

    public void fillEmail(String email){
        emailInput.sendKeys(email);
    }

    public void fillPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void submitbtn(){
        submitbtn.click();
    }

    public void resetbtn(){
        resetbtn.click();
    }

    public void homebtn(){
        homebtn.click();
    }
}
