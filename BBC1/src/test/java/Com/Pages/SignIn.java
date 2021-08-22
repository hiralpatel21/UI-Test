package Com.Pages;

import java.util.Map;

import Com.Constants.SignInConst;
import Com.Driver.Action;
import Com.Runner.BaseClass;
import cucumber.api.DataTable;

public class SignIn extends BaseClass {
	public void verifySignin() throws InterruptedException {
		Action.ClickOnButton(SignInConst.SIGNIN);
		Thread.sleep(2000);
	}
	public void LoginEmail(DataTable login) throws InterruptedException {
		Map<String,String> UserLogin= login.asMap(String.class, String.class);
		   
		   String Email=UserLogin.get("email");
		   String Password=UserLogin.get("password");
		Action.EnterDetails(SignInConst.EMAIL, Email);
		Thread.sleep(1000);
		Action.EnterDetails(SignInConst.PASSWORD, Password);
		Thread.sleep(1000);
	}	
	public void verifySigninButton() throws InterruptedException {
		Action.ClickOnButton(SignInConst.SIGNINBUTTON);
		Thread.sleep(2000);
	}
}
