package StepDefinitions;

import POM.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginStepDef {

public WebDriver driver;
private loginPage loginpage;


    @When("user enter {string} and {string}")
    public void userEnterAnd(String arg0, String arg1) {
        loginpage=new loginPage(driver);
        loginpage.enterUsername(arg0);
        loginpage.enterPassword(arg1);
        loginpage.clickOnButton();
    }

    @Then("use is on homePage")
    public void useIsOnHomePage() {
        String expectedTitle="OrangeHRM";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}