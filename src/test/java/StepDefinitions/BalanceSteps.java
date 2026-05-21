package StepDefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.DriverFactory;

public class BalanceSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.driver);

    @Given("user logged into application")
    public void user_logged_into_application() {

        loginPage.login("john", "demo");
    }

    @When("user clicks on Accounts Overview")
    public void user_clicks_on_accounts_overview() {

        DriverFactory.driver.findElement(By.linkText("Accounts Overview")).click();
    }

    @Then("account balance should be displayed")
    public void account_balance_should_be_displayed() {

        Assert.assertTrue(
                DriverFactory.driver.getPageSource().contains("Balance"));
    }
}