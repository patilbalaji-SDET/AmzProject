package utility;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

public class BaseTest  extends ListenersLogic{
	
	@Parameters("engine")
	@BeforeMethod
	public void launch(String nameOfEngine) {
		if (nameOfEngine.equals("chromium")) {
			playwright = Playwright.create();
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			browsercontext = browser.newContext();
			page = browsercontext.newPage();
			page.navigate("https://www.amazon.in");
		}
		if (nameOfEngine.equals("webkit")) {
			playwright = Playwright.create();
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			browsercontext = browser.newContext();
			page = browsercontext.newPage();
			page.navigate("https://www.amazon.in");
		}
		if (nameOfEngine.equals("firefox")) {
			playwright = Playwright.create();
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			browsercontext = browser.newContext();
			page = browsercontext.newPage();
			page.navigate("https://www.amazon.in");
		}

	}

	@AfterMethod
	public void quit() {

		browser.close();
	}
}