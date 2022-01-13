package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableStepDef {
WebDriver driver;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("user enter credentials")
    public void user_enter_credentials(DataTable dataTable) {
        List<List<String>> data=dataTable.cells();
        driver.findElement(By.id("txtUsername")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("txtPassword")).sendKeys(data.get(0).get(1));
        driver.findElement(By.name("Submit")).click();


            // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("user is on home page");
    }

}
