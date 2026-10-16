package amazontest.AmzProject;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

import utility.BaseTest;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@Listeners(utility.ListenersLogic.class)
public class TestCase2_LoginToAmazonandLogout extends BaseTest {
	@Test
	public void VerifyLoginAndLogout() {
		HomePage homepage = new HomePage(page);
		homepage.hoverOverOnAccountAndList();
		homepage.clickOnSign();

		LoginPage loginpage = new LoginPage(page);
		loginpage.enterusername("patilsagar8087@gmail.com");
		loginpage.clickcontioue();
		page.waitForTimeout(5000);
		loginpage.enterpassword("Amazon@8087");
		page.waitForTimeout(5000);
		loginpage.signinsubmit();
		Locator sreachtext = page.getByLabel("Search Amazon.in");
		assertThat(sreachtext).isVisible();
		page.waitForTimeout(5000);
		homepage.hoverOverOnAccountAndList();
		homepage.signout();
		assertThat(page).hasTitle("Sign in");

	}
}
