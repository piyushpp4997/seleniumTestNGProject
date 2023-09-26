package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.CommonMethods;
import Resources.Constant;
import Resources.baseClass;
import pageObjectModel.LoginPageObjects;

public class VerifyLogin extends baseClass {

	@Test
	public void login() throws IOException {
		/*
		 * This below code is in @before method 
		 * initializeDriver() ;
		 * driver.get("https://login.salesforce.com/"); //This driver is not null- its
		 * having scope
		 */

		LoginPageObjects LPO = new LoginPageObjects(driver);

		LPO.enterUsername().sendKeys(Constant.username);
		LPO.enterPassword().sendKeys(Constant.password);
		LPO.clickLogin().click();

		String actualText = LPO.errorText().getText();
		String expctedText = Constant.loginExpectedMessage;

		CommonMethods.handleAssertions(actualText, expctedText, "error message is not valid");

		// String privacyActualText=LPO.privacyText().getText();

		// String privacyExpctedText="Privacy";

		// CommonMethods.handleAssertions(privacyActualText,privacyExpctedText ,
		// "privayc text is not showing on screen");

		// CommonMethodns.handlseeAssertion(s.getFirstSelectedOption().getText(),
		// "Option2","dd")

	}

	@Test
	public void Invalidlogin() throws IOException {

		
		LoginPageObjects LPO = new LoginPageObjects(driver);

		LPO.enterUsername().sendKeys(Constant.username);
		LPO.enterPassword().sendKeys(Constant.password);
		LPO.clickLogin().click();

	}

}
