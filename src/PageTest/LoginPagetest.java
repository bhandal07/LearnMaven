package PageTest;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


import Page.LoginPage;

@Listeners(testnglistener.class)

public class LoginPagetest extends Baseclass {

	@Test
	
	
	public void LoginPass()
	{
		LoginPage Loginobj=  new LoginPage();
		
		   String uname = sheet.getRow(1).getCell(0).getStringCellValue();
	        String pword = sheet.getRow(1).getCell(1).getStringCellValue();
		 Loginobj.LoginPass(uname,pword);
	}

}
