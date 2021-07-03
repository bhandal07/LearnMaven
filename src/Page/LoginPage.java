package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import PageTest.LoginPagetest;


public class LoginPage {
	
	WebDriver driver;
	ExtentReports Reports;
	ExtentTest test;
	
	
	//---WebElement------//
	
			@FindBy(linkText="Log in")
		    WebElement Loginlink;
		    
		    @FindBy(name="user_login")
		    WebElement userName;
		    
		    @FindBy(id="password")
		    WebElement Password;
		    
		    @FindBy(className="rememberMe")
		    WebElement Rememberme;
		    
		    @FindBy(name="btn_login")
		    WebElement Login;
		  
		    @FindBy(id="msg_box")
			WebElement Error;
		    
    //-------Constructor-------/
		    public LoginPage() {
		    	driver = LoginPagetest.driver;
				Reports = LoginPagetest.Reports;
				test = LoginPagetest.test;
				
				PageFactory.initElements(driver, this);
		    }
		    
  //------Method-------///
	
	
	public void LoginPass(String uname,String pword)
	{
	
		test = Reports.startTest("Logintestcase");
		
       // WebElement Loginlink = driver.findElement(By.linkText("Log in"));
        Loginlink.click();
        
        test.log(LogStatus.PASS, "Successfully clicked on the login button");
        
       // WebElement username = driver.findElement(By.name("user_login"));
        userName.sendKeys(uname);
        
        test.log(LogStatus.PASS, "Successfully passed the Username");
        
        //WebElement Password =driver.findElement(By.id("password"));
        Password.sendKeys(pword);
        
        test.log(LogStatus.PASS, "Successfully passed the Password");
        
        //WebElement Rememberme = driver.findElement(By.className("rememberMe"));
		
		Rememberme.click();
		
		//WebElement Login = driver.findElement(By.name("btn_login"));
		
		Login.click();
		
		test.log(LogStatus.PASS, "Successfully clicked on login link");

        
		System.out.println("Size of Window is :"+driver.manage().window().getSize());
        
        
		String ActMsg = Error.getText();
		String ExpMsg = "The email or password you have entered is invalid.";
				
		Assert.assertTrue(Error.isDisplayed());
		Assert.assertEquals(ActMsg, ExpMsg);
        
        //soft.assertEquals(ActMsg, ExpMsg);
		
		//System.out.println("After Soft Assert");
        
       /* try {
            Assert.assertEquals(ActMsg, ExpMsg);
            test.log(LogStatus.PASS, "Expected and Actual value matches");
            
        }catch(Throwable e) {
            test.log(LogStatus.FAIL, "Expected and Actual value does not match");
        }*/

		//soft.assertEquals(ActMsg, ExpMsg);
		
		//System.out.println("After Soft Assert");
        

	}

}
