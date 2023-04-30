package testcases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class saudiTestCases {
	public static WebDriver driver ;
	Variables v = new Variables();
	String saudiNumber ="5555555";
	String email = "seifelmosalamy@gmail.com";
	String password ="123456";
	
@BeforeMethod
  public void initDriver() {
    	System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
    	driver= new EdgeDriver();
    	//Creating an object of EdgeDriver
    	driver.manage().window().maximize();

    	//Deleting all the cookies
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	//launching the specified URL
    	driver.get("https://www.stctv.com/sa-ar");
  }
   @Test
  public void saudiArabia_litePackageType_assertion() throws Exception {
//    	initDriver();
    	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
    	mobilenumber.sendKeys(saudiNumber);
    	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiforType.png") ;
    	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
    	checkpackages.click();
    	WebElement litePackage = driver.findElement(By.xpath(v.litePackage));
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
    	System.out.println(litePackage.getText().trim());
    	org.testng.Assert.assertEquals( litePackage.getText().trim(),"لايت");
    	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForType.png") ;
    	
  }
    @Test
  public void saudiArabia_litePackagePrice_assertion() throws Exception {
    	//initDriver();
    	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
    	mobilenumber.sendKeys(saudiNumber);
    	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiForPrice.png") ;
    	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
    	checkpackages.click();
    	WebElement litePrice = driver.findElement(By.xpath(v.litePrice));
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
    	System.out.println(litePrice.getText().trim());
    	org.testng.Assert.assertEquals(litePrice.getText().trim(),"15");
    	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForPrice.png") ;
    	
  }
    @Test
    public void saudiArabia_mainPackageType_assertion() throws Exception {
      //	initDriver();
      	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
      	mobilenumber.sendKeys(saudiNumber);
      	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiforTypeMainPackage.png") ;
      	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
      	checkpackages.click();
      	WebElement mainPackage = driver.findElement(By.xpath(v.mainPackage));
      	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
      	System.out.println(mainPackage.getText().trim());
      	org.testng.Assert.assertEquals( mainPackage.getText().trim(),"الأساسية");
      	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForTypeMainPackage.png") ;
      	
    }
      @Test
    public void saudiArabia_mainPackagePrice_assertion() throws Exception {
      //	initDriver();
      	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
      	mobilenumber.sendKeys(saudiNumber);
      	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiForPriceMainPackage.png") ;
      	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
      	checkpackages.click();
      	WebElement mainPrice = driver.findElement(By.xpath(v.mainPrice));
      	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
      	System.out.println(mainPrice.getText().trim());
      	org.testng.Assert.assertEquals(mainPrice.getText().trim(),"25");
      	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForPriceMainPackage.png") ;
      	
    }
      @Test
      public void saudiArabia_premiumPackageType_assertion() throws Exception {
        //	initDriver();
        	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
        	mobilenumber.sendKeys(saudiNumber);
        	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiforTypePremiumPackage.png") ;
        	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
        	checkpackages.click();
        	WebElement premiumPackage = driver.findElement(By.xpath(v.premiumPackage));
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
        	System.out.println(premiumPackage.getText().trim());
        	org.testng.Assert.assertEquals( premiumPackage.getText().trim(),"بريميوم");
        	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForTypePremiumPackage.png") ;
        	
      }
        @Test
      public void saudiArabia_premiumPackagePrice_assertion() throws Exception {
        //	initDriver();
        	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
        	mobilenumber.sendKeys(saudiNumber);
        	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiForPricePremiumPackage.png") ;
        	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
        	checkpackages.click();
        	WebElement premiumPrice = driver.findElement(By.xpath(v.premiumPrice));
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
        	System.out.println(premiumPrice.getText().trim());
        	org.testng.Assert.assertEquals(premiumPrice.getText().trim(),"60");
        	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForPricePremiumPackage.png");
        	
      }
        
        @Test
        public void saudiArabia_Currency_assertion() throws Exception {
          //	initDriver();
          	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
          	mobilenumber.sendKeys(saudiNumber);
          	Utils.takeSnapShot(driver, "saudiScreenshots\\loggingInSaudiforTypePremiumPackage.png") ;
          	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
          	checkpackages.click();
          	WebElement saudiCurrency = driver.findElement(By.xpath(v.saudiCurrency));
          	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);          
          	int index = saudiCurrency.getText().trim().indexOf("/");
          	String output = saudiCurrency.getText().trim().substring(0, index);
          	System.out.println(output);
          	org.testng.Assert.assertEquals(output.trim(),"ريال سعودي");
          	Utils.takeSnapShot(driver, "saudiScreenshots\\saudiPackagesForTypePremiumPackage.png") ;
          	
        }
    

      
          

  @AfterMethod
  public void tearDown() {
	 
	  driver.close();	
  }

  
  
}
