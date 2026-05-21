package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By accountsOverview = By.linkText("Accounts Overview");
    By logoutLink = By.linkText("Log Out");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public boolean verifyHomePage() {

        return driver.findElement(accountsOverview).isDisplayed();
    }

    public void clickLogout() {

        driver.findElement(logoutLink).click();
    }
}