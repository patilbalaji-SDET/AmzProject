package utility;

import java.nio.file.Paths;
import java.util.Date;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ListenersLogic implements ITestListener{

	
   public static Playwright playwright; 
   public static Browser browser;
   public static BrowserContext browsercontext;
   public static Page page;
   
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		//Logic should start from here
		//System.out.println("I am Listening Test Case is Pass");
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		String format = d2.toString();
		String dateformat = format.replace(":", "");
		page.screenshot(new Page.ScreenshotOptions().setPath(
				Paths.get("C:\\Users\\Om computers\\eclipse-workspace\\AmzProject\\test-output\\screenshot\\Pass\\"+result.getName() + dateformat + " +.png")));

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		//Logic should start from here
		//System.out.println("I am Listening Test Case is Failed");
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		String format = d2.toString();
		String dateformat = format.replace(":", "");
		page.screenshot(new Page.ScreenshotOptions().setPath(
				Paths.get("C:\\Users\\Om computers\\eclipse-workspace\\AmzProject\\test-output\\screenshot\\Failed\\"+result.getName() + dateformat + " +.png")));

	}

	

}
