package pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightResultsPage {

    WebDriver driver;
    WebDriverWait wait;

    public FlightResultsPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators

    @FindBy(xpath = "//p[contains(@class,'airlineName')]")
    List<WebElement> airlineNames;

    @FindBy(xpath = "//p[contains(@class,'price')]")
    List<WebElement> flightPrices;

    // Validation Method

    public boolean verifyFlightResults() {

        wait.until(ExpectedConditions.visibilityOfAllElements(airlineNames));

        return airlineNames.size() > 0 && flightPrices.size() > 0;
    }

}