package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FlightSearchPage;
import pages.FlightResultsPage;

public class FlightSearchtest extends BaseClass {

    @Test
    public void verifyFlightSearch() {

        FlightSearchPage searchPage = new FlightSearchPage(driver);

        searchPage.closeLoginPopup();

        
     

      searchPage.enterFromCity("BHO - Bhopal, IN");
    searchPage.enterTOCity("Pune");
       
      
        
    
        searchPage.selectDepartureDateAndSearch();
        
        
        FlightResultsPage resultsPage = new FlightResultsPage(driver);

        boolean result = resultsPage.verifyFlightResults();

        Assert.assertTrue(result, "Flight results are not displayed");
    

    }

}