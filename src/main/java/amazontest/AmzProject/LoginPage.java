package amazontest.AmzProject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {

	Page page;
	private Locator enterusername;
	private Locator continuebutton;
	private Locator enterpassword;
	private Locator accountAndList;
	private Locator signinsubmit;
	private Locator signin;

	public LoginPage(Page page) {
		this.page = page;
		accountAndList = page.locator("//span[@class='nav-line-2 ']");
		signin = page.locator("#nav-flyout-ya-signin");
		enterusername = page.locator("//input[@type='text']");
		continuebutton = page.locator("//input[@type='submit']");
		enterpassword = page.locator("//input[@type='password']");
		signinsubmit = page.locator("#signInSubmit");

	}

	public void hoverOverOnAccountAndList() {
		accountAndList.hover();
	}

	public void clicksignin() {
		signin.click();
	}

	public void enterusername(String UN) {
		enterusername.fill(UN);
	}

	public void clickcontioue() {
		continuebutton.click();
	}

	public void enterpassword(String pwd) {
		enterpassword.fill(pwd);
	}

	public void signinsubmit() {
		signinsubmit.click();
	}

}
