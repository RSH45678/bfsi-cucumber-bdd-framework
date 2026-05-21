package StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.AddBeneficiaryPage;
import pages.LoginPage;
import utils.DriverFactory;

public class BeneficiarySteps {

    LoginPage loginPage = new LoginPage(DriverFactory.driver);

    AddBeneficiaryPage addPage =
            new AddBeneficiaryPage(DriverFactory.driver);

    @Given("user logged into banking app")
    public void user_logged_into_banking_app() {

        loginPage.login("john", "demo");
    }

    @When("user clicks transfer funds")
    public void user_clicks_transfer_funds() {

        addPage.clickTransferFunds();
    }

    @Then("transfer page should open")
    public void transfer_page_should_open() {

        Assert.assertTrue(
                DriverFactory.driver.getTitle().contains("ParaBank"));
    }
}