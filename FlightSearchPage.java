package pages;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightSearchPage {

    WebDriver driver;
    WebDriverWait wait;

    public FlightSearchPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators

    @FindBy(xpath = "//div[@class='pb-1 px-1 flex flex-middle nmx-1']//*[name()='svg']")
    WebElement closePopup;

   

    @FindBy(xpath = "//input[@placeholder='Where from?']")
    WebElement fromCity;

    @FindBy(xpath = "//input[@placeholder='Where to?']")
    WebElement toCity;

//    @FindBy(xpath = "//p[contains(text(),'Delhi')]")
//    WebElement fromSuggestion;
//
//    @FindBy(xpath = "//p[contains(text(),'Mumbai')]")
//    WebElement toSuggestion;

    @FindBy(xpath = "//div[contains(@class,'DayPicker-Day') and not(contains(@class,'disabled'))]")
    WebElement departureDate;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement searchButton;

    

 

    
    
//
//    @FindBy(xpath ="//p[contains(text(),'Bhopal, IN - Raja Bhoj (BHO)')]")
//    WebElement Button;
//    
//    
//    @FindBy(xpath = "//div[contains(text(),'Mon, Mar')]")
//    WebElement departureField;
    
    // Methods

    public void closeLoginPopup() {

        try {
            wait.until(ExpectedConditions.elementToBeClickable(closePopup)).click();
        } catch (Exception e) {
            System.out.println("Popup not displayed");
        }

    }


//


   
    public void enterFromCity(String city) {

        wait.until(ExpectedConditions.visibilityOf(fromCity)).click();
        fromCity.clear();

        // type city
        fromCity.sendKeys(city);


        
        List<WebElement> cities = driver.findElements(By.xpath("//ul/li"));

        cities.get(1).click();
        
        
     

    
    
    
    
    }
    
//    
    public void enterTOCity(String cityn) {

        wait.until(ExpectedConditions.visibilityOf(toCity)).click();
        toCity.clear();

        // type city
        toCity.sendKeys(cityn);


        
        List<WebElement> cities1 = driver.findElements(By.xpath("//ul/li"));

        cities1.get(0).click();
//        
   
    }
    
    
    
    public void selectDepartureDateAndSearch() {

        // Open calendar
        driver.findElement(By.cssSelector(
            "div[class='focus:bc-secondary-500 t-all c-pointer flex flex-middle flex-between bg-neutral-100 c-neutral-900 p-4 py-3 px-4 h-10 fs-16 ba-solid bc-default c-neutral-900 fromDiv false']"
        )).click();

        // Wait and select date
        WebElement date = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@aria-disabled='false']//div[text()='23']")
        ));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", date);

        // Click Search Flights
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//h4[normalize-space()='Search flights']")
        ));

        search.click();
    }
    
    
    
    
}