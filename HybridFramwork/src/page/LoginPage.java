package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement unTb;
	
	@FindBy(name="pwd")
	private WebElement pwdTb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void SetUn(String un){
		unTb.sendKeys("un");
	}
	
	public void SetPwd(String pwd){
		pwdTb.sendKeys("pwd");
	}
	
	public void ClickLogin(){
		loginBtn.click();
	}

}
