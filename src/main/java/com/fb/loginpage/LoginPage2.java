package com.fb.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.lib.qa.TesBase;

public class LoginPage2 extends TesBase {
	

	@FindBy(xpath = "xpathoftheelement")
	WebElement username;

	@FindBy(id = "idvalue")
	WebElement password;

	@FindBy(name = "")
	WebElement loginButton;
	
	@FindBy(how=How.XPATH,using="")
	WebElement signupbtn;

	public LoginPage2() {
		PageFactory.initElements(driver, this);

	}

	public void loginfb() {
		username.sendKeys("Anujsharma.sv");
		password.sendKeys("AnujSharma.sv");
		loginButton.click();
	}

}
