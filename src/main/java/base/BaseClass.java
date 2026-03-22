package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utility.ConfigReader;

public abstract  class BaseClass {

  public  static WebDriver driver;
  public static ExtentReports extent;
   public static ExtentTest test;

   // ---------- START REPORT ----------
   @BeforeSuite
   public void startReport() {
	    ConfigReader.loadConfig();   // FIRST load config file


       ExtentSparkReporter spark =
               new ExtentSparkReporter("reports/ExtentReport.html");

       extent = new ExtentReports();
       extent.attachReporter(spark);


       extent.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
       extent.setSystemInfo("Project", "Automation Framework");
   }

   // ---------- SETUP BROWSER ----------
   @BeforeMethod
   public void setUp() {

       String browser = ConfigReader.getProperty("browser");

       if(browser.equalsIgnoreCase("edge")) {
     
           driver = new EdgeDriver();
       }

       else if(browser.equalsIgnoreCase("chrome")) {
           driver = new ChromeDriver();
       }
       
       else if(browser.equalsIgnoreCase("firefox")) {
           driver = new FirefoxDriver();
       }
       
       else {
           throw new RuntimeException("Browser not supported: " + browser);
       }
       
       driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(
               Duration.ofSeconds(
                       Integer.parseInt(ConfigReader.getProperty("timeout"))
               )
       );

       driver.get(ConfigReader.getProperty("url"));

       test = extent.createTest("Test Execution");
       test.info("Browser launched and website opened");
   }

   // ---------- CLOSE BROWSER ----------
   @AfterMethod
   public void tearDown() {

     //  driver.close();
       test.info("Browser closed");
   }

   // ---------- END REPORT ----------
   @AfterSuite
   public void endReport() {

       extent.flush();
   }
}