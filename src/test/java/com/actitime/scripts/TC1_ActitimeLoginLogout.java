package com.actitime.scripts;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseTest;
import com.actitime.pages.ActitimeHomePage;
import com.actitime.pages.ActitimeLoginPage;

@Listeners(com.actitime.generics.ScreenshotPage.class)
public class TC1_ActitimeLoginLogout extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		ActitimeLoginPage loginPage=new ActitimeLoginPage(driver);
		loginPage.loginMethod();
	}
	
	@Test (dependsOnMethods = "login")
	public void logout() throws InterruptedException, IOException
	{
		ActitimeHomePage homePage=new ActitimeHomePage(driver);
		homePage.logoutMethod();
	}
}