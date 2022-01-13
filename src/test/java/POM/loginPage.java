package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public WebDriver driver;
    @FindBy(id="txtUsername")
    WebElement username;

    @FindBy(id="txtPassword")
    WebElement password;

    @FindBy(id="btnLogin")
    WebElement loginButton;


    public loginPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void enterUsername(String uname)
    {
        username.sendKeys(uname);

    }
        public void enterPassword(String pass)
        {
            password.sendKeys(pass);
        }

        public void clickOnButton()
        {
            loginButton.click();
        }



}
