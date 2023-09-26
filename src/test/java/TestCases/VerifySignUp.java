package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.CommonMethods;
import Resources.Constant;
import Resources.baseClass;
import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignUpPageObjects;

public class VerifySignUp extends baseClass {
	@Test
	public void signup() throws IOException, InterruptedException {

		


		  LoginPageObjects LPO=new LoginPageObjects(driver);
		  
		  LPO.ClickOnTryForFree().click();
		  
		  SignUpPageObjects SPO=new SignUpPageObjects(driver);
		  Thread.sleep(5000);
		  
		  SPO.firstname().sendKeys(Constant.firstname);
		  SPO.lastname().sendKeys(Constant.lastname);
		  
		  
		  

		  CommonMethods.handleDropdown(SPO.SelectEmployee(), 1);
		  
		  
		  //CommonMethods.handleDropdown(SPO.jobtitle(), 6);
		  
		  
		  
		  
		  

	}

}
