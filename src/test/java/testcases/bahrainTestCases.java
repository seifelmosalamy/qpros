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


public class bahrainTestCases {
	public static WebDriver driver ;
	Variables v = new Variables();
	String bahrainNumber ="5555555";
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
    	driver.get("https://www.stctv.com/bh-ar");
  }
   @Test
  public void bahrain_litePackageType_assertion() throws Exception {
//    	initDriver();
    	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
    	mobilenumber.sendKeys(bahrainNumber);
    	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainforType.png") ;
    	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
    	checkpackages.click();
    	WebElement litePackage = driver.findElement(By.xpath(v.litePackage));
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
    	System.out.println(litePackage.getText().trim());
    	org.testng.Assert.assertEquals( litePackage.getText().trim(),"لايت");
    	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForType.png") ;
    	
  }
    @Test
  public void bahrain_litePackagePrice_assertion() throws Exception {
    	//initDriver();
    	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
    	mobilenumber.sendKeys(bahrainNumber);
    	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainForPrice.png") ;
    	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
    	checkpackages.click();
    	WebElement litePrice = driver.findElement(By.xpath(v.litePrice));
    	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
    	System.out.println(litePrice.getText().trim());
    	org.testng.Assert.assertEquals(litePrice.getText().trim(),"2");
    	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForPrice.png") ;
    	
  }
    @Test
    public void bahrain_mainPackageType_assertion() throws Exception {
      //	initDriver();
      	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
      	mobilenumber.sendKeys(bahrainNumber);
      	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainforTypeMainPackage.png") ;
      	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
      	checkpackages.click();
      	WebElement mainPackage = driver.findElement(By.xpath(v.mainPackage));
      	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
      	System.out.println(mainPackage.getText().trim());
      	org.testng.Assert.assertEquals( mainPackage.getText().trim(),"الأساسية");
      	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForTypeMainPackage.png") ;
      	
    }
      @Test
    public void bahrain_mainPackagePrice_assertion() throws Exception {
      //	initDriver();
      	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
      	mobilenumber.sendKeys(bahrainNumber);
      	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainForPriceMainPackage.png") ;
      	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
      	checkpackages.click();
      	WebElement mainPrice = driver.findElement(By.xpath(v.mainPrice));
      	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
      	System.out.println(mainPrice.getText().trim());
      	org.testng.Assert.assertEquals(mainPrice.getText().trim(),"3");
      	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForPriceMainPackage.png") ;
      	
    }
      @Test
      public void bahrain_premiumPackageType_assertion() throws Exception {
        //	initDriver();
        	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
        	mobilenumber.sendKeys(bahrainNumber);
        	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainforTypePremiumPackage.png") ;
        	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
        	checkpackages.click();
        	WebElement premiumPackage = driver.findElement(By.xpath(v.premiumPackage));
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
        	System.out.println(premiumPackage.getText().trim());
        	org.testng.Assert.assertEquals( premiumPackage.getText().trim(),"بريميوم");
        	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForTypePremiumPackage.png") ;
        	
      }
        @Test
      public void bahrain_premiumPackagePrice_assertion() throws Exception {
        //	initDriver();
        	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
        	mobilenumber.sendKeys(bahrainNumber);
        	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainForPricePremiumPackage.png") ;
        	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
        	checkpackages.click();
        	WebElement premiumPrice = driver.findElement(By.xpath(v.premiumPrice));
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
        	System.out.println(premiumPrice.getText().trim());
        	org.testng.Assert.assertEquals(premiumPrice.getText().trim(),"6");
        	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForPricePremiumPackage.png");
        	
      }
        
        @Test
        public void bahrain_Currency_assertion() throws Exception {
          //	initDriver();
          	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
          	mobilenumber.sendKeys(bahrainNumber);
          	Utils.takeSnapShot(driver, "bahrainScreenshots\\loggingInbahrainforTypePremiumPackage.png") ;
          	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
          	checkpackages.click();
          	WebElement bahrainCurrency = driver.findElement(By.xpath(v.bahrainCurrency));
          	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);          
          	int index = bahrainCurrency.getText().trim().indexOf("/");
          	String output = bahrainCurrency.getText().trim().substring(0, index);
          	System.out.println(output);
          	org.testng.Assert.assertEquals(output.trim(),"دينار بحريني");
          	Utils.takeSnapShot(driver, "bahrainScreenshots\\bahrainPackagesForTypePremiumPackage.png") ;
          	
        }
    

      
          

  @AfterMethod
  public void tearDown() {
	 
	  driver.close();	
  }

  
  
}
