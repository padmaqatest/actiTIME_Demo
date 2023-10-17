package com.actitime.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeLoginPage extends BasePage implements AutoConstant
{
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public ActitimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException
	{
		visibilityOfElement(driver, usernameTextfield);
		javascriptHighlight(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getstringcellValue(login_data_sheetname, 1, 0));
		
		visibilityOfElement(driver, passwordTextfield);
		javascriptHighlight(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getstringcellValue(login_data_sheetname, 1, 1));
		
		visibilityOfElement(driver, keepmeloggedinCheckbox);
		javascriptHighlight(driver, keepmeloggedinCheckbox);
		javascriptClick(driver, keepmeloggedinCheckbox);
		
		visibilityOfElement(driver, loginButton);
		javascriptHighlight(driver, loginButton);
		javascriptClick(driver, loginButton);
	}
}