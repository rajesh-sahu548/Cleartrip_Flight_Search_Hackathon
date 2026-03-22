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

<<<<<<< HEAD
        searchPage.closeLoginPopup();

        
     

      searchPage.enterFromCity("BHO - Bhopal, IN");
      searchPage.enterTOCity("Pune");
       
      
        
    
        searchPage.selectDepartureDateAndSearch();
        
        
        FlightResultsPage resultsPage = new FlightResultsPage(driver);
        
        

//        boolean result = resultsPage.verifyFlightResults();
//
//        Assert.assertTrue(result, "Flight results are not displayed");
=======
        searchPage.closeLoginPopup();     
     

        searchPage.enterFromCity("BHO - Bhopal, IN");
        searchPage.enterTOCity("Pune");          
    
        searchPage.selectDepartureDateAndSearch();        
        
        FlightResultsPage resultsPage = new FlightResultsPage(driver);

        boolean result = resultsPage.verifyFlightResults();

        Assert.assertTrue(result, "Flight results are not displayed");
>>>>>>> 498f51ad549460dd375a49046f6de228d0ecc53c
    

    }

}