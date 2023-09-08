package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Loginpage {
	       //Declaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTF;

	//address of password text field
	@FindBy(id="pass")
	private WebElement passwordTF;
	
	//address of login text field
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginBtn;
	
	       //Initialization
	public Fb_Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
          //Utilization
	public void emailTextField(String value)
	{
		emailTF.sendKeys(value);
	}
	
	public void passwordTextField(String value)
	{
		passwordTF.sendKeys(value);
	}
	
	public void loginButton()
	{
		loginBtn.click();
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public void setEmailTF(WebElement emailTF) {
		this.emailTF = emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public void setPasswordTF(WebElement passwordTF) {
		this.passwordTF = passwordTF;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	//getter and setter method
	
}
