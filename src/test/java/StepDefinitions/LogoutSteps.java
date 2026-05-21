package StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LogoutSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.driver);

    HomePage homePage = new HomePage(DriverFactory.driver);

    @Given("user already logged in")
    public void user_already_logged_in() {

        loginPage.login("john", "demo");
    }

    @When("user clicks logout")
    public void user_clicks_logout() {

        homePage.clickLogout();
    }

    @Then("user should logout successfully")
    public void user_should_logout_successfully() {

        Assert.assertTrue(
                DriverFactory.driver.getCurrentUrl().contains("index"));
    }
}