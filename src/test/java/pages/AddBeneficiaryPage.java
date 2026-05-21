package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddBeneficiaryPage {

    WebDriver driver;

    By transferFunds = By.linkText("Transfer Funds");

    public AddBeneficiaryPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickTransferFunds() {

        driver.findElement(transferFunds).click();
    }
}