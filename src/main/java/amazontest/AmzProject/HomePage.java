package amazontest.AmzProject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {

	Page page;
	Locator accountAndList;
	Locator signin;
	Locator signinsubmit;
	Locator signout;

	public HomePage(Page page) {
		this.page = page;
		accountAndList = page.locator("//span[@class='nav-line-2 ']");
		signin = page.locator("#nav-flyout-ya-signin");
		signout=page.locator("#nav-item-signout");
		
	}

	public void hoverOverOnAccountAndList() {
		accountAndList.hover();
	}

	public void clickOnSign() {
		signin.click();
	}

	public void signinsubmit() {
		signinsubmit.click();
	}
	public void signout() {
		signout.click();
	}


}
