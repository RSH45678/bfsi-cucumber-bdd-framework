package StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    LoginPage loginPage = new LoginPage(DriverFactory.driver);
    HomePage homePage = new HomePage(DriverFactory.driver);

    @Given("user is on login page")
    public void user_is_on_login_page() {

        System.out.println("User on login page");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

        loginPage.login("john", "demo");
    }

    @Then("user should navigate to home page")
    public void user_should_navigate_to_home_page() {

        Assert.assertTrue(homePage.verifyHomePage());
    }
}