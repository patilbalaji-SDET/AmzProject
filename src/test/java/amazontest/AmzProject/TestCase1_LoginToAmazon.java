package amazontest.AmzProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.BaseTest;

@Listeners(utility.ListenersLogic.class)
public class TestCase1_LoginToAmazon extends BaseTest {

	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void VerifyLogin() {
		HomePage homepage = new HomePage(page);
		homepage.hoverOverOnAccountAndList();
		
		page.waitForTimeout(1000);
		homepage.clickOnSign();

		LoginPage loginpage = new LoginPage(page);

		loginpage.enterusername("patilsagar8087@gmail.com");
		loginpage.clickcontioue();
		loginpage.enterpassword("Amazon@8087");
		page.waitForTimeout(2000);
		loginpage.signinsubmit();

	}

}
