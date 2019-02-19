package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.LoginPage;

public class TestValidLogin extends LoginPage{

	public TestValidLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		LoginPage l1=new LoginPage(driver);
		l1.SetUn("admin");
		l1.SetPwd("manager");
		l1.ClickLogin();
	}
}



	
	
	
