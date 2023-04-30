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


public class kuwaitTestCases {
	public static WebDriver driver ;
	Variables v = new Variables();
	String kuwaitNumber ="5555555";
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
    	driver.get("https://www.stctv.com/kw-ar");
  }

	  @Test
      public void kuwait_litePackageType_assertion() throws Exception {
//        	initDriver();
        	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
        	mobilenumber.sendKeys(email);
        	WebElement password2 = driver.findElement(By.xpath(v.password));
        	password2.sendKeys(password);
        	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInkuwaitforType.png") ;
        	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
        	checkpackages.click();
        	WebElement litePackage = driver.findElement(By.xpath(v.litePackage));
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
        	System.out.println(litePackage.getText().trim());
        	org.testng.Assert.assertEquals( litePackage.getText().trim(),"لايت");
        	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForType.png") ;
        	
      }
        @Test
      public void kuwait_litePackagePrice_assertion() throws Exception {
        	//initDriver();
        	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
        	mobilenumber.sendKeys(kuwaitNumber);
        	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInkuwaitForPrice.png") ;
        	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
        	checkpackages.click();
        	WebElement litePrice = driver.findElement(By.xpath(v.litePrice));
        	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
        	System.out.println(litePrice.getText().trim());
        	org.testng.Assert.assertEquals(litePrice.getText().trim(),"1.2");
        	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForPrice.png") ;
        	
      }
        @Test
        public void kuwait_mainPackageType_assertion() throws Exception {
          //	initDriver();
          	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
          	mobilenumber.sendKeys(kuwaitNumber);
          	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInkuwaitforTypeMainPackage.png") ;
          	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
          	checkpackages.click();
          	WebElement mainPackage = driver.findElement(By.xpath(v.mainPackage));
          	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
          	System.out.println(mainPackage.getText().trim());
          	org.testng.Assert.assertEquals( mainPackage.getText().trim(),"الأساسية");
          	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForTypeMainPackage.png") ;
          	
        }
          @Test
        public void kuwait_mainPackagePrice_assertion() throws Exception {
          //	initDriver();
          	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
          	mobilenumber.sendKeys(kuwaitNumber);
          	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInkuwaitForPriceMainPackage.png") ;
          	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
          	checkpackages.click();
          	WebElement mainPrice = driver.findElement(By.xpath(v.mainPrice));
          	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
          	System.out.println(mainPrice.getText().trim());
          	org.testng.Assert.assertEquals(mainPrice.getText().trim(),"2.5");
          	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForPriceMainPackage.png") ;
          	
        }
          @Test
          public void kuwait_premiumPackageType_assertion() throws Exception {
            //	initDriver();
            	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
            	mobilenumber.sendKeys(kuwaitNumber);
            	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInKuwaitforTypePremiumPackage.png") ;
            	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
            	checkpackages.click();
            	WebElement premiumPackage = driver.findElement(By.xpath(v.premiumPackage));
            	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
            	System.out.println(premiumPackage.getText().trim());
            	org.testng.Assert.assertEquals( premiumPackage.getText().trim(),"بريميوم");
            	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForTypePremiumPackage.png") ;
            	
          }
            @Test
          public void kuwait_premiumPackagePrice_assertion() throws Exception {
            //	initDriver();
            	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
            	mobilenumber.sendKeys(kuwaitNumber);
            	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInKuwaitForPricePremiumPackage.png") ;
            	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
            	checkpackages.click();
            	WebElement premiumPrice = driver.findElement(By.xpath(v.premiumPrice));
            	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);
            	System.out.println(premiumPrice.getText().trim());
            	org.testng.Assert.assertEquals(premiumPrice.getText().trim(),"4.8");
            	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForPricePremiumPackage.png");
            	
          }
            
            @Test
            public void kuwait_Currency_assertion() throws Exception {
              //	initDriver();
              	WebElement mobilenumber = driver.findElement(By.xpath(v.mobilenumber));
              	mobilenumber.sendKeys(kuwaitNumber);
              	Utils.takeSnapShot(driver, "kuwaitScreenshots\\loggingInKuwaitforTypePremiumPackage.png") ;
              	WebElement checkpackages = driver.findElement(By.xpath(v.checkPackagesButton));
              	checkpackages.click();
              	WebElement kuwaitCurrency = driver.findElement(By.xpath(v.kuwaitCurrency));
              	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(v.litePackage);          
              	int index = kuwaitCurrency.getText().trim().indexOf("/");
              	String output = kuwaitCurrency.getText().trim().substring(0, index);
              	System.out.println(output);
              	org.testng.Assert.assertEquals(output.trim(),"دينار كويتي");
              	Utils.takeSnapShot(driver, "kuwaitScreenshots\\kuwaitPackagesForTypePremiumPackage.png") ;
              	
            }
            
            

            @AfterMethod
            public void tearDown() {
          	 
          	  driver.close();	
            }

}
