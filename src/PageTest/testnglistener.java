package PageTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testnglistener implements ITestListener{
	WebDriver driver = Baseclass.driver;
	@Override
    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
		System.out.println("Testcase Started");
        
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
    	System.out.println("Testcase Passed");
        
    }
    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub
       
    	TakesScreenshot TsObj = (TakesScreenshot) driver;
        File myFile = TsObj.getScreenshotAs(OutputType.FILE);
        
        try {
            FileUtils.copyFile(myFile, new File("test.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        
    }

}
